package view.dominos;

import javax.swing.*;
import java.awt.*;
import model.Plateau;
import model.Coords;

public class PlateauView extends JPanel {
    Plateau model;
    private int s = 2;

    int min_x = -s;
    int max_x = s;
    int min_y = -s;
    int max_y = s;

    public PlateauView(Plateau model) {
        super();
        this.model = model;
        setLayout(new GridBagLayout());
        setBorder(BorderFactory.createLineBorder(Color.red));
        update();
    }

    public void update() {
        removeAll();
        for (int x = model.min_x - 1; x <= model.max_x + 1; x++) {
            for (int y = model.min_y - 1; y <= model.max_y + 1; y++) {
                Coords coord = new Coords(x, y);
                GridBagConstraints c = new GridBagConstraints();
                c.gridx = x + Math.abs(model.min_x);
                c.gridy = y + Math.abs(model.min_y);
                if (!model.isFree(coord)) {
                    System.out.println(model.get(coord));
                    add(new TuileView(model.get(coord)), c);
                } else {
                    // add(new TuileView(), c);
                }
            }
        }
        repaint();
    }
}
