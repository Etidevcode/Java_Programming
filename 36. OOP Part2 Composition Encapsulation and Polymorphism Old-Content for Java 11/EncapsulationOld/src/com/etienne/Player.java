package com.etienne;

/**
 * Created by Etienne KOA
 */

public class Player {

	private String name;
	private int health;
	private String weapon;

	public void loseHealth(int damage) {
		this.health = this.health - damage;
		if (this.health <= 0){
			System.out.println("Played knocked out");
			// Reduce number of lives remaining for the player
		}
	}

	public int healthRemaining() {
		return this.health;
	}
}
