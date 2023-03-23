package jogoespaco;

import javax.swing.JFrame;

public class Container extends JFrame {
	
	public Container() {
		setTitle("Jogo Espaço");
		setSize(1024, 728);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new Container();
	}
}
