package roulette;

import util.ConsoleReader;

public class OddEvenBet extends Bet {
    private String myDescription = "Odd or Even";
    private int myOdds;
    
    public OddEvenBet(int odds){
    	myOdds = odds;
    }
    
    public String getDescription() {
    	return myDescription;
    }
    
    public boolean result(String betChoice, Wheel myWheel){
    	return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
    }
    
    public String placeBet() {
    	String result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
    	return result;
    }
    public int getOdds () {
        return myOdds;
    }

}
