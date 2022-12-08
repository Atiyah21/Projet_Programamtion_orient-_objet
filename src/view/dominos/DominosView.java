package view.dominos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import model.Tuile;

public class DominosView extends JFrame {
    public DominosView() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        int[] n = { 1, 2, 2 };
        int[] w = { 3, 4, 4 };
        int[] e = { 5, 6, 6 };
        int[] s = { 7, 8, 8 };

        Tuile tuile = new Tuile(n, e, s, w);
        TuileView t = new TuileView(tuile);
        TuileView t2 = new TuileView(tuile);

        JButton btn = new JButton("Rotate");

        btn.addActionListener((ActionEvent event) -> {
            tuile.rotate();
            t.update();
        });
        this.add(t);
        this.add(t2);
        this.add(btn);

        this.setVisible(true);
    }
}
