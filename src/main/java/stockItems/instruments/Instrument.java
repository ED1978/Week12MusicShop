package stockItems.instruments;

import behaviours.IPlay;
import stockItems.StockItem;

public abstract class Instrument extends StockItem implements IPlay {

    private String sound;
    private Boolean caseIncluded;

    public Instrument(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, String sound, Boolean caseIncluded){
        super(make, model, type, material, wholesalePrice, retailPrice);
        this.sound = sound;
        this.caseIncluded = caseIncluded;
    }


    public String play(){
        return this.sound;
    }

    public Boolean isCaseIncluded(){
        return  this.caseIncluded;
    }

    public void setCaseIncludedFalse(){
        this. caseIncluded = false;
    }

    public void setCaseIncludedTrue(){
        this.caseIncluded = true;
    }

}
