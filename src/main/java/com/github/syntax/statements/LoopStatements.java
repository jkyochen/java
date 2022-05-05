package com.github.syntax.statements;

public class LoopStatements {

    public static void main(String[] args) {
        enhancedFor();
    }

    // for-each loop
    // implementing Iterable interface
    static void enhancedFor() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }
    }
}
