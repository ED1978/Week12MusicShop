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
    Wallet wallet;

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

//    @Test
//    public void canGetFunds() {
//        assertEquals(1000.00, eric.getFunds(), 0.01);
//    }

//    @Test
//    public void canAddFunds() {
//        eric.addFunds(20.99);
//        assertEquals(1020.99, eric.getFunds(), 0.01);
//    }

//    @Test
//    public void canRemoveFunds() {
//        eric.removeFunds(20.00);
//        assertEquals(980.00, eric.getFunds(), 0.01);
//    }

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
    public void canFillWallet() {
        eric.fillWallet();
        assertEquals(355.00, eric.wallet.getTotalValue(), 0.01);
    }
}
