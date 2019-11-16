package people;

import money.Wallet;
import stockItems.ISell;

import java.util.ArrayList;

public class Customer {

    private String name;
    private Wallet wallet;
    private ArrayList<ISell> purchases;

    public Customer(String name, Double wallet){
        this.name = name;
        this.wallet = new Wallet();
        purchases = new ArrayList<ISell>();
    }

    public String getName(){
        return this.name;
    }

//    public Double getFunds(){
//        return this.wallet;
//    }

//    public void addFunds(Double amount){
//        this.wallet += amount;
//    }

//    public void removeFunds(Double amount){
//        this.wallet -= amount;
//    }

    public int getPurchasesLength(){
        return this.purchases.size();
    }

    public void addPurchase(ISell item){
        this.purchases.add(item);
    }

    public void removePurchase(ISell item){
        if (this.purchases.contains(item)){
            this.purchases.remove(item);
        }
    }


}
