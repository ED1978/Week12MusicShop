package stockItems.instruments.wind;

import stockItems.instruments.Instrument;

public class Wind extends Instrument {

    private int numberOfValves;

    public Wind(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, String sound, int numberOfValves){
        super(make, model, type, material, wholesalePrice, retailPrice, sound);
        this.numberOfValves = numberOfValves;
    }

}
