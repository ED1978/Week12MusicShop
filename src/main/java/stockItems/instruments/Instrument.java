package stockItems.instruments;

import behaviours.IPlay;
import stockItems.StockItem;

public abstract class Instrument extends StockItem implements IPlay {

    private String sound;

    public Instrument(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, String sound){
        super(make, model, type, material, wholesalePrice, retailPrice);
        this.sound = sound;
    }


    public String play(){
        return this.sound;
    }

}
