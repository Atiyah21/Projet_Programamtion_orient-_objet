import model.*;
import view.*;

import java.awt.EventQueue;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		GameDominos g= new GameDominos();
		Scanner sc = new Scanner(System.in);
        Player currentPlayer = g.nextPlayer();
        while(g.getSac().size() > 0){
            System.out.println(g.getPlateau());
			System.out.println("Pioche: \n" + g.getSac().peek());
            System.out.println("\n" + currentPlayer.getName() + " que voulez vous faire ?\n" +
                                                         "D : Defausser\n"+
                                                         "T : Tourner la tuile\n"+ 
                                                         "P : Placer une tuile");
            String str = sc.next();
            if (str.equals("D")) g.defausser();
			else if(str.equals("T")) g.getSac().peek().rotate();
            else{
				System.out.println("Ligne de la position:");
				int i = sc.nextInt();
				System.out.println("Colonne de la position:");
				int j = sc.nextInt();
				int b = g.getPlateau().isValid(new Coords(i,j), g.getSac().peek());
				if(b!=-1){
					g.getPlateau().place(new Coords(i,j), g.getSac().pop());
					g.nextPlayer();
					g.getSac().pop();
				}else{
					System.out.println("Déplacement non autorisé");
				}
			}
        }
        
        Player vainqueur = g.getPlayers().get(0);
        for(Player p : g.getPlayers()){
            if(p.getPoints() > vainqueur.getPoints()) vainqueur = p;
        }

        System.out.print("Le vainqueur est " + vainqueur);
		
	}
}
