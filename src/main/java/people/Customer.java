package people;

import money.IPay;
import money.Wallet;
import money.notes.BankNote;
import money.notes.NoteType;
import stockItems.ISell;

import java.util.ArrayList;

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

    public void fillWalletWithNotes(){
        for (NoteType note : NoteType.values()){
            int i = 1;
            int notesToAdd = numberOfNotesToAdd(note);
            while (i <= notesToAdd){
                wallet.addNote(note);
                i ++;
            }
        }
    }

    public int numberOfNotesToAdd(NoteType note){
        int numberOfNotes = 0;

        if (FIVE.equals(note)) {
            numberOfNotes = 9;
        } else if (TEN.equals(note)) {
            numberOfNotes = 10;
        } else if (TWENTY.equals(note)) {
            numberOfNotes = 5;
        } else if (FIFTY.equals(note)) {
            numberOfNotes = 2;
        }
        return numberOfNotes;
    }


}
