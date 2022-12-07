package view.dominos;

import javax.swing.*;
import java.awt.*;

public class DominosView extends JFrame {
    public DominosView() {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        TuileView t = new TuileView();
        TuileView t2 = new TuileView();
        this.add(t);
        this.add(t2);
        this.setVisible(true);
    }
}
