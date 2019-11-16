import money.Wallet;
import money.notes.BankNote;
import money.notes.NoteType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {


    Wallet wallet;

    @Before
    public void before(){
        wallet = new Wallet();
    }

    @Test
    public void canAddNote() {
        wallet.addNote(NoteType.FIFTY);
        assertEquals(1, wallet.getNumberOfNotes());
    }

    @Test
    public void canGetTotalValue() {
        wallet.addNote(NoteType.FIVE);
        wallet.addNote(NoteType.TEN);
        assertEquals(15.00, wallet.getTotalValue(), 0.01);
    }

}
