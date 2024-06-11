public class Main {
	public static void main(String[] args) {

		String input = "Hello World";

		// default
		String result1 = String.format("|%s|", input);

		// default right-justified
		String result2 = String.format("|%20s|", input);

		// left-justified
		String result3 = String.format("|%-20s|", input);

		// max length = 5
		String result4 = String.format("|%.5s|", input);

		// left pad result
		String result5 = String.format("|%20s|", input).replace(' ', '$');

		// left pad with $, ignore spaces in string
		String result6 = padLeft(input, 20, "$");

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);

	}

	public static String padLeft(String str, int width, String padWith){
		String result = "";
		String temp = String.format("%" + width + "s", str);
		if(temp.length() > str.length()){
			result = temp.substring(0, temp.length() - str.length()).replace(" ", padWith);
		}
		result += str;
		return result;
	}
}