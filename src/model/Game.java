package model;

import java.util.Stack;
import java.util.ArrayList;

public class Game {
	static final int min_range = 1;
	static final int max_range = 2;
	static final int num_tuile = 3;

	public Plateau plateau;
	public Stack<Tuile> sac;
	public ArrayList<Player> players;
	int currentPlayer = -1;

	public Game() {
		sac = new Stack<>();
		players = new ArrayList<>();
		players.add(new Player("Victor"));
		for (int i = 0; i < num_tuile; i++) {
			sac.push(Utils.randomTuile(min_range, max_range));
		}
		plateau = sac.empty() ? null : new Plateau(sac.pop());
	}

	public Game(ArrayList<Player> players) {
		this();
		this.players = players;
	}

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public Player nextPlayer() {
		if (players.size() > 0) {
			currentPlayer += 1;
			return players.get(currentPlayer % players.size());
		}
		return null;
	}

	public Player peekPlayer() {
		if (players.size() > 0) {
			return players.get((currentPlayer + 1) % players.size());
		}
		return null;
	}

	public int place(Coords c) {
		int p = -1;
		if (players.size() != 0) {
			if (!sac.empty()) {
				p = plateau.place(c, sac.peek());
				if (p > -1) {
					Player current = nextPlayer();
					current.addPoints(p);
					sac.pop();
					System.out.println(current.getName() + " -> " + current.getPoints());
				}
			}
		}
		return p;
	}

	public void defausser() {
		if (!sac.empty()) {
			sac.pop();
			nextPlayer();
		}
	}

}
