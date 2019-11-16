import money.Wallet;
import org.junit.Before;
import org.junit.Test;
import people.customers.Eric;
import stockItems.instruments.stringed.guitars.ElectricGuitar;
import stockItems.instruments.wind.Clarinet;

import static org.junit.Assert.assertEquals;

public class EricTest {

    Eric eric;
    ElectricGuitar guitar;
    Clarinet clarinet;

    @Before
    public void before(){
        eric = new Eric();
        guitar = new ElectricGuitar();
        clarinet = new Clarinet();
    }

    @Test
    public void canGetName() {
        assertEquals("Eric", eric.getName());
    }

    @Test
    public void canAddPurchase(){
        eric.addPurchase(guitar);
        assertEquals(1, eric.getPurchasesLength());
    }

    @Test
    public void canRemovePurchase() {
        eric.addPurchase(clarinet);
        eric.addPurchase(guitar);
        eric.removePurchase(clarinet);
        assertEquals(1, eric.getPurchasesLength());
    }

    @Test
    public void caAddNotesNotes() {
        eric.addNotes();
        assertEquals(345.00, eric.wallet.getTotalValue(), 0.01);
    }

    @Test
    public void canAddCoins() {
        eric.addCoins();
        assertEquals(15.40, eric.wallet.getTotalValue(), 0.01);
    }

    @Test
    public void canAddCashToWallet() {
        eric.addCashToWallet();
        assertEquals(360.40, eric.wallet.getTotalValue(), 0.01);
    }
}
