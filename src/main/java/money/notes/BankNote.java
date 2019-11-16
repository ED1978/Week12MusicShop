package money.notes;

import money.IPay;
import money.Money;

public class BankNote extends Money {

    public BankNote(IPay noteType){
        super(noteType, "Paper");
    }

}
