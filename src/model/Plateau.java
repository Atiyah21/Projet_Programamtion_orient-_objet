package model;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.util.LinkedList;
import java.util.List;

public class Plateau {
	Stack<Tuile> sac;
	Map<Coords, Tuile> plateau;

	public Plateau() {
		sac = new Stack<>();
		plateau = new HashMap<>();
	}

	public boolean isFree(Coords c) {
		return plateau.get(c) == null;
	}

	public List<Tuile> near(Coords c) {
		List<Tuile> acc = new LinkedList<>();
		Coords[] cs = new Coords[4];
		cs[0] = new Coords(c.x - 1, c.y);
		cs[1] = new Coords(c.x + 1, c.y);
		cs[2] = new Coords(c.x, c.y - 1);
		cs[3] = new Coords(c.x, c.y + 1);
		for (Coords c1 : cs) {
			if (!isFree(c1))
				acc.add(plateau.get(c1));
		}
		return acc;
	}

	public boolean isReachable(Coords c) {
		return !near(c).isEmpty();
	}

	public int isValid(Coords c, Tuile t) {
		// return -1 if invalid, and n for winning n points
		if (!isFree(c))
			return -1;
		if (!isReachable(c))
			return -1;
		int acc = 0;

		if (!isFree(new Coords(c.x - 1, c.y)))
			return -1;

		return acc;
	}
}
