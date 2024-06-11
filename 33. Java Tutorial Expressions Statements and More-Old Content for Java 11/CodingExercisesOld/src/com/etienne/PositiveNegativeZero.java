package com.etienne;

/*
 * Created by Etienne KOA
 */


public class PositiveNegativeZero {

	public static void main(String[] args) {
		checkNumber(-5);
		checkNumber(10);
	}

	public static void checkNumber(int number) {
		if (number > 0) {
			System.out.println("positive");
		} else {
			System.out.println("negative");
		}
	}
}
