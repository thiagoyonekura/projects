package jogoespaco;

import javax.swing.JFrame;

import jogoespaco.Modelo.Fase;

public class Container extends JFrame {
	
	public Container() {
		add(new Fase());
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
