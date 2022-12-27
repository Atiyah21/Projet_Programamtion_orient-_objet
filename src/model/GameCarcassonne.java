package model;

import java.util.ArrayList;
import java.util.Stack;

import model.SideCarcassonne.Sike;

public class GameCarcassonne extends Game{
    
    public GameCarcassonne(){
        
        TuileCarcassone t = new TuileCarcassone(Sike.VILLE, Sike.PRE, Sike.PRE, Sike.VILLE, false);
        sac = new Stack<>();
        sac.push(t);
        sac.push(t);
        sac.push(t);
        players = new ArrayList<>();
		players.add(new Player("Victor"));
        plateau = new Plateau(sac.pop());
    }

    public GameCarcassonne(ArrayList<Player> players) {
		this();
		this.players = players;
	}
}
