package model;

import java.util.Stack;
import java.util.ArrayList;

public class Game {
	static final int min_range = 1;
	static final int max_range = 2;
	static final int num_tuile = 50;

	public Plateau plateau;
	public Stack<Tuile> sac;
	public ArrayList<Player> players;
	int currentPlayer = 0;

	public Game() {
		sac = new Stack<>();
		players = new ArrayList<>();
		players.add(new Player("Victor"));
		for (int i = 0; i < num_tuile; i++) {
			sac.push(Utils.randomTuile(min_range, max_range));
		}
		plateau = sac.empty() ? null : new Plateau(sac.pop());
	}

	public int place(Coords c, Tuile t) {
		int p = -1;
		if (players.size() != 0) {
			p = plateau.place(c, t);
			Player current = players.get(currentPlayer % players.size());
			current.addPoints(p);
			System.out.println(current.getPoints());
			currentPlayer += 1;
		}
		return p;
	}
}
