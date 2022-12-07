package view.dominos;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class DominosView extends JFrame {
    public DominosView() {
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;

		this.setSize(width, height);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TuileView t = new TuileView();
        TuileView t2 = new TuileView();
        
        JPanel pioche = new JPanel();
        pioche.setLayout(new FlowLayout());
        pioche.add(t);
        pioche.add(t2);

        this.add(new JLabel(), BorderLayout.CENTER);
        this.add(new JLabel(), BorderLayout.NORTH);
        this.add(new JLabel(), BorderLayout.EAST);
        this.add(new JLabel(), BorderLayout.WEST);
        this.add(pioche, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
