package model;

public abstract class Tuile {
    public Side n;
    public Side w;
    public Side e;
    public Side s;

    private Player placedBy;

    public abstract void rotate();

    public Side getN() {
        return n;
    }

    public Side getE() {
        return e;
    }

    public Side getS() {
        return s;
    }

    public Side getW() {
        return w;
    }

    public Player getPlacer() {
        return placedBy;
    }

    public void setPlacer(Player p) {
        placedBy = p;
    }
}
