import model.TuileDominos;
import model.Plateau;
import model.Coords;

import view.ContentView;

import java.awt.EventQueue;

public class App {
	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			ContentView frame = new ContentView();
		});

		/*JFrame fenetre = new JFrame();
		TuileCarcassone t = new TuileCarcassone(Sike.CHEMIN, Sike.CHEMIN, Sike.CHEMIN, Sike.CHEMIN, false);
		

		ImageIcon icon = new ImageIcon(t.getI());

		fenetre.add(new JLabel(icon));

		fenetre.setVisible(true);*/
	}
}
