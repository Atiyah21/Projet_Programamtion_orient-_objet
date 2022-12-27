package model;

import java.util.ArrayList;
import java.util.Stack;

import model.SideCarcassonne.Sike;

public class GameCarcassonne extends Game{
    
    public GameCarcassonne(){
        
        
        sac = new Stack<>();
        sac.push(new TuileCarcassone(Sike.CHEMIN, Sike.CHEMIN, Sike.CHEMIN, Sike.CHEMIN, false));
        sac.push(new TuileCarcassone(Sike.CHEMIN, Sike.PRE, Sike.CHEMIN, Sike.PRE, false));
        sac.push(new TuileCarcassone(Sike.PRE, Sike.CHEMIN, Sike.CHEMIN, Sike.CHEMIN, false));
        sac.push(new TuileCarcassone(Sike.PRE, Sike.PRE, Sike.CHEMIN, Sike.CHEMIN, false));
        sac.push(new TuileCarcassone(Sike.PRE, Sike.PRE, Sike.CHEMIN, Sike.PRE, false));
        sac.push(new TuileCarcassone(Sike.PRE, Sike.PRE, Sike.PRE, Sike.PRE, false));
        sac.push(new TuileCarcassone(Sike.PRE, Sike.VILLE, Sike.PRE, Sike.VILLE, true));
        sac.push(new TuileCarcassone(Sike.PRE, Sike.VILLE, Sike.PRE, Sike.VILLE, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.CHEMIN, Sike.CHEMIN, Sike.CHEMIN, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.CHEMIN, Sike.CHEMIN, Sike.PRE, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.CHEMIN, Sike.CHEMIN, Sike.VILLE, true));
        
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.CHEMIN, Sike.CHEMIN, Sike.VILLE, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.CHEMIN, Sike.PRE, Sike.CHEMIN, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.PRE, Sike.CHEMIN, Sike.CHEMIN, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.PRE, Sike.PRE, Sike.PRE, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.PRE, Sike.PRE, Sike.VILLE, true));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.PRE, Sike.PRE, Sike.VILLE, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.PRE, Sike.VILLE, Sike.PRE, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.VILLE, Sike.CHEMIN, Sike.VILLE, true));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.VILLE, Sike.CHEMIN, Sike.VILLE, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.VILLE, Sike.PRE, Sike.PRE, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.VILLE, Sike.PRE, Sike.VILLE, true));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.VILLE, Sike.PRE, Sike.VILLE, false));
        sac.push(new TuileCarcassone(Sike.VILLE, Sike.VILLE, Sike.VILLE, Sike.VILLE, true));

        players = new ArrayList<>();
		players.add(new Player("Victor"));
        plateau = new Plateau(sac.pop());
    }

    public GameCarcassonne(ArrayList<Player> players) {
		this();
		this.players = players;
	}
}
