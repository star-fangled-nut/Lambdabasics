package lambdas.unitone;

import lambdas.helper.PersonHelper;

import java.util.Collections;
import java.util.List;

public class ExerciseSolutionWithLambdas {
    public static void main(String[] args) {
        List<Person> people = PersonHelper.getPeople();

        Collections.sort(people, (firstPerson, secondPerson) -> firstPerson.getLastName().compareTo(secondPerson.getLastName()));

        PersonHelper.printConditionallyWithCustomInterface(people, p -> true);

        PersonHelper.printConditionallyWithCustomInterface(people, p -> p.getLastName().startsWith("C"));
    }
}
