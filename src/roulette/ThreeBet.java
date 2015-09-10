package roulette;

import util.ConsoleReader;

public class ThreeBet extends Bet {
    private String myDescription = "Three in a Row";
    private int myOdds;
    
    public ThreeBet(int odds){
    	myOdds = odds;
    }
    
    public String getDescription() {
    	return myDescription;
    }
    
    public boolean result(String betChoice, Wheel myWheel){
    	int start = Integer.parseInt(betChoice);
        return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
    }
    
    public String placeBet() {
    	String result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
    	return result;
    }
    public int getOdds () {
        return myOdds;
    }

}
