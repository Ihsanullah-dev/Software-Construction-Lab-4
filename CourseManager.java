package labtask04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CourseManager {

    private List<String> subjects;

    public CourseManager() {
        subjects = new ArrayList<>(Arrays.asList(
                "6.045",
                "6.005",
                "8.03",
                "6.813",
                "14.03"
        ));
    }

    public List<String> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public void removeUsingIterator() {

        Iterator<String> iter = subjects.iterator();

        while (iter.hasNext()) {

            String subject = iter.next();

            if (subject.startsWith("6.")) {
                iter.remove();
            }
        }
    }

    public static void main(String[] args) {

        CourseManager manager = new CourseManager();

        System.out.println("Before removal:");
        System.out.println(manager.subjects);

        manager.removeUsingIterator();

        System.out.println("After removal:");
        System.out.println(manager.subjects);
    }
}