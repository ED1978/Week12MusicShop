package money;

import money.notes.BankNote;
import money.notes.NoteType;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<IPay> wallet;

    public Wallet(){
        this.wallet = new ArrayList<IPay>();
    }

    public int getNumberOfNotes(){
        return this.wallet.size();
    }

    public void addNote(IPay note){
        IPay noteToAdd = new BankNote(note);
        this.wallet.add(noteToAdd);
    }

    public Double getTotalValue(){
        Double totalValue = 0.00;
        for (IPay item : wallet){
            totalValue += item.getValue();
        }
        return totalValue;
    }

}
