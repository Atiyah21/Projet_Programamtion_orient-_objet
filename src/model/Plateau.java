package model;

import java.util.Map;
import java.util.HashMap;
import java.util.Stack;

public class Plateau{
	Stack<Tuile> sac;
	Map<Coords, Tuile> plateau;

	public Plateau(){
		sac = new Stack<>();
		plateau = new HashMap<>();
	}

	public boolean isFree(Coords c){
		return plateau.get(c) == null;
	}

	public boolean isReachable(Coords c){
		return 
			!isFree(new Coords(c.x - 1, c.y)) ||
			!isFree(new Coords(c.x + 1, c.y)) ||
			!isFree(new Coords(c.x, c.y - 1)) ||
			!isFree(new Coords(c.x, c.y + 1));
	}

	/*public int isValid(Coords c, Tuile t){
		// return -1 if invalid, and n for winning n points
		if(!isFree(c))
			return false;
		if(!isReachable(c))
			return false;
		return false;
	}*/
}
