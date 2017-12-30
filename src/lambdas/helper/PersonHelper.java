package lambdas.helper;

import lambdas.unitone.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public abstract class PersonHelper {
    public static void printAll(List<Person> people) {
        System.out.println();

        for (Person p : people) {
            System.out.println(p);
        }
    }

    public static void printConditionallyWithCustomInterface(List<Person> people, Condition condition) {
        System.out.println();
        for (Person p : people) {
            if(condition.test(p)) {
                System.out.println(p);
            }
        }
    }

    public static void printConditionallyWithGenericInterface(List<Person> people, Predicate<Person> predicate) {
        System.out.println();
        for (Person p : people) {
            if(predicate.test(p)) {
                System.out.println(p);
            }
        }
    }

    public static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        System.out.println();
        for (Person p : people) {
            if(predicate.test(p)) {
               consumer.accept(p);
            }
        }
    }

    public static List<Person> getPeople(){
        return Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39));
    }
}
