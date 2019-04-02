import Stereo.Band;
import Stereo.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setup() {
        radio = new Radio(Band.AM);
    }

    @Test
    public void pickStationTest() {
        radio.pickStation("RadioGaGa");
        assertEquals("RadioGaGa", radio.getStation());
    }

    @Test
    public void getBandTest() {
        assertEquals(Band.AM, radio.getBand());
    }
}
