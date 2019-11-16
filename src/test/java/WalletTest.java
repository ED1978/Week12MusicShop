import money.Wallet;
import money.coins.CoinType;
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
    public void canAddCoin() {
        wallet.addCoin(CoinType.FIFTYPENCE);
        assertEquals(1, wallet.getNumberOfNotes());
    }

    @Test
    public void canGetTotalValue() {
        wallet.addNote(NoteType.FIVE);
        wallet.addNote(NoteType.TEN);
        wallet.addCoin(CoinType.FIFTYPENCE);
        assertEquals(15.50, wallet.getTotalValue(), 0.01);
    }

}
