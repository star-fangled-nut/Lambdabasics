package lambdas.unittwo;

import lambdas.helper.PersonHelper;
import lambdas.unitone.Person;

import java.util.Collections;
import java.util.List;

public class FurtherStandardFunctionalInterfaceExamples {
    public static void main(String[] args) {
        List<Person> people = PersonHelper.getPeople();

        Collections.sort(people, (firstPerson, secondPerson) -> firstPerson.getLastName().compareTo(secondPerson.getLastName()));

        PersonHelper.performConditionally(people, p -> true, p -> System.out.println(p));

        PersonHelper.performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));
    }
}
