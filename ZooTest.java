package labtask04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ZooTest {

    @Test
    public void testAnimals() {

        Zoo zoo = new Zoo();

        assertEquals(
                3,
                zoo.getAnimals().size()
        );

        assertTrue(
                zoo.getAnimals().contains("lion")
        );

        assertTrue(
                zoo.getAnimals().contains("tiger")
        );

        assertTrue(
                zoo.getAnimals().contains("bear")
        );
    }

    @Test
    public void testUnmodifiableList() {

        Zoo zoo = new Zoo();

        assertThrows(
                UnsupportedOperationException.class,
                () -> zoo.getAnimals().add("flamingo")
        );
    }
}