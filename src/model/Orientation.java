package model;

public enum Orientation{
	NORTH(0), EAST(3), SOUTH(2), WEST(1);
	
	public int value;

	private Orientation(int value){
		this.value = value;
	}
}

