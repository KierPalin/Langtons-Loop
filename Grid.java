import java.awt.*;
import javax.swing.JPanel;


/**
 * Grid of Cells that the Automaton operates on.
 * .updateGrid() is called to invoke the specified transition rules on each cell in the grid 
 * 
 * See definition of the Cell class below this one. 
 */
public class Grid extends JPanel {
    private static final int SQUARE_SIZE = 8;

    private int height, width;
    private Cell[][] cells;
    private RuleSet rules;

    public Grid(RuleSet rules, int height, int width) {
        this.height = height;
        this.width = width;
        this.rules = rules;
        this.setCells();
    }


    /**
     * Set the grid to its default configuration
     */
    private void setCells() {
        this.cells = new Cell[this.height][this.width];

        // All black:
        for (int x = 0; x < this.height; x++) {
            for (int y = 0; y < this.width; y++) {
                this.cells[x][y] = new Cell(0, x, y);
            }
        }

        // Load default "original" loop:
        for (Cell[] row : this.rules.getOriginalLoop(25, 25)) {
            for (Cell cell : row) {
                this.cells[cell.getX()][cell.getY()] = cell;
            }
        }
    }

    /**
     * Form a new grid of cells by changing each cell in accordance to this.rules & this.getState()
     */
    public void updateGrid() {
        Cell[][] newCells = new Cell[height][width];
        String state = "";

        for (int x = 0; x < this.height; x++) {
            for (int y = 0; y < this.width; y++) {    
                try {
                    state = this.getState(x, y);
                    newCells[x][y] = new Cell(this.rules.getColourIndex(state), x, y);
                } catch (Exception e) {}
            }
        }
        this.cells = newCells;
    }


    /**
     * Used soley by .updateGrid()
     * @param x pixel coord
     * @param y pixel coord
     * @return A string representing the surrounding colours of the pixel in the form Centre, Top, Right, Bot, Left
     */
    private String getState(int x, int y) {
        String state = "";
        
        // CTRBL
        for (int[] delta : new int[][] {{0, 0}, {0, -1}, {1, 0}, {0, 1}, {-1, 0}}) {
            if (((0 <= x + delta[0])) && (this.height > x + delta[0]) && ((0 <= y + delta[1])) && (this.width > y + delta[1])) {
                state += "" + this.cells[x + delta[0]][y + delta[1]].getColourIndex();
            }

            else {
                state += "0";
            }
        }
        return state;
    }

    /**
     * Draws square with length SQUARE_SIZE
     * Gets the colour for the square via this.rules[x][y]
     * @param g state of the screen
     * @param x pixel coord
     * @param y pixel coord
     */
    private void drawSquare(Graphics g, int x, int y) {
        g.setColor(this.rules.getColour(cells[x][y].getColourIndex()));
        g.fillRect(x * Grid.SQUARE_SIZE, y * Grid.SQUARE_SIZE, Grid.SQUARE_SIZE, Grid.SQUARE_SIZE);
    }

    @Override
    public void paint(Graphics g) {
        for (int x = 0; x < this.height; x++) {
            for (int y = 0; y < this.width; y++) {
                this.drawSquare(g, x, y);
            }
        }
    }
}

class Cell {
	private int colourIndex, x, y;

	public Cell(int colourIndex, int x, int y) {
		this.colourIndex = colourIndex;
		this.x = x;
		this.y = y;
	}

	public int getColourIndex() {return this.colourIndex;}
	public int getX() {return this.x;}
	public int getY() {return this.y;}
}