import Stereo.Amplifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmplifierTest {

    Amplifier amplifier;

    @Before
    public void setup() {
        amplifier = new Amplifier("Technics","T2000","Off");
    }

    @Test
    public void changeVolumeTest() {
        amplifier.setVolume(11);
        assertEquals(11, amplifier.getVolume());
    }

    @Test
    public void getManufacturerTest(){
        assertEquals("Technics", amplifier.getManufacturer());
    }

    @Test
    public void getModelTest(){
        assertEquals("T2000", amplifier.getModel());
    }

    @Test
    public void getIndicatorTest(){
        assertEquals("Off",amplifier.getPowerIndicator());
    }

}
