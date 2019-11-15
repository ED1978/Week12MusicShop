package stockItems.instruments.wind;

import stockItems.instruments.Instrument;

public class WindInstrument extends Instrument {

    private int numberOfValves;
    private String keyMaterial;

    public WindInstrument(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, String sound, int numberOfValves, String keyMaterial, Boolean caseIncluded){
        super(make, model, type, material, wholesalePrice, retailPrice, sound, caseIncluded);
        this.numberOfValves = numberOfValves;
        this.keyMaterial = keyMaterial;
    }

    public int getNumberOfValves(){
        return this.numberOfValves;
    }

    public String getKeyMaterial(){
        return this.keyMaterial;
    }

}
