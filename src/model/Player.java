package model;

import java.awt.Color;

public class Player implements Comparable<Player> {
	String name;
	int points;
	boolean isAi;
	Color color = Color.white;

	public Player(String n) {
		this(n, false);
	}

	public Player(String n, boolean i) {
		name = n;
		points = 0;
		isAi = i;
		color = Utils.randomColor();
	}

	public Player(String n, boolean i, Color c) {
		this(n, i);
		color = c;
	}

	public void addPoints(int p) {
		points += p;
	}

	public int getPoints() {
		return points;
	}

	public void setAi(boolean ai) {
		isAi = ai;
	}

	public String getName() {
		return name;
	}

	public boolean isAi() {
		return isAi;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int compareTo(Player p) {
		return p.getPoints() - points;
	}
}
