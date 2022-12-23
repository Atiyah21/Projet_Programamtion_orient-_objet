package view.dominos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.Game;
import model.Coords;
import model.Player;
import java.util.ArrayList;

public class DominosView extends JPanel {
    Game game;
    PlateauView plateauView;
    TuileView pioche;
    JPanel container;
    JLabel tour;

    public DominosView(ArrayList<Player> players) {
        game = new Game(players);
        tour = new JLabel("C'est au tour de: " + game.peekPlayer().getName());
        plateauView = new PlateauView(this, game.plateau);

        container = new JPanel();
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
        container.add(pioche);
        container.add(defausse);
        container.add(rotate);
        container.add(tour);
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
                pioche.model = game.sac.peek();
                pioche.update();
                tour.setText("C'est le tour de: " + game.peekPlayer().getName());
            }
        }
    }

}
