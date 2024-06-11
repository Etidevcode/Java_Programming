package com.etienne;/*
 * Created by Etienne KOA
 */

public class MethodJava {

	public static void main(String[] args) {


		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		System.out.println("-".repeat(60));
		int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);
		System.out.println("-".repeat(60));


	    score = 10000;
		levelCompleted = 8;
		bonus = 200;
		highScore = calculateScore(gameOver, score, levelCompleted, bonus);
		System.out.println("Your final score was " + highScore);

		System.out.println("-".repeat(60));
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Etienne", highScorePosition);
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Bob", highScorePosition);
		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Percy", highScorePosition);
		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Louise", highScorePosition);
		highScorePosition = calculateHighScorePosition(721);
		displayHighScorePosition("Carol", highScorePosition);
		highScorePosition = calculateHighScorePosition(3750);
		displayHighScorePosition("Tom", highScorePosition);
		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("John", highScorePosition);

	}

	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position "
					+ highScorePosition + " on the high score table");
	}

	private static int calculateHighScorePosition(int playScore) {
		/*if (playScore >= 1000) {
			return 1;
		} else if (playScore >= 500) {
			return 2;
		} else if (playScore >= 100) {
			return 3;
		}
		return 4;*/

		int position = 4;

		if (playScore >= 1000) {
			position = 1;
		} else if (playScore >= 500) {
			position = 2;
		} else if (playScore >= 100) {
			position = 3;
		}
		return position;
	}

	private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return - 1;
	}
}
