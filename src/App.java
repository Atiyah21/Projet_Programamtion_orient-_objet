import javax.swing.JFrame;

public class App extends JFrame {
	
	public App(){
		super("Yeah boy");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
	}

	public static void main(String[] args){
		App app = new App();
		app.setVisible(true);
	}
}
