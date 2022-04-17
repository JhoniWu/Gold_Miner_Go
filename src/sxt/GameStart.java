package sxt;

import javax.swing.*;
import java.awt.*;
public class GameStart extends JFrame {
	background bg = new background();
	man pica = new man();
	ob luoli = new ob();
	jb j = new jb();
	void launch(){
		this.setVisible(true);
		this.setSize(800,700);
		this.setLocationRelativeTo(null);
		this.setTitle("黄金矿工");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		while (true)
		{

			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	@Override
	public void paint(Graphics g){

		bg.paintSelf(g);
		pica.paintMan(g);
		luoli.paintob(g);
		j.paintjb(g);
	}
	public static void main(String[] args) {
		GameStart ba = new GameStart();
		ba.launch();
	}
}
