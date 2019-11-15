import org.junit.Before;
import org.junit.Test;
import shop.MusicShop;
import stockItems.accessories.drumsticks.WoodenSticks;
import stockItems.accessories.reeds.SaxReeds;
import stockItems.accessories.strings.AcousticStrings;
import stockItems.instruments.drums.BaseDrum;
import stockItems.instruments.stringed.guitars.ElectricGuitar;
import stockItems.instruments.wind.Clarinet;

import static org.junit.Assert.assertEquals;

public class MusicShopTest {

    MusicShop shop;
    ElectricGuitar guitar;
    AcousticStrings strings;
    BaseDrum drum;
    Clarinet clarinet;
    SaxReeds reeds;
    WoodenSticks sticks;

    @Before
    public void before(){
        shop = new MusicShop();
        guitar = new ElectricGuitar();
        strings = new AcousticStrings();
        drum = new BaseDrum();
        clarinet = new Clarinet();
        reeds = new SaxReeds();
        sticks = new WoodenSticks();
    }

    @Test
    public void canAllAddItems() {
        shop.addStockItem(guitar);
        shop.addStockItem(strings);
        shop.addStockItem(drum);
        shop.addStockItem(clarinet);
        shop.addStockItem(reeds);
        shop.addStockItem(sticks);
        assertEquals(6, shop.countStockItems());
    }

    @Test
    public void canRemoveItems() {
        shop.addStockItem(guitar);
        shop.addStockItem(strings);
        shop.addStockItem(drum);
        shop.addStockItem(clarinet);
        shop.addStockItem(reeds);
        shop.addStockItem(sticks);
        shop.removeStockItem(sticks);
        shop.removeStockItem(reeds);
        assertEquals(4, shop.countStockItems());
    }

    @Test
    public void canCalculatePotentialProfit() {
        shop.addStockItem(guitar);
        shop.addStockItem(strings);
        assertEquals(202.99, shop.calculatePotentialProfit(),0.01);
    }
}
