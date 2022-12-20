package model;

import java.util.HashMap;
import java.lang.StringBuilder;

public class Plateau extends HashMap<Coords, Tuile> {

	public int max_x = 0;
	public int max_y = 0;
	public int min_x = 0;
	public int min_y = 0;

	public Plateau() {
		super();
		int[] n = { 3, 0, 0 };
		int[] e = { 4, 0, 0 };
		int[] s = { 1, 0, 0 };
		int[] w = { 2, 0, 0 };
		Tuile init = new Tuile(n, e, s, w);
		put(new Coords(0, 0), init);
	}

	public Plateau(Tuile t) {
		put(new Coords(0, 0), t);
	}

	public String toString() {
		StringBuilder acc = new StringBuilder();

		return acc.toString();
	}

	public boolean isFree(Coords c) {
		return get(c) == null;
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
		return get(c);
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
		if (!isFree(n[0]))
			if (Utils.equals(get(n[0]).id_e, t.id_w))
				acc += Utils.sum(t.id_w);
		if (!isFree(n[1]))
			if (Utils.equals(get(n[1]).id_w, t.id_e))
				acc += Utils.sum(t.id_e);
		if (!isFree(n[2]))
			if (Utils.equals(get(n[2]).id_s, t.id_n))
				acc += Utils.sum(t.id_n);
		if (!isFree(n[3]))
			if (Utils.equals(get(n[3]).id_n, t.id_s))
				acc += Utils.sum(t.id_s);
		if (acc == 0)
			return -1;
		return acc;
	}

	public int place(Coords c, Tuile t) {
		int v = isValid(c, t);
		if (v > -1) {
			put(c, t);
			if (c.x < min_x)
				min_x = c.x;
			if (c.x > max_x)
				max_x = c.x;
			if (c.y < min_y)
				min_y = c.y;
			if (c.y > max_y)
				max_y = c.y;
		}
		return v;
	}
}
