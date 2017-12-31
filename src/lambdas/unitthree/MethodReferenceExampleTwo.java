package lambdas.unitthree;

import lambdas.helper.PersonHelper;
import lambdas.unitone.Person;

import java.util.Collections;
import java.util.List;

public class MethodReferenceExampleTwo {
    public static void main(String[] args) {
        List<Person> people = PersonHelper.getPeople();

        PersonHelper.performConditionally(people, p -> true, System.out::println);
    }
}
