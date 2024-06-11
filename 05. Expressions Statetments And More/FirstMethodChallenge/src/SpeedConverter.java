public class SpeedConverter {



    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void main(String[] args) {
        printConversion(1.5);     // Output: 1.5 km/h = 1 mi/h
        printConversion(10.25);   // Output: 10.25 km/h = 6 mi/h
        printConversion(-5.6);    // Output: Invalid Value
        printConversion(25.42);   // Output: 25.42 km/h = 16 mi/h
        printConversion(75.114);  // Output: 75.114 km/h = 47 mi/h
    }
}
