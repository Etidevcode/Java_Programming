public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945)); // This is the first test case
        System.out.println(getDurationString(-65, 45)); //This is the second test
        System.out.println(getDurationString(65, 145)); //This is the third test
        System.out.println(getDurationString(65, 45)); //This is the fourth test
        System.out.println(getDurationString(3945)); //This is the five test
    }

    public static String getDurationString(int seconds) {


        if (seconds < 0) {
            return  "Invalid data for seconds (" + seconds + "), must be a positive integer value";
        }
            return getDurationString(seconds / 60, seconds % 60);
        /*
        else {
            int minutes = seconds / 60;
            return getDurationString(minutes, seconds);
        }*/

        // Two step approach to get hours
        // int minutes = seconds / 60;

        // int hours = minutes / 60;
        // System.out.println("hours = " + hours);

        // int remainingMinutes = minutes % 60;
        // System.out.println("minutes = " + minutes);
        // System.out.println("remainingMinutes = " + remainingMinutes);

        // int remainingSeconds = seconds % 60;
        // System.out.println("remainingSeconds = " + remainingSeconds);

        // One step approach to get hours
        // int hours1 = seconds / 3600;
        // System.out.println("hours1 = " + hours1);
        // return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for minute (" + minutes + "), must be a positive integer value";
        }

        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds (" + seconds + "), must be between 0 and 59";
        }

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        // int remainingSeconds = seconds % 60;

        //return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
