package com.github.syntax.classes.inner;

// inner classes
public class OuterClass {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        InnerClass innerClass = outerClass.new InnerClass();
    }

    class InnerClass {
        static final int i = 1;
    }

}
