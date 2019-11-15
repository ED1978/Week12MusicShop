package stockItems.instruments.stringed;

import stockItems.instruments.Instrument;

public class Stringed extends Instrument {

    private int numberOfStrings;

    public Stringed(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, String sound, int numberOfStrings){
        super(make, model, type, material, wholesalePrice, retailPrice, sound);
        this.numberOfStrings = numberOfStrings;
    }


}
