package money;

import money.notes.BankNote;
import money.notes.NoteType;

import java.util.ArrayList;

public class Wallet {

    private ArrayList<BankNote> wallet;

    public Wallet(){
        this.wallet = new ArrayList<BankNote>();
    }

    public int getNumberOfNotes(){
        return this.wallet.size();
    }

    public void addNote(NoteType note){
        BankNote noteToAdd = new BankNote(note);
        this.wallet.add(noteToAdd);
    }

    public Double getTotalValue(){
        Double totalValue = 0.00;
        for (BankNote note : wallet){
            totalValue += note.getValueFromEnum();
        }
        return totalValue;
    }

}
