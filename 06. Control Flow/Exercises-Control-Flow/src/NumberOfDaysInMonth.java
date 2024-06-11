public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999 || month < 1 || month > 12) {
            return -1;
        } else {
            switch (month) {
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020)); // Output: 31
        System.out.println(getDaysInMonth(2, 2020)); // Output: 29
        System.out.println(getDaysInMonth(2, 2018)); // Output: 28
        System.out.println(getDaysInMonth(-1, 2020)); // Output: -1
        System.out.println(getDaysInMonth(1, -2020)); // Output: -1
    }
}
