package com.etienne;

/*
 * Created by Etienne KOA
 */

public class Main {

	public static void main(String[] args) {

		int count = 1;
		/*

		while (count != 6){
			System.out.println("Count value is " + count);
			// count++;
		}
		*/

		/*
		for (int i =6; i != 6; i++){
				System.out.println("Count value is " + count);
		}
		*/


		/*
		count = 1;
		while (true) {
			if (count == 6){
				break;
			}
			System.out.println("Count value is " + count);
			count++;
		}
		*/

		/*
		count = 6;
		do {
			System.out.println("Count value was " + count);
			count++;
		} while (count != 6);
		*/


		count = 6;
		do {
			System.out.println("Count value was " + count);
			count++;

			if (count > 100){
				break;
			}
		} while (count != 6);

		int number = 4;
		int finishNumber = 20;
		int eventNumbersFound = 0;

		while (number <= finishNumber) {
			number++;
			if (!isEventNumber(number)){
				continue;
			}
			eventNumbersFound++;
			if (eventNumbersFound >= 5){
				break;
			}
			System.out.println("Even number " + number);
		}
	}

	public static boolean isEventNumber(int number) {

		if ((number % 2) == 0){
			return true;
		} else {
			return false;
		}
	}
}
