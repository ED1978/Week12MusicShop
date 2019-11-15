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

    @Test
    public void canGetType() {
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canGetMaterial() {
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canGetWholesalePrice() {
        assertEquals(199.00, guitar.getWholesalePrice(), 0.01);
    }

    @Test
    public void canGetRetailPrice() {
        assertEquals(399.99, guitar.getRetailPrice(), 0.01);
    }

    @Test
    public void CanSetWholesalePrice() {
        guitar.setWholesalePrice(99.99);
        assertEquals(99.99, guitar.getWholesalePrice(), 0.01);
    }

    @Test
    public void canSetRetailPrice() {
        guitar.setRetailPrice(299.99);
        assertEquals(299.99, guitar.getRetailPrice(), 0.01);
    }

    @Test
    public void canPlay() {
        assertEquals("CLAAANG", guitar.play());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void isCaseIncluded() {
        assertEquals(true, guitar.isCaseIncluded());
    }

    @Test
    public void canSetIsCaseIncludedFalse() {
        guitar.setCaseIncludedFalse();
        assertEquals(false, guitar.isCaseIncluded());
    }

    @Test
    public void canSetIsCaseIncludedTrue() {
        guitar.setCaseIncludedFalse();
        guitar.setCaseIncludedTrue();
        assertEquals(true, guitar.isCaseIncluded());
    }


}
