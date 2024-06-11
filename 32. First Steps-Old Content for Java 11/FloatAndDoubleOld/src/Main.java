/*
 * Created by Etienne KOA
 */

public class Main {

	public static void main(String[] args) {

		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		System.out.println("Float Minimum value = " + myMinFloatValue);
		System.out.println("Float Maximum value = " + myMaxFloatValue);

		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		System.out.println("Double Minimum value = " + myMinDoubleValue);
		System.out.println("Double Maximum value = " + myMaxDoubleValue);

		int myIntValue = 5 / 3;
		float myFloatValue = 5f / 3f;
		double myDoubleValue = 5.00 / 3.00;
		System.out.println("myIntValue = " + myIntValue);
		System.out.println("myFloatValue = " + myFloatValue);
		System.out.println("myDoubleValue = " + myDoubleValue);

		double numberOfPounds = 200d;
		double convertedKilograms = numberOfPounds + 0.45359237d;
		System.out.println("Converted Kilograms = " + convertedKilograms);

		double pi = 3.14159278d;
		double anotherNumber = 3_000_000.4_567_890d;
		System.out.println(pi);
		System.out.println(anotherNumber);

	}
}
