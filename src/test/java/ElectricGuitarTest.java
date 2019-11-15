import org.junit.Before;
import org.junit.Test;
import stockItems.instruments.stringed.guitars.ElectricGuitar;

import static org.junit.Assert.assertEquals;

public class ElectricGuitarTest {

    ElectricGuitar guitar;

    @Before
    public void before(){
        guitar = new ElectricGuitar();
    }

    @Test
    public void cnaGetMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Stratocaster", guitar.getModel());
    }
}
