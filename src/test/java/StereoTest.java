import org.junit.Before;
import org.junit.Test;

import Stereo.Stereo;
import Stereo.Amplifier;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private Amplifier amplifier;

    @Before
    public void setup() {
        stereo = new Stereo("Ruben");
        amplifier = new Amplifier("Technics", "T2000", "On");
    }

    @Test
    public void changeVolume() {
        stereo.changeVolume(amplifier, 10);
        assertEquals(10, amplifier.getVolume());
    }

}
