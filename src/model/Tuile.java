package model;

public abstract class Tuile {
    public Side n;
    public Side w;
    public Side e;
    public Side s;

    public abstract void rotate();
}
