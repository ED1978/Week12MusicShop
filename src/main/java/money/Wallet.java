package money;

import money.coins.Coin;
import money.coins.CoinType;
import money.notes.BankNote;
import money.notes.NoteType;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<Money> cash;

    public Wallet(){
        this.cash = new ArrayList<Money>();
    }

    public int getAmountOfCash(){
        return this.cash.size();
    }

    public void addNote(NoteType note){
        BankNote noteToAdd =  new BankNote(note);
        this.cash.add(noteToAdd);
    }
    public void addCoin(CoinType coin){
        Coin coinToAdd = new Coin(coin);
        this.cash.add(coinToAdd);
    }

    public Double getTotalValue(){
        Double totalValue = 0.00;
        for (Money item : cash){
            totalValue += item.getValue();
        }
        return totalValue;
    }

}
