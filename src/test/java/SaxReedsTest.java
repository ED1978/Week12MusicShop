import org.junit.Before;
import org.junit.Test;
import stockItems.accessories.reeds.SaxReeds;

import static org.junit.Assert.assertEquals;

public class SaxReedsTest {

    SaxReeds reeds;

    @Before
    public void before(){
        reeds = new SaxReeds();
    }

    @Test
    public void canGetNumberPerBox() {
        assertEquals(10, reeds.getNumberPerBox());
    }

    @Test
    public void canGetStrength() {
        assertEquals("2.5", reeds.getStrength());
    }

    @Test
    public void canSetNumberPerBox() {
        reeds.setNumberPerBox(5);
        assertEquals(5, reeds.getNumberPerBox());
    }

    @Test
    public void canSetStrength() {
        reeds.setStrength("3.5");
        assertEquals("3.5", reeds.getStrength());
    }
}
