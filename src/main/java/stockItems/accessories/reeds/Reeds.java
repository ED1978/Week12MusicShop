package stockItems.accessories.reeds;

import stockItems.StockItem;

public class Reeds extends StockItem {

    public int numberPerBox;
    public String strength;

    public Reeds(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, int numberPerBox, String strength){
        super(make, model, type, material, wholesalePrice, retailPrice);
        this.numberPerBox = numberPerBox;
        this.strength = strength;
    }

    public int getNumberPerBox(){
        return  this.numberPerBox;
    }

    public String getStrength(){
        return this.strength;
    }

    public void setNumberPerBox(int amount){
        this.numberPerBox = amount;
    }

    public void setStrength(String strength){
        this.strength = strength;
    }

}
