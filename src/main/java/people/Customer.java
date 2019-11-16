package people;

import money.IPay;
import money.Wallet;
import money.coins.CoinType;
import money.notes.BankNote;
import money.notes.NoteType;
import stockItems.ISell;

import java.util.ArrayList;

import static money.coins.CoinType.*;
import static money.notes.NoteType.*;

public class Customer {

    private String name;
    public Wallet wallet;
    private ArrayList<ISell> purchases;

    public Customer(String name){
        this.name = name;
        this.wallet = new Wallet();
        purchases = new ArrayList<ISell>();
    }

    public String getName(){
        return this.name;
    }

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

    public void addCashToWallet(){
        addNotes();
        addCoins();
    }

    public void addNotes(){
        for (NoteType note : NoteType.values()){
            int i = 0;
            int notesToAdd = amountOfCashToAdd(note);
            while (i < notesToAdd){
                wallet.addNote(note);
                i ++;
            }
        }
    }

    public void addCoins(){
        for (CoinType coin :CoinType.values()){
            int i = 0;
            int coinsToAdd = amountOfCashToAdd(coin);
            while (i < coinsToAdd){
                wallet.addCoin(coin);
                i ++;
            }
        }
    }

    public int amountOfCashToAdd(IPay cash){
        int amountOfCash = 0;
        if ( (TEN.equals(cash)) || (TWOPENCE.equals(cash)) || (TENPENCE.equals(cash)) || (ONEPOUND.equals(cash)) ) {
            amountOfCash = 10;
        } else if ( (TWENTY.equals(cash)) || (TWENTYPENCE.equals(cash)) ) {
            amountOfCash = 5;
        } else if ( (ONEPENCE.equals(cash)) || (FIVEPENCE.equals(cash)) ) {
            amountOfCash = 20;
        } else if (FIFTYPENCE.equals(cash)) {
            amountOfCash = 4;
        } else if (FIFTY.equals(cash)) {
            amountOfCash = 2;
        } else if (FIVE.equals(cash)) {
            amountOfCash = 9;
        }
        return amountOfCash;
    }
}
