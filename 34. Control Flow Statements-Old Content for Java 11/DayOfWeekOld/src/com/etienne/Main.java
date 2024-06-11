package com.etienne;

/**
 * Created by Etienne KOA
 */

public class Main {

	public static void main(String[] args) {

		printDayOfTheWeekSweetch(-1);
		printDayOfTheWeekSweetch(0);
		printDayOfTheWeekSweetch(1);
		printDayOfTheWeekSweetch(1);
		printDayOfTheWeekSweetch(2);
		printDayOfTheWeekSweetch(3);
		printDayOfTheWeekSweetch(4);
		printDayOfTheWeekSweetch(5);
		printDayOfTheWeekSweetch(6);
		printDayOfTheWeekSweetch(7);

	}

	public static void printDayOfTheWeekSweetch(int day) {

		switch (day) {
			case 0 :
				System.out.println("Sunday");
				break;
			case 1 :
				System.out.println("Monday");
				break;
			case 2 :
				System.out.println("Tuesday");
				break;
			case 3 :
				System.out.println("Wednesday");
				break;
			case 4 :
				System.out.println("Thursday");
				break;
			case 5 :
				System.out.println("Friday");
				break;
			case 6 :
				System.out.println("Saturday");
				break;
			default:
				System.out.println("Invalid Day");
				break;
		}
	}

	public static void printDayOfTheWeekIf(int day) {

		if (day == 0) {
			System.out.println("Sunday");
		} else if (day == 1) {
			System.out.println("Monday");
		} else if (day == 2) {
			System.out.println("Tuesady");
		} else if (day == 3) {
			System.out.println("Wednesday");
		} else if (day == 4) {
			System.out.println("Thursday");
		} else if (day == 5) {
			System.out.println("Friday");
		} else if (day == 6) {
			System.out.println("Saturday");
		} else {
			System.out.println("Invalid day");
		}
	}
}
