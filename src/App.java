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
	}
}
