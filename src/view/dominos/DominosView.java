package view.dominos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.Game;

public class DominosView extends JPanel {
    Game game;
    PlateauView plateauView;
    TuileView pioche;
    JPanel container;

    public DominosView() {
        game = new Game();
        plateauView = new PlateauView(game.plateau);

        container = new JPanel();
        pioche = new TuileView(game.sac.peek());
        JButton defausse = new JButton("Défausser");

        defausse.addActionListener((ActionEvent e) -> {
            defausser();
        });

        setLayout(new BorderLayout());

        add(plateauView, BorderLayout.CENTER);
        container.add(pioche);
        container.add(defausse);
        add(container, BorderLayout.LINE_END);
    }

    public void defausser() {
        if (!game.sac.empty())
            game.sac.pop();
        if (!game.sac.empty()) {
            pioche.model = game.sac.peek();
            System.out.println("pavide");
        }
        pioche.update();
    }

}
