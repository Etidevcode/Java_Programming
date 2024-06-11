package com.etienne;/*
 * Created by Etienne KOA
 */

public class CodeBlocks {

	public static void main(String[] args) {

		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

		if (score < 5000 && score > 1000) {
			System.out.println("Your score was less than 5000 but greater than 1000");
		} else if (score < 1000) {
			System.out.println("Your score was less than 1000");
		} else {
			System.out.println("Got here");
		}

		System.out.println("-".repeat(60));
		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}
		System.out.println("-".repeat(60));
		// Print out a second score on the screen with the following
		// score set to 10000
		// levelCompleted set to 8
		//  bonuse= set to 200
		// But make sure the first printout above still displays as well

		boolean newGameOver = true;
		int newScore = 800;
		int newLevelCompleted = 5;
		int newBonus = 100;

		if (gameOver) {
			int finalScore = newScore + (newLevelCompleted * newBonus);
			System.out.println("Your final score was " + finalScore);
		}
		System.out.println("-".repeat(60));


		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was " + finalScore);
		}

	}
}
