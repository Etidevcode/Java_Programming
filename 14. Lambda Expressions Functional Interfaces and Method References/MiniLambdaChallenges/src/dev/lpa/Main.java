package dev.lpa;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printWords = new Consumer<String>() {
            @Override
            public void accept(String sentence) {
                String[] parts = sentence.split(" ");
                for (String part : parts) {
                    System.out.println(part);
                }
            }
        };

       Consumer<String> printWordsLambda = sentence ->{
           String[] parts = sentence.split(" ");
           for (String part : parts) {
               System.out.println(part);
           }
       };

       System.out.println("-".repeat(10));
       printWords.accept("Let's split this upinfo an array");
       System.out.println("-".repeat(10));
       printWords.accept("Let's split this up into an array");


        Consumer<String> printWordsForEach = sentence -> {
            String[] parts = sentence.split(" ");
            Arrays.asList(parts).forEach(s -> System.out.println(s));
        };

        System.out.println("-".repeat(10));
        printWordsForEach.accept("Let's split this upinfo an array");


        Consumer<String> printWordsConcise = sentence -> {
            Arrays.asList(sentence.split(" ")).forEach(s -> System.out.println(s));
        };

        System.out.println("-".repeat(10));
        printWordsForEach.accept("Let's split this upinfo an array");

        //Function<String,String> everySecondChar = source -> {
        UnaryOperator<String> everySecondChar = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

        System.out.println(everySecondChar.apply("1234567890"));

        String result = everySecondCharacter(everySecondChar, "1234567890");
        System.out.println(result);

        Supplier<String> iloveJava= () -> "I love Java!";
        Supplier<String> iloveJava2 = () -> {return "I love Java!";};

        System.out.println(iloveJava.get());
        System.out.println(iloveJava2.get());
    }

    public static String everySecondChar(String source) {

        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

    public static String everySecondCharacter(Function<String, String> func,String source) {

        return func.apply(source);
    }
}
