package model;

import java.util.Stack;
import java.util.ArrayList;

public class Game {

	public Plateau plateau;
	public Stack<Tuile> sac;
	public ArrayList<Player> players;
	int currentPlayer = -1;

	public ArrayList<Player> getPlayers() {
		return players;
	}

	public Stack<Tuile> getSac() {
		return sac;
	}

	public Plateau getPlateau() {
		return plateau;
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
					sac.pop().setPlacer(current);
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

	public void rotatePioche() {
		sac.peek().rotate();
	}

}
