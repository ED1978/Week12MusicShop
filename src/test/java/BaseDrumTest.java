import org.junit.Before;
import org.junit.Test;
import stockItems.instruments.drums.BaseDrum;

import static org.junit.Assert.assertEquals;

public class BaseDrumTest {

    BaseDrum drum;

    @Before
    public void before(){
        drum = new BaseDrum();
    }

    @Test
    public void canGetDiameter() {
        assertEquals("22", drum.getDiameter());
    }

    @Test
    public void canGetDepth() {
        assertEquals("18", drum.getDepth());
    }
}
