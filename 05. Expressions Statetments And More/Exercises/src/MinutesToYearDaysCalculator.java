public class MinutesToYearDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long days = minutes / (60 * 24);
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);   // Output: 525600 min = 1 y and 0 d
        printYearsAndDays(1051200);  // Output: 1051200 min = 2 y and 0 d
        printYearsAndDays(561600);   // Output: 561600 min = 1 y and 25 d
    }
}
