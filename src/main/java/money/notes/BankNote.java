package money.notes;

import money.IPay;
import money.Money;

public class BankNote extends Money {

    public BankNote(NoteType noteType){
        super(noteType, "Paper");
    }

}
