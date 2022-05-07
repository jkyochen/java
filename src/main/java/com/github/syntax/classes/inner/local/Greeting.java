package com.github.syntax.classes.inner.local;

public class Greeting {

    public void greetInEnglish(String name) {
        interface HelloThere {
            public void greet();
        }
        class EnglishHelloThere implements HelloThere {

            @Override
            public void greet() {
                System.out.println("Hello " + name);
            }
        }
        EnglishHelloThere myGreeting = new EnglishHelloThere();
        myGreeting.greet();
    }

    public void sayGoodbyeInEnglish() {
        class EnglishGoodbye {
            public static void sayGoodbye() {
                System.out.println("Bye bye");
            }
        }
        EnglishGoodbye.sayGoodbye();
    }

    public void sayGoodbyeInEnglishAgain() {
        class EnglishGoodbye {
            public static final String farewell = "Bye bye again";

            public void sayGoodbye() {
                System.out.println(farewell);
            }
        }
        EnglishGoodbye myEnglishGoodbye = new EnglishGoodbye();
        myEnglishGoodbye.sayGoodbye();
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.greetInEnglish("test");
        greeting.sayGoodbyeInEnglish();
        greeting.sayGoodbyeInEnglishAgain();
    }
}
