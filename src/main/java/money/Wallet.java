package money;

import money.coins.Coin;
import money.notes.BankNote;
import money.notes.NoteType;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<BankNote> notes;
    private ArrayList<Coin> coins;

    public Wallet(){
        this.notes = new ArrayList<BankNote>();
        this.coins = new ArrayList<Coin>();
    }

    public int getNumberOfNotes(){
        return this.notes.size();
    }

    public void addNote(NoteType note){
        BankNote noteToAdd =  new BankNote(note);
        this.notes.add(noteToAdd);
    }
//    public void addCoin(Coin coin){
//        Coin coinToAdd = new Coin(coin);
//        this.coins.add(coinToAdd);
//    }

    public Double getNotesValue(){
        Double totalValue = 0.00;
        for (BankNote item : notes){
            totalValue += item.getValue();
        }
        return totalValue;
    }

}
