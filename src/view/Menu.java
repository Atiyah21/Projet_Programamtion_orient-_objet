package view;

import java.awt.*;
import javax.swing.*;

public class Menu extends JPanel {
    JButton dominosBtn = new JButton();
    JButton carcassoneBtn = new JButton();
    JButton exitBtn = new JButton();

    public Menu(ContentView c) {

        c.getContentPane().setBackground(Color.white);
        c.setLayout(new GridLayout(5, 5));

        JPanel menuBar = new JPanel();
        menuBar.setLayout(new GridLayout(6, 1));
        menuBar.setBackground(Color.white);

        dominosBtn.setText("Dominos");
        carcassoneBtn.setText("Carcassone");
        exitBtn.setText("Quitter");

        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(menuBar);
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());
        c.add(new JLabel());

        menuBar.add(dominosBtn);
        menuBar.add(new JLabel());
        menuBar.add(carcassoneBtn);
        menuBar.add(new JLabel());
        menuBar.add(exitBtn);
        menuBar.add(new JLabel());
    }

    public JButton getExitBtn() {
        return exitBtn;
    }

    public JButton getDominosBtn() {
        return dominosBtn;
    }

    public JButton getCarcassoneBtn() {
        return carcassoneBtn;
    }
}
