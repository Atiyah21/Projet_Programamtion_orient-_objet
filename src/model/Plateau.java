package model;

import java.util.HashMap;

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

		String acc1 = "";
		String acc2 = "";
		String acc3 = "";
		String acc4 = "";
		String acc5 = "";
		for(int i = min_x; i<=max_x; i++){
			for(int j =min_y; j<=max_y; j++){
				if(get(new Coords(i,j)) == null) {
					acc1 += "XXXXXXXXX";
					acc2 += "XXXXXXXXX";
					acc3 += "XXXXXXXXX";
					acc4 += "XXXXXXXXX";
					acc5 += "XXXXXXXXX";
				}
				else{
					TuileDominos t = (TuileDominos) get(new Coords(i,j));
					
					SideDominos n = (SideDominos) t.getN();
					SideDominos w = (SideDominos) t.getW();
					SideDominos e = (SideDominos) t.getE();
					SideDominos s = (SideDominos) t.getS();
					
					acc1 += "X-" + n.getTab()[0] + "-" + n.getTab()[1] + "-" +  n.getTab()[2] + "-X ";
					acc2 += w.getTab()[0] + "       " +e.getTab()[0] + " " ;
					acc3 += w.getTab()[1] + "       " +e.getTab()[1] + " ";
					acc4 += w.getTab()[2] + "       " +e.getTab()[2] + " ";
					acc5 += "X-" + s.getTab()[0] + "-" + s.getTab()[1] + "-" +  s.getTab()[2] + "-X ";
				}
				
			}
				System.out.println(acc1);
				System.out.println(acc2);
				System.out.println(acc3);
				System.out.println(acc4);
				System.out.println(acc5);
				System.out.println();
				
				acc1 = "";
				acc2 = "";
				acc3 = "";
				acc4 = "";
				acc5 = "";
		}	
		return "";
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
            int tmp = t.n.getPoints(down.s);
            if(tmp == -1)
                return -1;
            points += tmp;
        }
        if(up != null){
            int tmp = t.s.getPoints(up.n);
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
