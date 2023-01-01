import model.*;
import view.*;

import java.awt.EventQueue;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		if (args.length >= 1) {
			if (args[0].equalsIgnoreCase("term"))
				Terminal.launch();
		} else if (args.length == 0) {

		}
	}
}
