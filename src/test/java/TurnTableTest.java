import Stereo.TurnTable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TurnTableTest {

    TurnTable turnTable;

    @Before
    public void setup() {
        turnTable = new TurnTable();
    }

    @Test
    public void needleStatusTest() {
        turnTable.setNeedleStatus("On");
        assertEquals("On", turnTable.getNeedleStatus());
    }

    @Test
    public void speedTest() {
        turnTable.setSpeed(12);
        assertEquals(12, turnTable.getSpeed());
    }

}
