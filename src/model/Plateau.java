package model;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;
import java.lang.StringBuilder;

public class Plateau {
	Stack<Tuile> sac;
	public Map<Coords, Tuile> plateau;

	int max_x = 0;
	int max_y = 0;
	int min_x = 0;
	int min_y = 0;

	public Plateau() {
		sac = new Stack<>();
		plateau = new HashMap<>();
		int[] n = { 3, 0, 0 };
		int[] e = { 4, 0, 0 };
		int[] s = { 1, 0, 0 };
		int[] w = { 2, 0, 0 };
		Tuile init = new Tuile(n, e, s, w);
		plateau.put(new Coords(0, 0), init);
		System.out.println(isReachable(new Coords(1, 0)));
		System.out.println(isReachable(new Coords(2, 0)));
	}

	public String toString() {
		StringBuilder acc = new StringBuilder();

		return acc.toString();
	}

	public boolean isFree(Coords c) {
		return plateau.get(c) == null;
	}

	public Coords[] near(Coords c) {
		Coords[] cs = new Coords[4];
		cs[0] = new Coords(c.x - 1, c.y);
		cs[1] = new Coords(c.x + 1, c.y);
		cs[2] = new Coords(c.x, c.y - 1);
		cs[3] = new Coords(c.x, c.y + 1);
		return cs;
	}

	public Tuile getTuile(Coords c) {
		return plateau.get(c);
	}

	public boolean isReachable(Coords c) {
		for (Coords cs : near(c)) {
			if (!isFree(cs))
				return true;
		}
		return false;
	}

	public int isValid(Coords c, Tuile t) {
		// return -1 if invalid, and n for winning n points
		if (!isFree(c)) {
			System.out.println(1);
			return -1;
		}
		if (!isReachable(c)) {
			System.out.println(2);
			return -1;
		}
		int acc = 0;

		Coords[] n = near(c);
		for (int i = 0; i < 4; i++) {
			switch (i) {
				case 0:
					if (!isFree(n[i]))
						if (Utils.equals(plateau.get(n[i]).id_e, t.id_w))
							acc += Utils.sum(t.id_w);
					break;
				case 1:
					if (!isFree(n[i]))
						if (Utils.equals(plateau.get(n[i]).id_w, t.id_e))
							acc += Utils.sum(t.id_e);
					break;
				case 2:
					if (!isFree(n[i]))
						if (Utils.equals(plateau.get(n[i]).id_s, t.id_n))
							acc += Utils.sum(t.id_n);
					break;
				case 3:
					if (!isFree(n[i]))
						if (Utils.equals(plateau.get(n[i]).id_n, t.id_s))
							acc += Utils.sum(t.id_s);
					break;
				default:
					break;
			}
		}
		if (acc == 0)
			return -1;
		return acc;
	}
}
