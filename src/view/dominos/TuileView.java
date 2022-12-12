package view.dominos;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import model.Tuile;

public class TuileView extends JPanel {

    Tuile model;

    class Case extends JLabel {
        Case(int n) {
            super();
            if (n > -1) {
                setText(String.valueOf(n));
                setBorder(BorderFactory.createLineBorder(Color.black));
            } else {
                setText(" ");
                setBorder(new EmptyBorder(0, 12, 0, 0));
            }
            setOpaque(true);
            setBackground(new Color(215, 194, 231));
            setHorizontalAlignment(SwingConstants.CENTER);
            setVerticalAlignment(SwingConstants.CENTER);
        }
    }

    Case n1;
    Case n2;
    Case n0;
    Case e1;
    Case e2;
    Case e0;
    Case s1;
    Case s2;
    Case s0;
    Case w1;
    Case w2;
    Case w0;

    public TuileView(Tuile m) {
        super();
        this.model = m;

        n0 = new Case(model.id_n[0]);
        n1 = new Case(model.id_n[1]);
        n2 = new Case(model.id_n[2]);
        e0 = new Case(model.id_e[0]);
        e1 = new Case(model.id_e[1]);
        e2 = new Case(model.id_e[2]);
        s0 = new Case(model.id_s[0]);
        s1 = new Case(model.id_s[1]);
        s2 = new Case(model.id_s[2]);
        w0 = new Case(model.id_w[0]);
        w1 = new Case(model.id_w[1]);
        w2 = new Case(model.id_w[2]);

        setLayout(new GridLayout(5, 5));
        add(new Case(-1));
        add(n0);
        add(n1);
        add(n2);
        add(new Case(-1));
        add(w0);
        add(new Case(-1));
        add(new Case(-1));
        add(new Case(-1));
        add(e0);
        add(w1);
        add(new Case(-1));
        add(new Case(-1));
        add(new Case(-1));
        add(e1);
        add(w2);
        add(new Case(-1));
        add(new Case(-1));
        add(new Case(-1));
        add(e2);
        add(new Case(-1));
        add(s0);
        add(s1);
        add(s2);
        add(new Case(-1));

        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    public void update() {
        n0.setText(String.valueOf(model.id_n[0]));
        n1.setText(String.valueOf(model.id_n[1]));
        n2.setText(String.valueOf(model.id_n[2]));
        e0.setText(String.valueOf(model.id_e[0]));
        e1.setText(String.valueOf(model.id_e[1]));
        e2.setText(String.valueOf(model.id_e[2]));
        s0.setText(String.valueOf(model.id_s[0]));
        s1.setText(String.valueOf(model.id_s[1]));
        s2.setText(String.valueOf(model.id_s[2]));
        w0.setText(String.valueOf(model.id_w[0]));
        w1.setText(String.valueOf(model.id_w[1]));
        w2.setText(String.valueOf(model.id_w[2]));
    }

}
