package model;

public class Coords {
	int x;
	int y;

	public Coords(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean equals(Object other) {
		if (!(other instanceof Coords))
			return false;
		Coords c = (Coords) other;
		return x == c.x && y == c.y;
	}

	public int hashCode() {
		int tmp = (y + ((x + 1) / 2));
		return x + (tmp * tmp);
	}

	public String toString() {
		return "x: " + x + " y:" + y;
	}
}
