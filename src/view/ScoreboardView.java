package view;

import javax.swing.*;
import java.util.ArrayList;
import model.Player;
import java.util.Collections;

public class ScoreboardView extends JPanel {
	ArrayList<Player> players;

	public ScoreboardView(ArrayList<Player> p) {
		super();
		players = new ArrayList<>();
		for (Player pl : p) {
			players.add(pl);
		}
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		update();
	}

	public void update() {
		Collections.sort(players);
		removeAll();
		for (Player p : players) {
			add(new JLabel(p.getPoints() + " - " + p.getName()));
		}
		revalidate();
		repaint();
	}
}
