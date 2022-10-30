package model;

public class Utils{

	public static int[] revert(int[] t){
		int[] acc = new int[t.length];
		for(int i = 0; i < t.length; i++){
			acc[i] = t[t.length - i - 1];
		}
		return acc;
	}
}
