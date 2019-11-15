package shop;

import stockItems.ISell;

import java.util.ArrayList;

public class MusicShop {

    private ArrayList<ISell> stock;

    public MusicShop(){
        stock = new ArrayList<ISell>();
    }

    public int countStockItems(){
        return this.stock.size();
    }

    public void addStockItem(ISell item){
        this.stock.add(item);
    }

    public void removeStockItem(ISell item){
        if(this.stock.contains(item)){
            this.stock.remove(item);
        }
    }

}
