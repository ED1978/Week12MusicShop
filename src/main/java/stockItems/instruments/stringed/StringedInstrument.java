package stockItems.instruments.stringed;

import stockItems.instruments.Instrument;

public class StringedInstrument extends Instrument {

    private int numberOfStrings;

    public StringedInstrument(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, String sound, int numberOfStrings, Boolean caseIncluded){
        super(make, model, type, material, wholesalePrice, retailPrice, sound, caseIncluded);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }


}
