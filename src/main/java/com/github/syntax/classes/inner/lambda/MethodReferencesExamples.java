package com.github.syntax.classes.inner.lambda;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferencesExamples {

    public static void main(String[] args) {
        List<Person> roster = Person.createRoster();
        Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);

        // 1
        class PersonAgeComparator implements Comparator<Person> {
            public int compare(Person a, Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        }
        Arrays.sort(rosterAsArray, new PersonAgeComparator());

        // 2
        Arrays.sort(rosterAsArray, (a, b) -> Person.compareByAge(a, b));

        // 3
        Arrays.sort(rosterAsArray, Person::compareByAge);

        // 4
        class ComparisonProvider {
            public int compareByName(Person a, Person b) {
                return a.getName().compareTo(b.getName());
            }

            public int compareByAge(Person a, Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        }
        ComparisonProvider myComparisonProvider = new ComparisonProvider();
        Arrays.sort(rosterAsArray, myComparisonProvider::compareByName);

        // a
        MethodReferencesExamples myApp = new MethodReferencesExamples();
        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", (a, b) -> a + b));

        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", MethodReferencesExamples::appendStrings));

        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", myApp::appendStrings2));

        System.out.println(MethodReferencesExamples.
                mergeThings("Hello ", "World!", String::concat));

        // Constructor
        Set<Person> rosterSetLambda = transferElements(roster, () -> {
            return new HashSet<>();
        });

        Set<Person> rosterSet = transferElements(roster, HashSet::new);

        Set<Person> rosterSet1 = transferElements(roster, HashSet<Person>::new);
    }

    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>>
    DEST transferElements(
            SOURCE sourceCollection,
            Supplier<DEST> collectionFactory) {
        DEST result = collectionFactory.get();
        result.addAll(sourceCollection);
        return result;
    }

    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b) {
        return a + b;
    }

    private String appendStrings2(String a, String b) {
        return a + b;
    }

}
