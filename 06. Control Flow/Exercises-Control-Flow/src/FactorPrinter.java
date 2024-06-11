public class FactorPrinter {

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printFactors(6); // Output: 1 2 3 6
        printFactors(32); // Output: 1 2 4 8 16 32
        printFactors(10); // Output: 1 2 5 10
        printFactors(-1); // Output: "Invalid Value" since number is < 1
    }
}
