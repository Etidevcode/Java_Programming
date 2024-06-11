import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        var result = IntStream
                .iterate(0, i -> i <= 1000, i -> i + 3)
                .summaryStatistics();
        System.out.println("Result = " + result);
        System.out.println("-".repeat(60));


        var leapYearData = IntStream
                .iterate(2000, i -> i <= 2025, i -> i + 1)
                .filter(i -> i % 4 == 0)
                .peek(System.out::println)
                .summaryStatistics();

        System.out.println("-".repeat(60));
        System.out.println("Leap Year Data = " + leapYearData);
        System.out.println("-".repeat(60));


        Seat[] seats = new Seat[100];
        Arrays.setAll(seats, i -> new Seat((char) ('A' + i/10), i % 10 +1));
        // Arrays.asList(seats).forEach(System.out::println);


        long reservationCount = Arrays
                .stream(seats)
                .filter(Seat::isReserved)
                .count();
        System.out.println("reservationCount = " + reservationCount);
        System.out.println("-".repeat(60));

        boolean hasBookings = Arrays
                .stream(seats)
                .anyMatch(Seat::isReserved);
        System.out.println("hasBookings = " + hasBookings);
        System.out.println("-".repeat(60));

        boolean fullyBooked = Arrays
                .stream(seats)
                .allMatch(Seat::isReserved);
        System.out.println("fullyBooked = " + fullyBooked);
        System.out.println("-".repeat(60));

        boolean evenWashedOut = Arrays
                .stream(seats)
                .noneMatch(Seat::isReserved);
        System.out.println("evenWashedOut = " + evenWashedOut);
        System.out.println("-".repeat(60));



    }
}