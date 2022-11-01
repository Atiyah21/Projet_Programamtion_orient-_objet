import model.Tuile;
import model.Orientation;
import model.Plateau;
import model.Coords;

import javax.swing.*;
import java.awt.*;
public class App{
	
	public static void main(String[] args){


		
			//création d'une fenêtre JFrame
			JFrame fen=new JFrame("Exemple de fenêtre avec menu");
			JPanel panel=new JPanel();
			
			//récuperer la dimension de l'écran
			int Longueur = Toolkit.getDefaultToolkit().getScreenSize().width;
			int Hauteur = Toolkit.getDefaultToolkit().getScreenSize().height;
			
			//régler la taille de JFrame à la taille de l'écran
			fen.setSize(Longueur, Hauteur);

			//création d'un panneau (JPanel)
			panel.setLayout(null);
			panel.setOpaque(true);
			fen.setContentPane(panel);
			
			//création de la barre des menus
			JMenuBar MenuDominos = new JMenuBar();
			JMenuBar MenuCarcassone = new JMenuBar();
			JMenuBar Quiter = new JMenuBar();
			
			fen.setBackground(new java.awt.Color(200, 200, 200));
			MenuCarcassone.setBackground(Color.WHITE);
			MenuDominos.setBackground(Color.WHITE);
			Quiter.setBackground(Color.WHITE);
			
			//Ajout de la barre de menus au JPanel
			panel.add(MenuDominos);
			panel.add(MenuCarcassone);
			panel.add(Quiter);
			
			//Positionnement de la barre des menus avec la méthode setBounds()
			MenuDominos.setBounds(Longueur/2 - 75, Hauteur/3 , 130, 60);
			MenuCarcassone.setBounds(Longueur/2 -75 , Hauteur/3 + 80, 130, 60);
			Quiter.setBounds(Longueur/2 -75 , Hauteur/3 + 160, 130, 60);
			
			//Création des menu
			JMenu menuDominos = new JMenu("Dominos Carrés");
			JMenu menuCarcassone = new JMenu("Carcassone");
			JMenu quiter = new JMenu("Quitter");

			//Ajout du menu à la barre des menus
			MenuDominos.add(menuDominos);
			MenuCarcassone.add(menuCarcassone);
			Quiter.add(quiter);
			fen.setVisible(true);
		
		int[] n = {1, 0, 0};
		int[] e = {2, 0, 0};
		int[] s = {3, 0, 0};
		int[] w = {4, 0, 0};

		Tuile tuile = new Tuile(n, e, s, w);
		System.out.println(tuile);

		tuile.rotate(Orientation.EAST);
		System.out.println(tuile);
		

		//Plateau p = new Plateau();
		//System.out.println(p.isFree(new Coords(0, 0)));
	}
}
