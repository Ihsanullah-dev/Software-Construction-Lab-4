package labtask04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TreasureMapTest {

    @Test
    public void testPalmUpdate() {

        TreasureMap map =
                new TreasureMap();

        map.updatePalm();

        assertEquals(
                53.0,
                map.getTreasures().get("palm")
        );
    }

    @Test
    public void testTotalValue() {

        TreasureMap map =
                new TreasureMap();

        map.updatePalm();

        assertEquals(
                153.0,
                map.calculateTotal()
        );
    }
}