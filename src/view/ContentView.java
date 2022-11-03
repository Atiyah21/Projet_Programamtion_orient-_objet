package view;

import javax.swing.*;
import java.awt.*;

public class ContentView extends JFrame {
	public ContentView() {

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		// récuperer la dimension de l'écran
		int width = Toolkit.getDefaultToolkit().getScreenSize().width;
		int height = Toolkit.getDefaultToolkit().getScreenSize().height;

		// régler la taille de JFrame à la taille de l'écran
		this.setSize(width, height);

		// création d'un panneau (JPanel)
		panel.setLayout(new GridLayout(3, 1));
		panel.setOpaque(true);
		this.setContentPane(panel);

		this.setBackground(new java.awt.Color(200, 200, 200));

		JButton dominosButton = new JButton("Dominos carrés");
		JButton carcassonneButton = new JButton("Jeu de Carcassonne");
		JButton exitButton = new JButton("Quitter");

		panel.add(dominosButton);
		panel.add(carcassonneButton);
		panel.add(exitButton);

		dominosButton.setBounds(width / 2 - 75, height / 3, 130, 60);
		carcassonneButton.setBounds(width / 2 - 75, height / 3 + 80, 130, 60);
		exitButton.setBounds(width / 2 - 75, height / 3 + 160, 130, 60);

		exitButton.addActionListener(e -> System.exit(0));
		dominosButton.addActionListener(e -> {
			DominosView dominosView = new DominosView();
			dominosView.setVisible(true);
			this.setVisible(false);
		});
		carcassonneButton.addActionListener(e -> {
			CarcassonneView carcassonneView = new CarcassonneView();
			carcassonneView.setVisible(true);
			this.setVisible(false);
		});
		this.setVisible(true);
	}
}
