package view.dominos;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class DominosView extends JPanel {
    public DominosView() {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;

		this.setSize(width, height);
        this.setLayout(new FlowLayout());
        
        TuileView t = new TuileView();
        TuileView t2 = new TuileView();
        
        this.add(t);
        this.add(t2);

        this.setVisible(true);
    }
}
