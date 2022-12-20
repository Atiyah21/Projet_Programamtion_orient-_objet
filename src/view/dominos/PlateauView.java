package view.dominos;

import javax.swing.*;
import java.awt.*;
import model.Plateau;
import model.Coords;

public class PlateauView extends JPanel {
    Plateau model;

    public PlateauView(Plateau model) {
        super();
        this.model = model;
        // setLayout(new GridBagLayout());
        setLayout(new GridLayout(Math.abs(model.max_y + 1 - (model.min_y - 1)) + 1,
                Math.abs(model.max_x + 1 - (model.min_x - 1)) + 1));
        setBorder(BorderFactory.createLineBorder(Color.red));
        update();
    }

    public void update() {
        removeAll();
        for (int y = model.min_y - 1; y <= model.max_y + 1; y++) {
            for (int x = model.min_x - 1; x <= model.max_x + 1; x++) {
                Coords coord = new Coords(x, y);
                /*
                 * GridBagConstraints c = new GridBagConstraints();
                 * c.gridx = x + Math.abs(model.min_x - 1);
                 * c.gridy = y + Math.abs(model.min_y - 1);
                 * c.weightx = 1;
                 * c.weighty = 1;
                 */
                TuileView tuile;
                if (!model.isFree(coord)) {
                    tuile = new TuileView(model.get(coord));
                } else {
                    if (model.isReachable(coord))
                        tuile = new TuileView(true);
                    else
                        tuile = new TuileView(false);
                }
                tuile.x = x;
                tuile.y = y;
                add(tuile);
            }
        }

        /*
         * for (int y = model.min_y - s; y <= model.max_y + s; y++) {
         * for (int x = model.min_x - s; x <= model.max_x + s; x++) {
         * Coords coord = new Coords(x, y);
         * if (!model.isFree(coord)) {
         * add(new TuileView(model.get(coord)));
         * } else {
         * add(new TuileView());
         * }
         * }
         * }
         */

        repaint();
    }
}
