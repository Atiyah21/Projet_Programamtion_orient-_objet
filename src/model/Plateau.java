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
		TuileDominos init = new TuileDominos(n, e, s, w);
		put(new Coords(0, 0), init);
	}

	public Plateau(Tuile t) {
		super();
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

	public int isValid(Coords c, Tuile t){
        if(!isReachable(c))
            return -1;

        if(get(c) != null)
            return -1;
        
        int points = 0;
        
        Tuile left  = get(new Coords(c.x - 1, c.y));
        Tuile right = get(new Coords(c.x + 1, c.y));
        Tuile down  = get(new Coords(c.x, c.y - 1));
        Tuile up    = get(new Coords(c.x, c.y + 1));
        
        if(left != null){
            int tmp = t.w.getPoints(left.e);
            if(tmp == -1)
                return -1;
            points += tmp;
        }
        if(right != null){
            int tmp = t.e.getPoints(right.w);
            if(tmp == -1)
                return -1;
            points += tmp;
        }
        if(down != null){
            int tmp = t.s.getPoints(down.n);
            if(tmp == -1)
                return -1;
            points += tmp;
        }
        if(up != null){
            int tmp = t.n.getPoints(up.s);
            if(tmp == -1)
                return -1;
            points += tmp;
        }
        return points;
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
