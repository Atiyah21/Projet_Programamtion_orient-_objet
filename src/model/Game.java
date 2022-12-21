package model;

import java.util.Stack;

public class Game {
	static final int min_range = 1;
	static final int max_range = 2;
	static final int num_tuile = 50;

	public Plateau plateau;
	public Stack<Tuile> sac;

	public Game() {
		sac = new Stack<>();
		for (int i = 0; i < num_tuile; i++) {
			sac.push(Utils.randomTuile(min_range, max_range));
		}
		plateau = sac.empty() ? null : new Plateau(sac.pop());
	}
}
