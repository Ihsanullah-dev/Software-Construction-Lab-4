package labtask04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class CourseManagerTest {

    @Test
    public void testIteratorRemoval() {

        CourseManager manager =
                new CourseManager();

        manager.removeUsingIterator();

        List<String> expected =
                Arrays.asList("8.03", "14.03");

        assertEquals(
                expected,
                manager.getSubjects()
        );
    }
}