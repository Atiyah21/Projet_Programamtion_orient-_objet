package view;

import java.awt.*;
import javax.swing.*;

public class Menu extends JPanel {
    JButton dominosBtn = new JButton();
    JButton carcassoneBtn = new JButton();
    JButton exitBtn = new JButton();
    PlayerSelector playerSelector = new PlayerSelector();

    public Menu() {

        setBackground(Color.white);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel menuBar = new JPanel();
        menuBar.setLayout(new GridLayout(6, 1));
        menuBar.setBackground(Color.white);

        dominosBtn.setText("Dominos");
        carcassoneBtn.setText("Carcassone");
        exitBtn.setText("Quitter");

        menuBar.add(dominosBtn);
        menuBar.add(new JLabel());
        menuBar.add(carcassoneBtn);
        menuBar.add(new JLabel());
        menuBar.add(exitBtn);
        menuBar.add(new JLabel());

        add(menuBar);
        add(playerSelector);
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

    public PlayerSelector getPlayerSelector() {
        return playerSelector;
    }
}
