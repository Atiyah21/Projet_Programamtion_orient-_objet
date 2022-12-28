package model;

public abstract class Tuile {
    public Side n;
    public Side w;
    public Side e;
    public Side s;

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
}
