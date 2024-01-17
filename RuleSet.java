import java.util.HashMap;
import java.awt.Color;


/**
 * Abstraction of the features that a Cellular Automata RuleSet must have.
 * See LangtonsLoop.java for an implementation
 */
public abstract class RuleSet {
	private HashMap<String, Integer> rules;
	private Color[] colours;

	public RuleSet(HashMap<String, Integer> rules, Color[] colours) {
		this.rules = rules;
		this.colours = colours;
	}

	public void addRule(String state, int colourIndex) {this.rules.put(state, colourIndex);}
	public String[] getRules() {return this.rules.keySet().toArray(new String[this.rules.size()]);}

	public int getColourIndex(String state) {try {return this.rules.get(state);} catch (Exception e) {throw e;}}
	public Color getColour(int colourIndex) {return this.colours[colourIndex];}


	/**
	*	Used at the end of the transition table implementation specification.
	*	Adds the rotated versions of each state in the transition table.
	*/
	public void addRotatedRules() {
		String rotation;
		for (String rule : this.getRules()) {
			rotation = rule;
			for (int i = 0; i < 3; i++) {
				rotation = this.rotate90(rotation);
				this.addRule(rotation, this.getColourIndex(rule));
			}
		}
	}

	/**
	 *	Used by .addRotatedRules() public method
	 */
	private String rotate90(String state) {
		char[] rotated = new char[state.length()];
		rotated[0] = state.charAt(0);
		char tmp = state.charAt(4);

		// CTRBL -> CLTRB 
		for (int i = 1; i < 4; i++) {
			rotated[i + 1] = state.charAt(i);
		}
		rotated[1] = tmp;
		return new String(rotated);
	}


	public abstract Cell[][] getOriginalLoop(int height, int width);
}