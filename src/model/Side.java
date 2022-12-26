package model;

public abstract class Side {
    
    /*
     * Tourner: inverser les côtés
     * récuperer le nombre de points
     */

    public abstract int getPoints(Side o);

    public abstract void revert();
}
