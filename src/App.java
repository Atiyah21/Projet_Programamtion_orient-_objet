import model.TuileDominos;
import model.Plateau;
import model.Coords;

import view.ContentView;

import java.awt.EventQueue;

public class App {
	public static void main(String[] args) {

		int[] tab = new int[3];
		tab[0] = 0;
		tab[1] = 1;
		tab[2] = 2;
		TuileDominos t = new TuileDominos(tab, tab, tab, tab);
		Plateau p = new Plateau(t);
		p.place(new Coords(1,0), t);
		p.place(new Coords(0,1), t);
		System.out.println(p);
	}
}
