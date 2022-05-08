package com.github.syntax.classes.inner.lambda;

import java.util.concurrent.Callable;

public class TargetTypeExample {

    static void invoke(Runnable r) {
        r.run();
    }

    static <T> T invoke(Callable<T> c) throws Exception {
        return c.call();
    }

    public static void main(String[] args) throws Exception {
        String s = invoke(() -> "done");
    }

}
