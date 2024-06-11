public class Main {

    public static void main(String[] args) {

        String bulleIt = "Print a Bulleted List." +
                "\u2022 First Point" +
                "\u2022 Sub Point";
        System.out.println(bulleIt);

        System.out.println();
        String textBlock = """
                Print a Bulleted List:
                \u2022 First Point
                \u2022 Sub Point
                """;
        System.out.println(textBlock);

        System.out.println();
        int age = 35;
        System.out.printf("Your age is %d\n", age);

        System.out.println();
        int yearsOfBirth = 2023 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearsOfBirth);
        System.out.printf("You age is %f%n", (float)age);

        System.out.println();
        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }

        System.out.println();
        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        System.out.println();
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }
}
