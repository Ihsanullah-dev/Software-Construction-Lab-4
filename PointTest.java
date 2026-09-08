package labtask04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void testPointCoordinates() {

        Point point = new Point(10, 20);

        assertEquals(10, point.getX());
        assertEquals(20, point.getY());
    }

    @Test
    public void testPointToString() {

        Point point = new Point(10, 20);

        assertEquals(
                "Point{x=10, y=20}",
                point.toString()
        );
    }
}