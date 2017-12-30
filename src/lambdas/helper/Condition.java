package lambdas.helper;

import lambdas.unitone.Person;

@FunctionalInterface
public interface Condition {
    boolean test(Person p);
}
