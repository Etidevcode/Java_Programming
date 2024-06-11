public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigCountKilos = bigCount * 5;
        int remainingGoal = goal - Math.min(goal / 5, bigCount) * 5;

        return remainingGoal <= smallCount;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4)); // Output: false
        System.out.println(canPack(1, 0, 5)); // Output: true
        System.out.println(canPack(0, 5, 4)); // Output: true
        System.out.println(canPack(2, 2, 11)); // Output: true
        System.out.println(canPack(-3, 2, 12)); // Output: false
    }
}
