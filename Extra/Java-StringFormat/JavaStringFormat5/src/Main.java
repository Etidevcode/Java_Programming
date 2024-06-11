public class Main {

	public static void main(String[] args) {

		double pi = Math.PI;

		// default
		String result1 = String.format("%f", pi);

		// 2 decimal points
		String result2 = String.format("%.2f", pi);

		String result3 = String.format("%e", pi);

		String result4 = String.format("%a", pi);

		// right
		String result5 = String.format("|%20f|", pi);

		// left
		String result6 = String.format("|%-20f|", pi);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);

		// 1100100
		String result7 = String.format("%s", Integer.toBinaryString(100));
		String result8 = String.format("%32s", Integer.toBinaryString(100)).replace(" ", "0");
		String result9 = String.format("%32s", Integer.toBinaryString(123456)).replace(" ", "0");

		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
	}
}