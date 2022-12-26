package model;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public class Utils {

	public static int[] revert(int[] t) {
		int[] acc = new int[t.length];
		for (int i = 0; i < t.length; i++) {
			acc[i] = t[t.length - i - 1];
		}
		return acc;
	}

	public static boolean equals(int[] t1, int[] t2) {
		if (t1.length != t2.length)
			return false;
		for (int i = 0; i < t1.length; i++) {
			if (t1[i] != t2[i])
				return false;
		}
		return true;
	}

	public static int sum(int[] t) {
		int acc = 0;
		for (int i = 0; i < t.length; i++)
			acc += t[i];
		return acc;
	}

	public static int random(int min, int max) {
		return (int) Math.floor(Math.random() * (max - min + 1) + min);
	}

	public static TuileDominos randomTuile(int min, int max) {
		int[][] acc = new int[4][3];
		for (int i = 0; i < acc.length; i++) {
			for (int j = 0; j < acc[i].length; j++) {
				acc[i][j] = random(min, max);
			}
		}
		return new TuileDominos(acc[0], acc[1], acc[2], acc[2]);
	}

	public static BufferedImage rotate(BufferedImage src) {
		int width = src.getWidth();
		int height = src.getHeight();
	
		BufferedImage dest = new BufferedImage(height, width, src.getType());
	
		Graphics2D graphics2D = dest.createGraphics();
		graphics2D.translate((height - width) / 2, (height - width) / 2);
		graphics2D.rotate(Math.PI / 2, height / 2, width / 2);
		graphics2D.drawRenderedImage(src, null);
	
		return dest;
	}

}
