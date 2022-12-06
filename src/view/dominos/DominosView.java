package view.dominos;

import javax.swing.*;
import java.awt.*;

public class DominosView extends JFrame {
    public DominosView() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        TuileView t = new TuileView();
        TuileView t2 = new TuileView();
        this.add(t);
        this.add(t2);
        this.setVisible(true);
    }
}
