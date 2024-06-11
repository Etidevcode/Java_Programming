package dev.lpa;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String sentence = "Hello, World!";
        boolean matches = sentence.matches("Hello, World!");
        System.out.println(matches);

        String challenges2 = "[A-Z][a-z\\s]+[.]"; //"[A-Z].*\\.";
        for (String s : List.of("The bike is red.",
                "I a m a new student.",
                "hello world.",
                "how are you?")) {
            boolean matched = s.matches(challenges2);
            System.out.println(matched + ": " + s);
        }

        String challenges3 = "[A-Z][\\p{all}]+[.?!]$";//"[A-Z][a-z\\s]+[.]";

        for (String s : List.of("The bike is red, and has flat tires.",
                "I love being a new L.P.A student!",
                "Hello, friends and family: Welcome!",
                "How are you, Mary?")) {
            boolean matched = s.matches(challenges3);
            System.out.println(matched + ": " + s);
        }
    }
}
