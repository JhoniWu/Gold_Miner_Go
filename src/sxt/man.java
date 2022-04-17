package sxt;

import java.awt.*;

public class man {
	Image man = Toolkit.getDefaultToolkit().getImage("pic/pica.jpg");
	void paintMan(Graphics g){
		g.drawImage(man,350,50,50,50,null);
	}
}
