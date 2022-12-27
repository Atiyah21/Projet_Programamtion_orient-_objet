package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.Game;
import model.GameDominos;
import model.Coords;
import model.Player;
import java.util.ArrayList;

public class GameView extends JPanel {
    Game game;
    PlateauView plateauView;
    PiocheView pioche;
    JPanel container;
    JLabel tour;
    ScoreboardView scoreboard;

    public GameView(Game game) {
        this.game = game;
        tour = new JLabel("C'est au tour de: " + game.peekPlayer().getName());
        plateauView = new PlateauView(this, game.plateau);

        container = new JPanel();
        scoreboard = new ScoreboardView(game.getPlayers());
        container.setLayout(new GridBagLayout());
        pioche = new PiocheView(game.sac);
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
        System.out.println("defausse");
        game.defausser(); // Ok
        pioche.update();
    }

    public void rotate() {
        System.out.println("rotate");
        game.rotatePioche();
        pioche.update();
    }

    public void place(Coords c) {
        System.out.println("Allooooo");
        game.place(c);
        plateauView.update();
        pioche.update();
        tour.setText(game.peekPlayer().getName());
        scoreboard.update();
        System.out.println("minx:" + game.plateau.min_x);
        System.out.println("miny:" + game.plateau.min_y);
        System.out.println("maxx:" + game.plateau.max_x);
        System.out.println("maxy:" + game.plateau.max_y);
    }
}
