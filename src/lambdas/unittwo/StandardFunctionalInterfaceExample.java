package lambdas.unittwo;

import lambdas.unitone.Person;
import lambdas.helper.PersonHelper;

import java.util.Collections;
import java.util.List;

public class StandardFunctionalInterfaceExample {
    public static void main(String[] args) {
        List<Person> people = PersonHelper.getPeople();

        Collections.sort(people, (firstPerson, secondPerson) -> firstPerson.getLastName().compareTo(secondPerson.getLastName()));

        PersonHelper.printConditionallyWithGenericInterface(people, p -> true);

        PersonHelper.printConditionallyWithGenericInterface(people, p -> p.getLastName().startsWith("C"));
    }
}
