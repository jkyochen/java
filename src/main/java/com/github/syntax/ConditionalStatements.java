package com.github.syntax;

public class ConditionalStatements {
    public static String convertNumberToEnglishWord(int value) {
        if (value == 1) {
            return "one";
        } else if (value == 2) {
            return "two";
        } else if (value == 3) {
            return "three";
        }
        return "I don't know";
    }

    // Switch required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
    public static String convertNumberToEnglishWordPlan2(int value) {
        String engWord = "I don't know, Please";
        switch (value) {
            case 1:
                engWord = "one";
                break;
            case 2:
                engWord = "two";
                break;
            case 3:
                engWord = "three";
                break;
        }
        return engWord;
    }

    // jdk 12
    // https://docs.oracle.com/en/java/javase/12/language/index.html#JSLAN-GUID-BA4F63E3-4823-43C6-A5F3-BAA4A2EF3ADC
    // https://openjdk.java.net/jeps/325
    // jdk 13
    // https://docs.oracle.com/en/java/javase/13/language/switch-expressions.html
    // https://openjdk.java.net/jeps/354
    public static String convertNumberToEnglishWordPlan3(int value) {
        return switch (value) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "I really don't know";
        };
    }

}
