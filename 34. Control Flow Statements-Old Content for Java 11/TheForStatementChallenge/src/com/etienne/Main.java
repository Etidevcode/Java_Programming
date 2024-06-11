package com.etienne;

/*
 * Created by Etienne KOA
 */

public class Main {

	public static void main(String[] args) {
		System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
		System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
		System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
		System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

		System.out.println("**".repeat(20));

		for (int i = 0; i < 5; i++) {
			System.out.println("Loop " + i + " hello");
		}

		// Using the for statement, call the calculateInterest method with
		// the amount of 10000 with an InterestRate of 2,3,4,5,6,7 and 8
		// and print the results to the console window.

		System.out.println("**".repeat(20));

		for (int i = 2; i < 9; i++) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
		}

		System.out.println("**".repeat(20));

		// How would you modify the for loop above to do the same thing as
		// show but to start from 8% and work back to 2%
		for (int i = 8; i >= 2; i--) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
		}

		System.out.println("**".repeat(20));
		int count = 0;
		for (int i = 10; i < 50; i++) {
			if (isPrime(i)){
				count++;
				System.out.println("Number " + i + " is a prime number");
				if (count == 10){
					System.out.println("Existing for loop");
					break;
				}
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}

		for (int i=2; i <= n/2; i++){  // i <= (long) Math.sqrt(n)
			if (n % i == 0) {
				System.out.println("Looping " + i);
				return false;
			}
		}
		return true;
	}
	public static double calculateInterest(double amount, double interestRate) {
		return (amount * (interestRate/100));
	}
}
