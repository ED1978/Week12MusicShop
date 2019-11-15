package stockItems.instruments.drums;

import stockItems.instruments.Instrument;

public class Drum extends Instrument {

    public String diameter;
    public String depth;

    public Drum(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, String sound, String diameter, String depth){
        super(make, model, type, material, wholesalePrice, retailPrice, sound);
        this.diameter = diameter;
        this.depth = depth;
    }

    public String getDiameter(){
        return this.diameter;
    }

    public String getDepth(){
        return this.depth;
    }

}
