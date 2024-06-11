import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int count = readInteger();
        int[] array = readElements(count);
        int minValue = findMin(array);
        System.out.println("Minimum Value in the array is: " + minValue);
    }

    private static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of elements:");
        return scanner.nextInt();
    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter element #" + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
