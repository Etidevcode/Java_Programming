public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Multiply both numbers by 1000 to keep three decimal places
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);

        // Compare the scaled numbers for equality
        return scaledNum1 == scaledNum2;
    }

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));  // Output: true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));    // Output: false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));        // Output: true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));   // Output: false
    }
}
