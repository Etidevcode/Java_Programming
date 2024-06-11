public class Main {


	public static void main(String[] args) {

		String result = String.format("%s is %d", "John", 38);
		System.out.println(result);

		String result2 = String.format("%d + %d = %d", 1, 1, 1 + 1);
		System.out.println(result2);

		String result3 = String.format("%s = %f", "PI", Math.PI);
		String result4 = String.format("%s = %.3f", "PI", Math.PI);
		System.out.println(result3);
		System.out.println(result4);
	}
}