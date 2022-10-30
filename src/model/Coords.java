package model;

public class Coords{
	int x;
	int y;

	public Coords(int x, int y){
		this.x = x;
		this.y = y;
	}

	public boolean equals(Coords other){
		return x == other.x && y == other.y;
	}

	public int hashCode(){
		int tmp = (y+((x+1)/2));
		return x + (tmp * tmp);
	}
}
