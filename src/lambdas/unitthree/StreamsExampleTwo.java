package lambdas.unitthree;

import lambdas.helper.PersonHelper;
import lambdas.unitone.Person;

import java.util.List;
import java.util.stream.Stream;

public class StreamsExampleTwo {
    public static void main(String[] args) {
        List<Person> people = PersonHelper.getPeople();

        people.stream()
            .filter(person -> person.getLastName().startsWith("C"))
            .forEach(person -> System.out.println(person.getFirstName()));

        long count = people.parallelStream()
            .filter(person -> person.getLastName().startsWith("D"))
            .count();

        System.out.println(count);
    }
}
