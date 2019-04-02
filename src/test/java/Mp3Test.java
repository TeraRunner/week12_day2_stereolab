import Portable.MP3;
import Stereo.Stereo;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Mp3Test {

    private MP3 mp3;
    private Stereo stereo;

    @Before

    public void before(){
        mp3 = new MP3();
        stereo = new Stereo("Ruben's Boombox");
    }

    @Test

    public void TestConnect(){
        assertEquals("Connected to Ruben's Boombox",mp3.connect(stereo));
    }


}
