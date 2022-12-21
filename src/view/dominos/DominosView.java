package view.dominos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.Game;
import model.Coords;

public class DominosView extends JPanel {
    Game game;
    PlateauView plateauView;
    TuileView pioche;
    JPanel container;

    public DominosView() {
        game = new Game();
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
        add(container, BorderLayout.LINE_END);
    }

    public void defausser() {
        if (!game.sac.empty())
            game.sac.pop();
        if (!game.sac.empty()) {
            pioche.model = game.sac.peek();
            pioche.update();
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
            int i = plateauView.model.place(c, pioche.model);
            System.out.println(i);
            if (i != -1) {
                plateauView.update();
                defausser();
            }
        }
    }

}
