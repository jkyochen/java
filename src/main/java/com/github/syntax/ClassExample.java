package com.github.syntax;

public class ClassExample {

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
