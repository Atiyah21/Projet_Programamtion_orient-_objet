package model;

public class TuileDominos extends Tuile{

	public TuileDominos(int[] n, int[] e, int[] s, int[] w){
		this.n = new SideDominos(n);
		this.e = new SideDominos(e);
		this.s = new SideDominos(s);
		this.w = new SideDominos(w);
	}

	public void rotate(){
        w.revert();
		e.revert();
		Side tmp = n;
		n = w;
		w = s;
		s = e;
		e = tmp;
    }

	public String toString() {
		String acc = "X";
		for (int i = 0; i < 3; i++) {
			acc +="-" + ((SideDominos) n).getTab()[i];
		}
		acc += "-X\n";
		for (int i = 0; i < 3; i++) {
			acc += ((SideDominos) w).getTab()[i] + "       " + ((SideDominos) e).getTab()[i] + "\n";
		}
		acc += "X";
		for (int i = 0; i < 3; i++) {
			acc += "-" + ((SideDominos) s).getTab()[i];
		}
		acc += "-X";
		return acc;
	}
}
