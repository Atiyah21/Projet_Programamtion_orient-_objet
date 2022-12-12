package view;
import java.awt.*;
import javax.swing.*;


public class Menu extends JPanel {
    JButton dominosBtn = new JButton();
    JButton carcassoneBtn = new JButton();
    JButton exitBtn = new JButton();

    public Menu(ContentView c){  
        Color grisFonce = new Color(29,29,29);
        
        c.getContentPane().setBackground(Color.white);
        c.setLayout(new GridLayout(5,5));

        JPanel menuBar = new JPanel();
        menuBar.setLayout(new GridLayout(6,1));
        menuBar.setBackground(Color.white);
        
        
        dominosBtn.setText("Dominos");
        dominosBtn.setBackground(grisFonce);
        dominosBtn.setBorderPainted(false);
        dominosBtn.setForeground(Color.white);

        carcassoneBtn.setText("Carcassone");
        carcassoneBtn.setBackground(grisFonce);
        carcassoneBtn.setBorderPainted(false);
        carcassoneBtn.setForeground(Color.white);

        exitBtn.setText("Quitter");
        exitBtn.setBackground(grisFonce);
        exitBtn.setBorderPainted(false);
        exitBtn.setForeground(Color.white);

        c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel());
        c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel());
        c.add(new JLabel()); c.add(new JLabel());   c.add(menuBar);    c.add(new JLabel()); c.add(new JLabel());
        c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel());
        c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel()); c.add(new JLabel());
        
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
