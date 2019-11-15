package stockItems.accessories.drumsticks;

import stockItems.StockItem;

public class DrumSticks extends StockItem {

    public String weight;
    public String diameter;
    public String tipMaterial;

    public DrumSticks(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, String weight, String diameter, String tipMaterial){
        super(make, model, type, material, wholesalePrice, retailPrice);
        this.weight = weight;
        this.diameter = diameter;
        this.tipMaterial = tipMaterial;
    }

    public String getWeight(){
        return this.weight;
    }

    public String getDiameter(){
        return this.diameter;
    }

    public String getTipMaterial(){
        return this.tipMaterial;
    }

}
