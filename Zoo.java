package labtask04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zoo {

    private List<String> animals;

    public Zoo() {

        animals = new ArrayList<>(Arrays.asList(
                "lion",
                "tiger",
                "bear"
        ));
    }

    public List<String> getAnimals() {

        return Collections.unmodifiableList(animals);
    }

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        System.out.println("Animals:");
        System.out.println(zoo.getAnimals());

        try {

            zoo.getAnimals().add("flamingo");

        } catch (UnsupportedOperationException e) {

            System.out.println(
                    "UnsupportedOperationException caught successfully."
            );
        }
    }
}