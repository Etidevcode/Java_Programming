/*
		%1$ - first argument
		%2$ - second argument
		%3$ - third argument
		%{index}$ - {index} argument

*/

public class Main {


	public static void main(String[] args) {

		String s1 = "hello1";
		String s2 = "hello2";
		Integer s3 = 333;

		String result = String.format("Test: %3$d, %1$s, %1$s, %2$s", s1, s2, s3);
		System.out.println(result);

	}
}