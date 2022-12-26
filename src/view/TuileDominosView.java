package view;

import model.*;
import java.awt.*;
import javax.swing.*;

public class TuileDominosView extends TuileView {
    TuileDominos model;

    class Case extends JLabel {
        Case(int n) {
            super();
            setText(String.valueOf(n));
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

    public TuileDominosView(TuileDominos m) {
        this(false);
        this.model = m;

        n0 = new Case(((SideDominos) model.n).getTab()[0]);
        n1 = new Case(((SideDominos) model.n).getTab()[1]);
        n2 = new Case(((SideDominos) model.n).getTab()[2]);
        e0 = new Case(((SideDominos) model.e).getTab()[0]);
        e1 = new Case(((SideDominos) model.e).getTab()[1]);
        e2 = new Case(((SideDominos) model.e).getTab()[2]);
        s0 = new Case(((SideDominos) model.s).getTab()[0]);
        s1 = new Case(((SideDominos) model.s).getTab()[1]);
        s2 = new Case(((SideDominos) model.s).getTab()[2]);
        w0 = new Case(((SideDominos) model.w).getTab()[0]);
        w1 = new Case(((SideDominos) model.w).getTab()[1]);
        w2 = new Case(((SideDominos) model.w).getTab()[2]);

        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.weightx = 1;
        c.weighty = 1;
        c.gridx = 1;
        c.gridy = 0;
        add(n0, c);
        c.gridx = 2;
        add(n1, c);
        c.gridx = 3;
        add(n2, c);
        c.gridx = 4;
        c.gridy = 1;
        add(e0, c);
        c.gridy = 2;
        add(e1, c);
        c.gridy = 3;
        add(e2, c);
        c.gridx = 1;
        c.gridy = 4;
        add(s0, c);
        c.gridx = 2;
        add(s1, c);
        c.gridx = 3;
        add(s2, c);
        c.gridx = 0;
        c.gridy = 1;
        add(w0, c);
        c.gridy = 2;
        add(w1, c);
        c.gridy = 3;
        add(w2, c);

        setBackground(new Color(215, 194, 231));

    }

    public TuileDominosView(boolean reachable) {
        super();
        setOpaque(true);
        if (reachable)
            setBackground(Color.green);
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @Override
    public void setPreferredSize(Dimension d) {
        preferredSize = d;
    }

    public Dimension getPreferredSize() {
        return preferredSize;
    }

    public void update() {
        n0.setText(String.valueOf(((SideDominos) model.n).getTab()[0]));
        n1.setText(String.valueOf(((SideDominos) model.n).getTab()[1]));
        n2.setText(String.valueOf(((SideDominos) model.n).getTab()[2]));
        e0.setText(String.valueOf(((SideDominos) model.e).getTab()[0]));
        e1.setText(String.valueOf(((SideDominos) model.e).getTab()[1]));
        e2.setText(String.valueOf(((SideDominos) model.e).getTab()[2]));
        s0.setText(String.valueOf(((SideDominos) model.s).getTab()[0]));
        s1.setText(String.valueOf(((SideDominos) model.s).getTab()[1]));
        s2.setText(String.valueOf(((SideDominos) model.s).getTab()[2]));
        w0.setText(String.valueOf(((SideDominos) model.w).getTab()[0]));
        w1.setText(String.valueOf(((SideDominos) model.w).getTab()[1]));
        w2.setText(String.valueOf(((SideDominos) model.w).getTab()[2]));
    }

}
