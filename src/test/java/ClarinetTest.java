import org.junit.Before;
import org.junit.Test;
import stockItems.instruments.wind.Clarinet;

import static org.junit.Assert.assertEquals;

public class ClarinetTest {

    Clarinet clarinet;

    @Before
    public void before(){
        clarinet = new Clarinet();
    }

    @Test
    public void canGetNumberOfValves() {
        assertEquals(17, clarinet.getNumberOfValves());
    }

    @Test
    public void canGetKeyMaterial() {
        assertEquals("Nickel", clarinet.getKeyMaterial());
    }
}
