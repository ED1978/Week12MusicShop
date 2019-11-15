package stockItems.accessories.strings;

import stockItems.StockItem;

public class Strings extends StockItem {

    private String weight;
    private String wind;

    public Strings(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice, String weight, String wind){
        super(make, model, type, material, wholesalePrice, retailPrice);
        this.weight = weight;
        this.wind = wind;
    }

    public String getWeight(){
        return this.weight;
    }

    public String getWind(){
        return this.wind;
    }

}
