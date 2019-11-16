package people;

import money.Wallet;
import money.notes.NoteType;
import stockItems.ISell;

import java.util.ArrayList;

public class Customer {

    private String name;
    public Wallet wallet;
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

    public void fillWallet(){
        for (NoteType note : NoteType.values()){

            int numberOfNotes = 0;

            switch(note) {

                case ONE:
                    numberOfNotes = 10;
                    break;

                case FIVE:
                    numberOfNotes = 9;
                    break;

                case TEN:
                    numberOfNotes = 10;
                    break;

                case TWENTY:
                    numberOfNotes = 5;
                    break;

                case FIFTY:
                    numberOfNotes = 2;
                    break;
            }
            int i = 1;
            while (i <= numberOfNotes){
                wallet.addNote(note);
                i ++;
            }

        }
    }


}
