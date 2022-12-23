package model;

public class Player {
	String nom;
	int points;

	public Player(String n) {
		nom = n;
		points = 0;
	}

	public void addPoints(int p) {
		points += p;
	}

	public int getPoints() {
		return points;
	}
}
