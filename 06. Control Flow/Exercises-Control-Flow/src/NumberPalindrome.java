public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221)); // Output: true
        System.out.println(isPalindrome(707));   // Output: true
        System.out.println(isPalindrome(11212)); // Output: false
    }

}
