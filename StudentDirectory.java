package labtask04;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentDirectory {

    private Map<Integer, String> students;

    public StudentDirectory() {

        students = new HashMap<>();
    }

    public void addStudent(int id, String name) {

        students.put(id, name);
    }

    public String getStudent(int id) {

        return students.get(id);
    }

    public Set<Integer> getAllIDs() {

        return Collections.unmodifiableSet(
                students.keySet()
        );
    }

    public static void main(String[] args) {

        StudentDirectory directory =
                new StudentDirectory();

        directory.addStudent(101, "Ali");
        directory.addStudent(102, "Ahmed");
        directory.addStudent(103, "Usman");

        System.out.println("Student IDs:");
        System.out.println(directory.getAllIDs());

        try {

            directory.getAllIDs().add(104);

        } catch (UnsupportedOperationException e) {

            System.out.println(
                    "UnsupportedOperationException caught successfully."
            );
        }
    }
}