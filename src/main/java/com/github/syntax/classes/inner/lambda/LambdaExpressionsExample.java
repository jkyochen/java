package com.github.syntax.classes.inner.lambda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpressionsExample {

    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();

        // 1
        printPersonsOlderThan(roster, 0);

        // 2
        class CheckPersonEligibleForSelectiveService implements CheckPerson {

            @Override
            public boolean test(Person p) {
                return p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
            }
        }
        printPersons(roster, new CheckPersonEligibleForSelectiveService());

        // 3
        printPersons(roster, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getAge() >= 18;
            }
        });

        // 4 Lambda Expression
        // A functional interface is any interface that contains only one abstract method. (A functional interface may contain one or more default methods or static methods.)
        printPersons(roster, (Person p) -> p.gender == Person.Sex.FEMALE && p.getAge() >= 18);

        // 5 Predicate<T>
        printPersonsWithPredicate(
                roster,
                p -> p.gender == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25
        );

        // 6 Consumer<T>
        processPersons(roster, p -> p.gender == Person.Sex.MALE, p -> p.printPerson());

        // 7 Function<T,U>
        processPersonsWithFunction(
                roster,
                p -> p.gender == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25,
                Person::getEmailAddress,
                System.out::println
        );

        // 8
        processElements(
                roster,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25,
                Person::getEmailAddress,
                System.out::println
        );

        // 9
        roster
                .stream()
                .filter(p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18)
                .map(Person::getEmailAddress)
                .forEach(System.out::println);
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> router, CheckPerson tester) {
        for (Person p : router) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    interface CheckPerson {
        boolean test(Person p);
    }

    public static void printPersonsWithPredicate(List<Person> router, Predicate<Person> tester) {
        for (Person p : router) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    public static void processPersonsWithFunction(
            List<Person> roster,
            Predicate<Person> tester,
            Function<Person, String> mapper,
            Consumer<String> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                String data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

    public static <X, Y> void processElements(
            Iterable<X> source,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> block) {
        for (X p : source) {
            if (tester.test(p)) {
                Y data = mapper.apply(p);
                block.accept(data);
            }
        }
    }

}
