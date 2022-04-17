package sxt;

import java.awt.*;

public class background {
	String path = "pic/bac.jpg";
	Image bac = Toolkit.getDefaultToolkit().getImage(path);

	void paintSelf(Graphics g) {
		g.drawImage(bac,0,0, 800,600,null);
	}

}
