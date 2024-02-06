import javax.swing.JPanel;
import javax.swing.JFrame;
import java.util.concurrent.TimeUnit;


public class Automaton extends JFrame {
	private final long delayQuantityMS = 125;

	private final Grid grid;
	private int max_epochs;
	private int current_epoch;

	public Automaton(int epochs, RuleSet rules) {
		this.max_epochs = epochs;
		this.current_epoch = 0;

		this.setBounds(0, 0, 640, 702);
		this.grid = new Grid(rules, 512, 512);
		this.getContentPane().add((JPanel) this.grid);

        this.setTitle("Langtons Loop");
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
	}	

	public void simulate() {
		try {
			while (this.current_epoch < this.max_epochs) {
				this.grid.updateGrid();
				this.getContentPane().paint(this.getGraphics());
				TimeUnit.MILLISECONDS.sleep(this.delayQuantityMS);
				this.current_epoch++;
			}
		} catch (Exception e) {}
	}


	public static void main(String[] args) {
		Automaton automaton = new Automaton(Integer.parseInt(args[0]), new LangtonsLoop());
		automaton.simulate();
	}
}