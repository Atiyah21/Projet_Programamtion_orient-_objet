package view.dominos;

import javax.swing.*;
import java.awt.*;

public class TuileView extends JPanel {

    class Case extends JLabel {
        Case(int n) {
            super();
            if (n > -1) {
                setText(String.valueOf(n));
                setBorder(BorderFactory.createLineBorder(Color.black));
            } else {
                setText(" ");
            }
            setOpaque(true);
            setBackground(Color.yellow);
            setHorizontalAlignment(SwingConstants.CENTER);
            setVerticalAlignment(SwingConstants.CENTER);
        }
    }

    public TuileView() {
        super();
        setLayout(new GridLayout(5, 5));
        add(new Case(-1));
        add(new Case(1));
        add(new Case(2));
        add(new Case(3));
        add(new Case(-1));
        add(new Case(4));
        add(new Case(-1));
        add(new Case(-1));
        add(new Case(-1));
        add(new Case(7));
        add(new Case(5));
        add(new Case(-1));
        add(new Case(-1));
        add(new Case(-1));
        add(new Case(8));
        add(new Case(6));
        add(new Case(-1));
        add(new Case(-1));
        add(new Case(-1));
        add(new Case(9));
        add(new Case(-1));
        add(new Case(10));
        add(new Case(11));
        add(new Case(12));
        add(new Case(-1));

        setBorder(BorderFactory.createLineBorder(Color.black));
    }
}
