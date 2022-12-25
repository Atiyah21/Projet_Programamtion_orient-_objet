package model;

public class Player implements Comparable<Player> {
	String name;
	int points;
	boolean isAi;

	public Player(String n) {
		this(n, false);
	}

	public Player(String n, boolean i) {
		name = n;
		points = 0;
		isAi = i;
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

	public int compareTo(Player p) {
		return p.getPoints() - points;
	}
}
