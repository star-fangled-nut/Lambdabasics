package lambdas.unitthree;

import lambdas.helper.PersonHelper;
import lambdas.unitone.Person;

import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = PersonHelper.getPeople();

        // Using for loop
        System.out.println("Using for loop");
        for (int i = 0; i < people.size() ; i++) {
            System.out.println(people.get(i));
        }

        // Using for each loop
        System.out.println("Using for each loop");
        for (Person p : people) {
            System.out.println(p);
        }

        // Using for lambda for each
        System.out.println("Using lambda for each");
        people.forEach(System.out::println);
    }
}
