package labtask04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringPerformanceTest {

    @Test
    public void testBuildString() {

        StringPerformance sp = new StringPerformance();

        assertEquals(
                "012345",
                sp.buildString(5)
        );
    }

    @Test
    public void testBuildStringBuilder() {

        StringPerformance sp = new StringPerformance();

        assertEquals(
                "012345",
                sp.buildStringBuilder(5)
        );
    }

    @Test
    public void testBothMethodsProduceSameResult() {

        StringPerformance sp = new StringPerformance();

        assertEquals(
                sp.buildString(100),
                sp.buildStringBuilder(100)
        );
    }
}