package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseSolutionWithoutLambdas {
    public static void main(String[] args) {
        List<Person> people = PersonHelper.getPeople();

        Collections.sort(people, new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        PersonHelper.printAll(people);
        PersonHelper.printConditionally(people, new Condition() {

            @Override
            public boolean test(Person p) {
                return p.getFirstName().startsWith("C");
            }
        });

    }
}
