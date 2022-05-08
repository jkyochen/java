package com.github.syntax.classes.inner.lambda;

import java.util.function.Consumer;

public class LambdaScopeExample {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {

            int z = 2;
            Consumer<Integer> myConsumer = y ->
            {
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("z = " + z);
                System.out.println("this.x = " + this.x);
                System.out.println("LambdaScopeTest.this.x = " + LambdaScopeExample.this.x);
            };

            myConsumer.accept(x);
        }
    }

    public static void main(String[] args) {
        LambdaScopeExample st = new LambdaScopeExample();
        FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }

}
