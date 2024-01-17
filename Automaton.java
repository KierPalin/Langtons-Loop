import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.concurrent.TimeUnit;


public class Automaton extends JFrame {
	private final Grid grid;
	private final long delayQuantityMS = 125;

	public Automaton(int epochs, RuleSet rules) {
		this.setBounds(0, 0, 640, 702);
		this.grid = new Grid(rules, 512, 512);
		this.getContentPane().add((JPanel) this.grid);

        this.setTitle("Langtons Loop");
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
	}	

	public void simulate() {
		try {
			while (true) {
				this.grid.updateGrid();
				this.paint(this.getGraphics());
				TimeUnit.MILLISECONDS.sleep(this.delayQuantityMS);
			}
		} catch (Exception e) {}
	}


	public static void main(String[] args) {
		Automaton automaton = new Automaton(400, new LangtonsLoop());
		automaton.simulate();
	}
}