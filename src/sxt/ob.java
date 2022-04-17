package sxt;


import java.awt.*;

public class ob {
	Image a1 = Toolkit.getDefaultToolkit().getImage("ob/1.jpg");
	Image a2 = Toolkit.getDefaultToolkit().getImage("ob/2.jpg");
	Image a3 = Toolkit.getDefaultToolkit().getImage("ob/3.jpg");
	Image a4 = Toolkit.getDefaultToolkit().getImage("ob/4.jpg");

	void paintob(Graphics g){
		g.drawImage(a1,300,400,50,50,null);
		g.drawImage(a2,500,200,50,50,null);
		g.drawImage(a3,100,500,50,50,null);
		g.drawImage(a4,400,400,50,50,null);
	}
}