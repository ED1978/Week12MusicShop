import org.junit.Before;
import org.junit.Test;
import stockItems.accessories.strings.AcousticStrings;

import static org.junit.Assert.assertEquals;

public class AcousticStringsTest {

    AcousticStrings strings;

    @Before
    public void before(){
        strings = new AcousticStrings();
    }

    @Test
    public void canGetWeight() {
        assertEquals("Light", strings.getWeight());
    }

    @Test
    public void canGetWind() {
        assertEquals("80/20", strings.getWind());
    }
}
