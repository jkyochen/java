package com.github.std;

public class Arrays {

    static String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto"};

    public static void main(String[] args) {
        streamPrintln();
        parallelSortExample();
    }

    static void parallelSortExample() {
        java.util.Arrays.parallelSort(copyFrom);
        System.out.println(java.util.Arrays.toString(copyFrom));
    }

    static void streamPrintln() {
        java.util.Arrays.stream(copyFrom).map(coffee -> coffee + "\n").forEach(System.out::print);
    }
}
