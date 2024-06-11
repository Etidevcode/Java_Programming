package com.etienne;

/**
 * Created by Etienne KOA
 */

public class Main {

	public static void main(String[] args) {

		System.out.println("The sum of digit in number 125 is " + sumDigits(125));
		System.out.println("The sum of digit in number -125 is " + sumDigits(-125));
		System.out.println("The sum of digit in number 4 is " + sumDigits(4));
		System.out.println("The sum of digit in number 32123 is " + sumDigits(32123));
	}

	private static int sumDigits(int number) {

		if (number < 10){
			return  -1;
		}

		int sum = 0;

		// 125 -> 125/10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
		while (number > 0){
			// extract the lest-significant digit
			int digit = number % 10;
			sum += digit;

			// drop the least-signification digit
			number /= 10; // same as number = number / 10;
		}
		return sum;
	}
}
