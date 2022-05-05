package com.github.syntax.classes;

public class ClassExample {

    // class initialization
    // 1
    static {
    }

    // 2
    public static int myVar = initializeClassVariable();
    private static int initializeClassVariable() {
        // initialization code goes here
        return 0;
    }

    // instance initial
    // 1. constructor
    // 2. blocks
    // The Java compiler copies initializer blocks into every constructor. Therefore, this approach can be used to share a block of code between multiple constructors.
    {
    }
    // 3.
    private int myVar1 = initializeInstanceVariable();
    protected final int initializeInstanceVariable() {
        // initialization code goes here
        return 0;
    }

    private int cadence;
    private int gear;
    private int speed;

    private final int id;

    private static int numberOfBicycles = 0;

    public ClassExample(int startCadence,
                   int startSpeed,
                   int startGear) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;

        id = ++numberOfBicycles;
    }

    public int getID() {
        return id;
    }

    // Overloading Methods
    // method signatures = method name + method parameter list
    // Note: Overloaded methods should be used sparingly, as they can make code much less readable.
    public void draw(String s) {
    }

    public void draw(int i) {
    }

    // Arbitrary Number of Arguments
    public void draw(int... corners) {
    }

}
