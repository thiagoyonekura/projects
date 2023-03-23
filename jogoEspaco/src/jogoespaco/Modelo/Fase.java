package jogoespaco.Modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Fase extends JPanel {
	private Image fundo;
	
	public Fase() {
		ImageIcon referencia = new ImageIcon("C:\\Users\\a886409\\git\\PROJECTS\\jogoEspaco\\res\\blackground.png");
		fundo = referencia.getImage();
	}
	public void paint(Graphics g) {
		Graphics2D graficos = (Graphics2D) g;
		graficos.drawImage(fundo, 0, 0, null);
		g.dispose();
	}
}
