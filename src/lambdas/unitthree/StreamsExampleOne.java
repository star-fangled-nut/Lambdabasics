package lambdas.unitthree;

import lambdas.helper.PersonHelper;
import lambdas.unitone.Person;

import java.util.List;

public class StreamsExampleOne {
    public static void main(String[] args) {
        List<Person> people = PersonHelper.getPeople();

        people.stream()
                .filter(person -> person.getLastName().startsWith("C"))
                .forEach(person -> System.out.println(person.getFirstName()));
    }
}
