package model;

public class SideDominos extends Side {
    int[] tab;

    public SideDominos(int[] t){
        tab = t;
    }

    public int getPoints(Side o) {
        if(o instanceof SideDominos){
            if(Utils.equals(tab, ((SideDominos)o).tab)) return Utils.sum(tab);
        }
        return -1;
    }

    public void revert() {
        tab = Utils.revert(tab);    
    }

    public int[] getTab() {
        return tab;
    }
    
}