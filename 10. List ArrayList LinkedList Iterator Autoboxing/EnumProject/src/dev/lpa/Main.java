package dev.lpa;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        DayOfWeek weekDay = DayOfWeek.TUES;
        System.out.println(weekDay);

        System.out.println("***".repeat(10));

        for(int i = 0; i < 10; i++) {

            /*
                    Without Switch
                    ===============
             */

            // weekDay = getRandomDay();
            // System.out.printf("Name is %s, Ordinal Value = %d%n",
            //        weekDay.name(), weekDay.ordinal());

            // if(weekDay == DayOfWeek.FRI) {
            //    System.out.println("Found a Friday !!!");
            // }

            /*
                    With Switch
                    ===============
             */
            weekDay = getRandomDay();
            switchDayOfWeek(weekDay);
        }

        System.out.println("***".repeat(10));
        for (Topping topping : Topping.values()) {
            System.out.println(topping.name() + " : " + topping.getPrice());
        }
    }

    public static void switchDayOfWeek(DayOfWeek weekDay) {

        int weekDayInteger = weekDay.ordinal() + 1;

        switch (weekDay) {
            case WED -> System.out.println("Wednesday is Day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is Day " + weekDayInteger);
            default -> System.out.println(
                            weekDay.name().charAt(0) +
                            weekDay.name().substring(1).toLowerCase() +
                            "day is Day " + weekDayInteger);
        }
    }

    public static DayOfWeek getRandomDay() {

        int randomInteger = new Random().nextInt(7);
        var allDays = DayOfWeek.values();
        return allDays[randomInteger];
    }
}
