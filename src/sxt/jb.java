package sxt;

import java.awt.*;

public class jb {
	int x= 375;
	int y= 100;
	int endx = 500,endy=500;
	double length = 100;
	double n = 0.5;
	boolean pj = true;
	void paintjb(Graphics g){
		if(pj)
		{
			n+=0.02;
		}else
		{
			n-=0.02;
		}
		if(n>=0.9)
		{
			pj=false;
		}else if (n<=0.1)
		{
			pj=true;
		}
		endx = x + (int)(length*Math.cos(n*Math.PI));
		endy = y + (int)(length*Math.sin(n*Math.PI));
		g.setColor(Color.red);
		g.drawLine(x,y,endx,endy);

	}
}
