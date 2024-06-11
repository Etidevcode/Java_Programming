public class Main {

    public static void main(String[] args) {

        System.out.println("=============================================================");

        for (int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }
        System.out.println("=============================================================");

        for (double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(1000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        System.out.println("=============================================================");
        /*System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));*/

        for (double i = 7.5; i <= 10; i += 0.25){
            double interestAmount = calculateInterest(100.00, i);
            if(interestAmount > 8.5) {
                break;
            }
            System.out.println("$100.00 at " + i + "% interest = $" + interestAmount);
        }
        System.out.println("=============================================================");
    }

    public  static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
