import java.util.HashMap;
import java.awt.Color;


public class BylsLoop extends RuleSet {
	public BylsLoop() {
		// Create hashmap & define colours used in transition table:
		super(new HashMap<String, Integer>(), new Color[] {Color.black, Color.blue, Color.red, Color.green, Color.yellow, Color.pink});

		// Populate primary rules:
		this.addRule("00000", 0);

        this.addRule("00003", 1);
        this.addRule("10000", 0);
        this.addRule("20000", 0);
        this.addRule("30001", 0);
        this.addRule("40003", 5);
        this.addRule("50001", 0);
        
        this.addRule("00012",2);
        this.addRule("10001",0);
        this.addRule("20015",5);
        this.addRule("30003",0);
        this.addRule("40022",5);
        this.addRule("50022",5);
        
        this.addRule("00013", 1);
        this.addRule("10004", 0);
        this.addRule("20022", 0);
        this.addRule("30011", 0);
        this.addRule("40035", 2);
        this.addRule("50032", 5);
        
        this.addRule("00015", 4); 
        this.addRule("10033", 0); 
        this.addRule("20035", 5); 
        this.addRule("30235", 3); 
        this.addRule("40043", 4); 
        this.addRule("50122", 5);

        this.addRule("00025", 4); 
        this.addRule("10043", 1); 
        this.addRule("20202", 0); 

        this.addRule("30235", 3); 
        this.addRule("40043", 4); 
        this.addRule("50122", 5);
        this.addRule("40212", 4); 
        this.addRule("50222", 0);

        this.addRule("00031", 5);
        this.addRule("10325", 5);
        this.addRule("20215", 5);
        this.addRule("40232", 4);
        this.addRule("50244", 5);

        this.addRule("00032", 3);
        this.addRule("10421", 4);
        this.addRule("20235", 5);
        this.addRule("40242", 4);
        this.addRule("50322", 5);

        this.addRule("00042", 2);
        this.addRule("10423", 4);
        this.addRule("20252", 5);
        this.addRule("40252", 0);
        this.addRule("50412", 4);

        this.addRule("00121", 1);
        this.addRule("10424", 4);
        this.addRule("40325", 5);
        this.addRule("50422", 0);

        this.addRule("00204", 2);
        this.addRule("11142", 4);
        this.addRule("41452", 5);

        this.addRule("00324", 3);
        this.addRule("11423", 4);

        this.addRule("00422", 2);
        this.addRule("12234", 4);

        this.addRule("00532", 3);
        this.addRule("12334", 4);
        this.addRule("12443", 4);


        this.addRule("30241", 5);
        this.addRule("31231", 5);

        // Rotate all of the above rules and add them to the rulebook also:
		this.addRotatedRules();


        // this.addRule("30200", 5);
        // this.addRule("30201", 5);
        // this.addRule("30202", 5);
        // this.addRule("30203", 5);
        // this.addRule("30204", 5);
        // this.addRule("30205", 5);

        // this.addRule("30210", 5);
        // this.addRule("30221", 5);
        // this.addRule("30232", 5);
        // this.addRule("30243", 5);
        // this.addRule("30254", 5);
        // this.addRule("30265", 5);


        // this.addRule("31200", 5);

        // this.addRule("31200", 5);
        // this.addRule("31201", 5);
        // this.addRule("31202", 5);
        // this.addRule("31203", 5);
        // this.addRule("31204", 5);
        // this.addRule("31205", 5);

        // this.addRule("31210", 5);
        // this.addRule("31221", 5);
        // this.addRule("31232", 5);
        // this.addRule("31243", 5);
        // this.addRule("31254", 5);
        // this.addRule("31265", 5);
        
        // 302"
        // 312. 5
	}


    @Override
    public int getColourIndex(String state)  {
        try {
            return super.getColourIndex(state);
        } catch (Exception e) {
            // Secondary rules
            switch (state.charAt(0)) {
                // "0----" --> 0
                case '0': return 0;

                // "1----" --> 3
                case '1': return 3;

                // "2----" --> 2
                case '2': return 2;

                // "3----" --> 1
                case '3': return 1;

                // "4----" --> 1
                case '4': return 1;

                // "5----" --> 2
                case '5': return 2;
            
                default: return 0;
            }
        }
    }


	/**
	 * Default configuration of the loop
	 * @param h window height
	 * @param w window width
	 * @return 2D cell matrix for insertion onto grid
	 */
	public Cell[][] getOriginalLoop(int h, int w) {
		Cell[][] originalLoop = new Cell[4][4];

		for (int i = 0; i < 4; i++) {
			originalLoop[i] = new Cell[4];
			for (int j = 0; j < 4; j++) {
				originalLoop[i][j] = new Cell(0, h + i, w + j);
			}
		}
		
		originalLoop[0] = new Cell[] {new Cell(2, h+1, w), new Cell(2, h+2, w)};
		originalLoop[1] = new Cell[] {new Cell(2, h, w+1), new Cell(3, h+1, w+1), new Cell(1, h+2, w+1), new Cell(2, h+3, w+1)};
		originalLoop[2] = new Cell[] {new Cell(2, h, w+2), new Cell(3, h+1, w+2), new Cell(4, h+2, w+2), new Cell(2, h+3, w+2)};
		originalLoop[3] = new Cell[] {new Cell(2, h+1, w+3), new Cell(5, h+2, w+3)};
		return originalLoop;
	}
}