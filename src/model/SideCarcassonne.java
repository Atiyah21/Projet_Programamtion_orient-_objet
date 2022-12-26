package model;

public class SideCarcassonne extends Side{
    Sike sike;

    public enum Sike { 
        CHEMIN("c"), PRE("p"), VILLE("v");
        String value;
        private Sike(String v){
            value = v;
        }
    }

    public SideCarcassonne(Sike s){
        sike = s;
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
