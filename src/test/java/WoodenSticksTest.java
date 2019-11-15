import org.junit.Before;
import org.junit.Test;
import stockItems.accessories.drumsticks.WoodenSticks;

import static org.junit.Assert.assertEquals;

public class WoodenSticksTest {

    WoodenSticks sticks;

    @Before
    public void before(){
        sticks = new WoodenSticks();
    }

    @Test
    public void canGetWeight() {
        assertEquals("5", sticks.getWeight());
    }

    @Test
    public void canGetDiameter() {
        assertEquals("A", sticks.getDiameter());
    }

    @Test
    public void canGetTipMaterial() {
        assertEquals("Wood", sticks.getTipMaterial());
    }
}
