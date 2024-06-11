public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore1 = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore1 is " + highScore1);

        gameOver = true;
        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        int highScore2 = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore2 is " + highScore2);

        gameOver = true;
        score = 8500;
        levelCompleted = 7;
        bonus = 350;

        int highScore3 = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore3 is " + highScore3);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if(gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
