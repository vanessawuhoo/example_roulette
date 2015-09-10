package roulette;

import util.ConsoleReader;

public class RedBlackBet extends Bet {
	private String myDescription = "Red or Black";
    private int myOdds;
    
    public RedBlackBet(int odds){
    	myOdds = odds;
    }
    
    public String getDescription() {
    	return myDescription;
    }
    
    public boolean result(String betChoice, Wheel myWheel){
    	return myWheel.getColor().equals(betChoice);
    }
    
    public String placeBet() {
    	String result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
    	return result;
    }
    public int getOdds () {
        return myOdds;
    }

}
