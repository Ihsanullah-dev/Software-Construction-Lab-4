package labtask04;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentDirectoryTest {

    @Test
    public void testStudentCanBeAdded() {

        StudentDirectory directory =
                new StudentDirectory();

        directory.addStudent(101, "Ali");

        assertEquals(
                "Ali",
                directory.getStudent(101)
        );
    }

    @Test
    public void testAllIDs() {

        StudentDirectory directory =
                new StudentDirectory();

        directory.addStudent(101, "Ali");
        directory.addStudent(102, "Ahmed");

        assertTrue(
                directory.getAllIDs().contains(101)
        );

        assertTrue(
                directory.getAllIDs().contains(102)
        );
    }

    @Test
    public void testIDsAreUnmodifiable() {

        StudentDirectory directory =
                new StudentDirectory();

        directory.addStudent(101, "Ali");

        assertThrows(
                UnsupportedOperationException.class,
                () -> directory.getAllIDs().add(102)
        );
    }
}