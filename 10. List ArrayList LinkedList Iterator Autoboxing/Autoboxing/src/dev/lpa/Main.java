package dev.lpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer boxedInt = Integer.valueOf(15); // de préférence, mais pas nécessaire
        // Integer deprecatedBoxing = new Integer(15); // Non apprécié depuis JDK 9
        int unboxedInt = boxedInt.intValue(); // pas nécessaire


        // Automatically

        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed.intValue();
        System.out.println(autoBoxed.getClass().getName());
        // System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLitteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] characterArray = {'a', 'b', 'c', 'd'};
        System.out.println(Arrays.toString(characterArray));

        //var ourList = getList(1, 2, 3, 4, 5);
        var ourList = List.of(1, 2, 3, 4, 5);
        System.out.println(ourList);
    }

    private static ArrayList<Integer> getList(Integer ... varargs) {

        ArrayList<Integer> alist = new ArrayList<>();

        for(int i : varargs) {
            alist.add(i);
        }
        return alist;
    }

    private static int returnAnInt(Integer i) {

        return i;
    }

    private static Integer returnAnInteger(int i) {
        return i;
    }

    private static Double getDoubleObject() {
        return Double.valueOf(100.00);
    }

    private static double getLitteralDoublePrimitive() {
        return 100.0;
    }
}
