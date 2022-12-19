package model;

public class Tuile {

	public int[] id_n;
	public int[] id_e;
	public int[] id_s;
	public int[] id_w;

	public Tuile() {
		id_n = new int[3];
		id_e = new int[3];
		id_s = new int[3];
		id_w = new int[3];
	}

	public Tuile(int[] n, int[] e, int[] s, int[] w) {
		id_n = n;
		id_e = e;
		id_s = s;
		id_w = w;
	}

	public void rotate() {
		id_w = Utils.revert(id_w);
		id_e = Utils.revert(id_e);
		int[] tmp = id_n;
		id_n = id_w;
		id_w = id_s;
		id_s = id_e;
		id_e = tmp;
	}

	public String toString() {
		String acc = "X";
		for (int i = 0; i < 3; i++) {
			acc += id_n[i];
		}
		acc += "X\n";
		for (int i = 0; i < 3; i++) {
			acc += id_w[i] + "   " + id_e[i] + "\n";
		}
		acc += "X";
		for (int i = 0; i < 3; i++) {
			acc += id_s[i];
		}
		acc += "X";
		return acc;
	}
}
