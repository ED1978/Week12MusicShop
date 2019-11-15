package stockItems;

public abstract class StockItem implements ISell{

    private String make;
    private String model;
    private String type;
    private String material;
    private Double wholesalePrice;
    private Double retailPrice;
    protected Double markUpValue;

    public StockItem(String make, String model, String type, String material, Double wholesalePrice, Double retailPrice){
        this.make = make;
        this.model = model;
        this.type = type;
        this.material = material;
        this.wholesalePrice = wholesalePrice;
        this.retailPrice = retailPrice;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public String getType(){
        return this.type;
    }

    public String getMaterial(){
        return this.material;
    }

    public Double getWholesalePrice(){
        return this.wholesalePrice;
    }

    public Double getRetailPrice(){
        return this.retailPrice;
    }


    public void setWholesalePrice(Double price){
        this.wholesalePrice = price;
    }

    public void setRetailPrice(Double price){
        this.retailPrice = price;
    }

    public Double getMarkUpValue(){
        return this.markUpValue;
    }

    public  void setMarkupValue(){
        this.markUpValue = calculateMarkUp();
    }

    public Double calculateMarkUp(){
        return getRetailPrice() - getWholesalePrice();
    }

}
