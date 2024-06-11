public class AreaCalculator {

    private static final double PI = Math.PI;

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return PI * radius * radius;
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        } else {
            return x * y;
        }
    }

    public static void main(String[] args) {
        System.out.println(area(5.0));         // Output: 78.53975
        System.out.println(area(-1));         // Output: -1
        System.out.println(area(5.0, 4.0));    // Output: 20.0
        System.out.println(area(-1.0, 4.0));   // Output: -1
    }
}
