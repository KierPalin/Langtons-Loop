import java.util.HashMap;
import java.awt.Color;


/**
 *	Self-replicating loop from Langton's paper:
 *	https://deepblue.lib.umich.edu/bitstream/handle/2027.42/24968/0000395.pdf?sequence=1
 *	Specifies the transition rules & colours used
 */
public class LangtonsLoop extends RuleSet {
	public LangtonsLoop() {
		// Create hashmap & define colours used in transition table:
		super(new HashMap<String, Integer>(), new Color[] {Color.black, Color.blue, Color.red, Color.green, Color.yellow, Color.pink, Color.white, Color.cyan});

		// Transition table from page 6:
		this.addRule("00000", 0);
		this.addRule("00001", 2);
		this.addRule("00002", 0); 
		this.addRule("00003", 0);
		this.addRule("00005", 0); 
		this.addRule("00006", 3);
		this.addRule("00007", 1);
		this.addRule("00011", 2);
		this.addRule("00012", 2); 
		this.addRule("00013", 2); 
		this.addRule("00021", 2); 
		this.addRule("00022", 0); 
		this.addRule("00023", 0); 
		this.addRule("00026", 2); 
		this.addRule("00027", 2); 
		this.addRule("00032", 0); 
		this.addRule("00052", 5); 
		this.addRule("00062", 2); 
		this.addRule("00072", 2); 
		this.addRule("00102", 2); 
		this.addRule("00112", 0); 
		this.addRule("00202", 0); 
		this.addRule("00203", 0); 
		this.addRule("00205", 0); 
		this.addRule("00212", 5); 
		this.addRule("00222", 0); 
		this.addRule("00232", 2); 
		this.addRule("00522", 2); 
		this.addRule("01232", 1); 
		this.addRule("01242", 1); 
		this.addRule("01252", 5); 
		this.addRule("01262", 1); 
		this.addRule("01272", 1); 
		this.addRule("01275", 1); 
		this.addRule("01422", 1); 
		this.addRule("01432", 1); 
		this.addRule("01442", 1); 
		this.addRule("01472", 1); 
		this.addRule("01625", 1); 
		this.addRule("01722", 1);
		this.addRule("01725", 5); 
		this.addRule("01752", 1); 
		this.addRule("01762", 1); 
		this.addRule("01772", 1); 

		this.addRule("02527", 1);
		this.addRule("10001", 1); 
		this.addRule("10006", 1); 
		this.addRule("10007", 7); 
		this.addRule("10011", 1); 
		this.addRule("10012", 1); 
		this.addRule("10021", 1); 
		this.addRule("10024", 4); 
		this.addRule("10027", 7); 
		this.addRule("10051", 1); 
		this.addRule("10101", 1); 
		this.addRule("10111", 1); 
		this.addRule("10124", 4); 
		this.addRule("10127", 7); 
		this.addRule("10202", 6); 
		this.addRule("10212", 1); 
		this.addRule("10221", 1); 
		this.addRule("10224", 4); 
		this.addRule("10226", 3); 
		this.addRule("10227", 7);
		this.addRule("10232", 7); 
		this.addRule("10242", 4); 
		this.addRule("10262", 6);
		this.addRule("10264", 4); 
		this.addRule("10267", 7); 
		this.addRule("10271", 0); 
		this.addRule("10272", 7); 
		this.addRule("10542", 7); 
		this.addRule("11112", 1); 
		this.addRule("11122", 1); 
		this.addRule("11124", 4); 
		this.addRule("11125", 1); 
		this.addRule("11126", 1); 
		this.addRule("11127", 7); 
		this.addRule("11152", 2); 
		this.addRule("11212", 1); 
		this.addRule("11222", 1); 
		this.addRule("11224", 4); 
		this.addRule("11225", 1); 
		this.addRule("11227", 7); 
		this.addRule("11232", 1); 
		this.addRule("11242", 4); 
		this.addRule("11262", 1); 
		this.addRule("11272", 7); 

		this.addRule("11322", 1); 
		this.addRule("12224", 4); 
		this.addRule("12227", 7); 
		this.addRule("12243", 4); 
		this.addRule("12254", 7); 
		this.addRule("12324", 4); 
		this.addRule("12327", 7); 
		this.addRule("12425", 5); 
		this.addRule("12426", 7); 
		this.addRule("12527", 5); 
		this.addRule("20001", 2); 
		this.addRule("20002", 2); 
		this.addRule("20004", 2); 
		this.addRule("20007", 1); 
		this.addRule("20012", 2); 
		this.addRule("20015", 2); 
		this.addRule("20021", 2); 
		this.addRule("20022", 2); 
		this.addRule("20023", 2); 
		this.addRule("20024", 2); 
		this.addRule("20025", 0); 
		this.addRule("20026", 2); 
		this.addRule("20027", 2); 
		this.addRule("20032", 6); 
		this.addRule("20042", 3); 
		this.addRule("20051", 7); 
		this.addRule("20052", 2); 
		this.addRule("20057", 5); 
		this.addRule("20072", 2); 
		this.addRule("20102", 2); 
		this.addRule("20112", 2); 
		this.addRule("20122", 2); 
		this.addRule("20142", 2); 
		this.addRule("20172", 2); 
		this.addRule("20202", 2); 
		this.addRule("20203", 2); 
		this.addRule("20205", 2); 
		this.addRule("20207", 3); 
		this.addRule("20212", 2); 
		this.addRule("20215", 2); 
		this.addRule("20221", 2); 
		this.addRule("20222", 2); 
		this.addRule("20227", 2); 
		this.addRule("20232", 1);

		this.addRule("20242", 2); 
		this.addRule("20245", 2); 
		this.addRule("20252", 0); 
		this.addRule("20255", 2); 
		this.addRule("20262", 2); 
		this.addRule("20272", 2); 
		this.addRule("20312", 2); 
		this.addRule("20321", 6); 
		this.addRule("20322", 6); 
		this.addRule("20342", 2); 
		this.addRule("20422", 2); 
		this.addRule("20512", 2); 
		this.addRule("20521", 2); 
		this.addRule("20522", 2); 
		this.addRule("20552", 1); 
		this.addRule("20572", 5); 
		this.addRule("20622", 2); 
		this.addRule("20672", 2); 
		this.addRule("20712", 2); 
		this.addRule("20722", 2); 
		this.addRule("20742", 2); 
		this.addRule("20772", 2); 
		this.addRule("21122", 2); 
		this.addRule("21126", 1); 
		this.addRule("21222", 2); 
		this.addRule("21224", 2); 
		this.addRule("21226", 2); 
		this.addRule("21227", 2); 
		this.addRule("21422", 2); 
		this.addRule("21522", 2); 
		this.addRule("21622", 2); 
		this.addRule("21722", 2); 
		this.addRule("22227", 2); 
		this.addRule("22244", 2); 
		this.addRule("22246", 2); 
		this.addRule("22276", 2); 
		this.addRule("22277", 2); 
		this.addRule("30001", 3); 
		this.addRule("30002", 2); 
		this.addRule("30004", 1); 
		this.addRule("30007", 6); 
		this.addRule("30012", 3); 
		this.addRule("30042", 1); 
		this.addRule("30062", 2);

		this.addRule("30102", 1);
		this.addRule("30122", 0);
		this.addRule("30251", 1);
		this.addRule("40112", 0);
		this.addRule("40122", 0);
		this.addRule("40125", 0);
		this.addRule("40212", 0);
		this.addRule("40222", 1);
		this.addRule("40232", 6);
		this.addRule("40252", 0);
		this.addRule("40322", 1);
		this.addRule("50002", 2);
		this.addRule("50021", 5);
		this.addRule("50022", 5);
		this.addRule("50023", 2);
		this.addRule("50027", 2);
		this.addRule("50052", 0);
		this.addRule("50202", 2);
		this.addRule("50212", 2);
		this.addRule("50215", 2);
		this.addRule("50222", 0);
		this.addRule("50224", 4);
		this.addRule("50272", 2);
		this.addRule("51212", 2);
		this.addRule("51222", 0);
		this.addRule("51242", 2);
		this.addRule("51272", 2);
		this.addRule("60001", 1);
		this.addRule("60002", 1);
		this.addRule("60212", 0);
		this.addRule("61212", 5);
		this.addRule("61213", 1);
		this.addRule("61222", 5);
		this.addRule("70007", 7);
		this.addRule("70112", 0);
		this.addRule("70122", 0);
		this.addRule("70125", 0);
		this.addRule("70212", 0);
		this.addRule("70222", 1);
		this.addRule("70225", 1);
		this.addRule("70232", 1);
		this.addRule("70252", 5);
		this.addRule("70272", 0);
		
		// Rotate all of the above rules and add them to the rulebook also:
		this.addRotatedRules();
	}


	/**
	 * Default configuration of the loop
	 * @param h window height
	 * @param w window width
	 * @return 2D cell matrix for insertion onto grid
	 */
	public Cell[][] getOriginalLoop(int h, int w) {
		Cell[][] originalLoop = new Cell[10][15];

		for (int i = 0; i < 10; i++) {
			originalLoop[i] = new Cell[15];
			for (int j = 0; j < 15; j++) {
				originalLoop[i][j] = new Cell(0, h + i, w + j);
			}
		}
		
		originalLoop[0] = new Cell[] {new Cell(0, h, w), new Cell(2, h+1, w), new Cell(2, h+2, w), new Cell(2, h+3, w), new Cell(2, h+4, w), new Cell(2, h+5, w), new Cell(2, h+6, w), new Cell(2, h+7, w), new Cell(2, h+8, w)};
		originalLoop[1] = new Cell[] {new Cell(2, h, w+1), new Cell(1, h+1, w+1), new Cell(7, h+2, w+1), new Cell(0, h+3, w+1), new Cell(1, h+4, w+1), new Cell(4, h+5, w+1), new Cell(0, h+6, w+1), new Cell(1, h+7, w+1), new Cell(4, h+8, w+1), new Cell(2, h+9, w+1)};
		originalLoop[2] = new Cell[] {new Cell(2, h, w+2), new Cell(0, h+1, w+2), new Cell(2, h+2, w+2), new Cell(2, h+3, w+2), new Cell(2, h+4, w+2), new Cell(2, h+5, w+2), new Cell(2, h+6, w+2), new Cell(2, h+7, w+2), new Cell(0, h+8, w+2), new Cell(2, h+9, w+2)};
		originalLoop[3] = new Cell[] {new Cell(2, h, w+3), new Cell(7, h+1, w+3), new Cell(2, h+2, w+3), new Cell(2, h+7, w+3), new Cell(1, h+8, w+3), new Cell(2, h+9, w+3)};
		originalLoop[4] = new Cell[] {new Cell(2, h, w+4), new Cell(1, h+1, w+4), new Cell(2, h+2, w+4), new Cell(2, h+7, w+4), new Cell(1, h+8, w+4), new Cell(2, h+9, w+4)};
		originalLoop[5] = new Cell[] {new Cell(2, h, w+5), new Cell(0, h+1, w+5), new Cell(2, h+2, w+5), new Cell(2, h+7, w+5), new Cell(1, h+8, w+5), new Cell(2, h+9, w+5)};
		originalLoop[6] = new Cell[] {new Cell(2, h, w+6), new Cell(7, h+1, w+6), new Cell(2, h+2, w+6), new Cell(2, h+7, w+6), new Cell(1, h+8, w+6), new Cell(2, h+9, w+6)};
		originalLoop[7] = new Cell[] {new Cell(2, h, w+7), new Cell(1, h+1, w+7), new Cell(2, h+2, w+7), new Cell(2, h+3, w+7), new Cell(2, h+4, w+7), new Cell(2, h+5, w+7), new Cell(2, h+6, w+7), new Cell(2, h+7, w+7), new Cell(1, h+8, w+7), new Cell(2, h+9, w+7), new Cell(2, h+10, w+7), new Cell(2, h+11, w+7), new Cell(2, h+12, w+7), new Cell(2, h+13, w+7)};
		originalLoop[8] = new Cell[] {new Cell(2, h, w+8), new Cell(0, h+1, w+8), new Cell(7, h+2, w+8), new Cell(1, h+3, w+8), new Cell(0, h+4, w+8), new Cell(7, h+5, w+8), new Cell(1, h+6, w+8), new Cell(0, h+7, w+8), new Cell(7, h+8, w+8), new Cell(1, h+9, w+8), new Cell(1, h+10, w+8), new Cell(1, h+11, w+8), new Cell(1, h+12, w+8), new Cell(1, h+13, w+8), new Cell(2, h+14, w+8)};
		originalLoop[9] = new Cell[] {new Cell(2, h+1, w+9), new Cell(2, h+2, w+9), new Cell(2, h+3, w+9), new Cell(2, h+4, w+9), new Cell(2, h+5, w+9), new Cell(2, h+6, w+9), new Cell(2, h+7, w+9), new Cell(2, h+8, w+9), new Cell(2, h+9, w+9), new Cell(2, h+10, w+9), new Cell(2, h+11, w+9), new Cell(2, h+12, w+9), new Cell(2, h+13, w+9)};
		return originalLoop;
	}
}