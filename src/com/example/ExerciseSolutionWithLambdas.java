package com.example;

import java.util.Collections;
import java.util.List;

public class ExerciseSolutionWithLambdas {
    public static void main(String[] args) {
        List<Person> people = PersonHelper.getPeople();

        Collections.sort(people, (firstPerson, secondPerson) -> firstPerson.getLastName().compareTo(secondPerson.getLastName()));

        PersonHelper.printConditionally(people, p -> true);

        PersonHelper.printConditionally(people, p -> p.getLastName().startsWith("C"));
    }
}
