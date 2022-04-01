package com.github.syntax;

public class Operators {

    public static void main(String[] args) {

        // Conditional Operators
        // ternary operator
        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;
        System.out.println(result);

        // The Type Comparison Operator instanceof
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("obj1 instanceof Parent: " + (obj1 instanceof Parent));
        System.out.println("obj1 instanceof Child: " + (obj1 instanceof Child));
        System.out.println("obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));
        System.out.println("obj2 instanceof Parent: " + (obj2 instanceof Parent));
        System.out.println("obj2 instanceof Child: " + (obj2 instanceof Child));
        System.out.println("obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));

        // null is not an instance of anything.
        System.out.println("null instanceof Parent: " + (null instanceof Parent));

        // Bitwise and Bit Shift Operators
        // ~       Unary bitwise complement
        // <<      Signed left shift
        // >>      Signed right shift
        // >>>     Unsigned right shift
        // &       Bitwise AND
        // ^       Bitwise exclusive OR
        // |       Bitwise inclusive OR
    }

    static class Parent {
    }

    static class Child extends Parent implements MyInterface {
    }

    interface MyInterface {
    }
}
