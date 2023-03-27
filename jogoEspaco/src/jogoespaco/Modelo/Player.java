package jogoespaco.Modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Player {
	private int x, y;
	private int dx, dy;
	private Image imagem;
	private int altura, largura;
	
	public Player() {
		this.x = 100;
		this.y = 100;
	}
	
	public void load() {
	ImageIcon referencia = new ImageIcon();
	imagem = referencia.getImage();
	}
}
