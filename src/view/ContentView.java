package view;

import javax.swing.*;

import view.dominos.DominosView;

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

		Menu menu = new Menu(this);

		menu.getExitBtn().addActionListener(e -> System.exit(0));

		menu.getDominosBtn().addActionListener(e -> {
			DominosView dominosView = new DominosView();
			this.setContentPane(dominosView);
		});
		/*cgetCarcassone	Btn.addActionListener(e -> {
			CarcassonneView carcassonneView = new CarcassonneView();
			this.setContentPane(carcassonneView);
		});
		*/
		this.setVisible(true);
	}
}
