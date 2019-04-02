import Stereo.Amplifier;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AmplifierTest {

    Amplifier amplifier;

    @Before
    public void setup() {
        amplifier = new Amplifier();
    }

    @Test
    public void changeVolumeTest() {
        amplifier.setVolume(11);
        assertEquals(11, amplifier.getVolume());
    }

}
