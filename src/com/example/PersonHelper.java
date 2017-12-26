package com.example;

import java.util.Arrays;
import java.util.List;

abstract class PersonHelper {
    static void printAll(List<Person> people) {
        System.out.println();

        for (Person p : people) {
            System.out.println(p);
        }
    }

    static void printConditionally(List<Person> people, Condition condition) {
        System.out.println();
        for (Person p : people) {
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    static List<Person> getPeople(){
        return Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));
    }
}
