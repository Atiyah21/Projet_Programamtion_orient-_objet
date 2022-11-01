package view;

import javax.swing.*;
import java.awt.*;

public class ContentView extends JFrame{
	public ContentView(){
		JPanel panel=new JPanel();
		
		//récuperer la dimension de l'écran
		int Longueur = Toolkit.getDefaultToolkit().getScreenSize().width;
		int Hauteur = Toolkit.getDefaultToolkit().getScreenSize().height;
		
		//régler la taille de JFrame à la taille de l'écran
		this.setSize(Longueur, Hauteur);

		//création d'un panneau (JPanel)
		panel.setLayout(null);
		panel.setOpaque(true);
		this.setContentPane(panel);
		
		//création de la barre des menus
		JMenuBar MenuDominos = new JMenuBar();
		JMenuBar MenuCarcassone = new JMenuBar();
		JMenuBar Quiter = new JMenuBar();
		
		this.setBackground(new java.awt.Color(200, 200, 200));
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
		this.setVisible(true);
	}
}
