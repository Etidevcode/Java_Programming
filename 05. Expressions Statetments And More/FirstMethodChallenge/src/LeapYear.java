public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); // Output: false
        System.out.println(isLeapYear(1600));  // Output: true
        System.out.println(isLeapYear(2017));  // Output: false
        System.out.println(isLeapYear(2000));  // Output: true
    }
}
