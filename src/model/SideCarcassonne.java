package model;

public class SideCarcassonne extends Side{
    Sike sike;

    public enum Sike { 
        CHEMIN, PRE, VILLE  
    }


    @Override
    public void revert() {
    }


    @Override
    public int getPoints(Side o) {
        if(o instanceof SideCarcassonne){
            if(((SideCarcassonne)o).sike == this.sike) return 0;
        }
        return -1;
    }

}
