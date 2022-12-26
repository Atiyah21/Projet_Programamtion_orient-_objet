package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.Game;
import model.GameDominos;
import model.Coords;
import model.Player;
import java.util.ArrayList;

public class DominosView extends JPanel {
    Game game;
    PlateauView plateauView;
    TuileView pioche;
    JPanel container;
    JLabel tour;
    ScoreboardView scoreboard;

    public DominosView(ArrayList<Player> players) {
        game = new GameDominos(players);
        tour = new JLabel("C'est au tour de: " + game.peekPlayer().getName());
        plateauView = new PlateauView(this, game.plateau);

        container = new JPanel();
        scoreboard = new ScoreboardView(game.getPlayers());
        container.setLayout(new GridBagLayout());
        pioche = new TuileView(game.sac.peek());
        JButton defausse = new JButton("Défausser");
        JButton rotate = new JButton("Rotate");

        defausse.addActionListener((ActionEvent e) -> {
            defausser();
        });

        rotate.addActionListener((ActionEvent e) -> {
            rotate();
        });

        setLayout(new BorderLayout());

        add(plateauView, BorderLayout.CENTER);
        GridBagConstraints gc = new GridBagConstraints();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 2;
        container.add(tour, gc);

        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 2;

        container.add(pioche, gc);
        gc.gridx = 1;
        gc.weighty = 1;
        container.add(defausse, gc);
        gc.gridy = 2;
        container.add(rotate, gc);

        gc.gridx = 0;
        gc.gridy = 3;
        gc.weightx = 2;
        gc.weighty = 3;

        container.add(scoreboard, gc);
        add(container, BorderLayout.LINE_END);
    }

    public void defausser() {
        game.defausser();
        if (!game.sac.empty()) {
            pioche.model = game.sac.peek();
            pioche.update();
            tour.setText("C'est le tour de: " + game.peekPlayer().getName());
        } else {
            pioche.setVisible(false);
            container.remove(pioche);
            pioche = new TuileView(false);
            container.add(pioche, 0);
            container.repaint();
        }
    }

    public void rotate() {
        if (pioche.model != null) {
            pioche.model.rotate();
            pioche.update();
        }
    }

    public void place(Coords c) {
        System.out.println("Allooooo");
        if (!game.sac.empty()) {
            int i = game.place(c);
            System.out.println(i);
            if (i != -1) {
                plateauView.update();
                if (!game.sac.empty()) {
                    pioche.model = game.sac.peek();
                    pioche.update();
                    scoreboard.update();
                    tour.setText("C'est le tour de: " + game.peekPlayer().getName());
                } else {
                    pioche.setVisible(false);
                    container.remove(pioche);
                    pioche = new TuileView(false);
                    container.add(pioche, 0);
                    container.repaint();
                }
            }
        }
    }
}
