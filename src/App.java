import model.Tuile;
import model.Orientation;
import model.Plateau;
import model.Coords;

import view.ContentView;

public class App{
	public static void main(String[] args){

		ContentView frame = new ContentView();
		
		int[] n = {1, 0, 0};
		int[] e = {2, 0, 0};
		int[] s = {3, 0, 0};
		int[] w = {4, 0, 0};

		Tuile tuile = new Tuile(n, e, s, w);
		System.out.println(tuile);

		tuile.rotate(Orientation.EAST);
		System.out.println(tuile);
		

		//Plateau p = new Plateau();
		//System.out.println(p.isFree(new Coords(0, 0)));
	}
}
