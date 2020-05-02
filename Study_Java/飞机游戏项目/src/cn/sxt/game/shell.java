package cn.sxt.game;

import java.awt.Color;
import java.awt.Graphics;

//炮弹

public class shell extends GameObject {
	
	double degree;
	
	
	public shell() {
		x = 200; //默认double类型
		y = 200;
		width =10;
		height = 10;
		speed = 3;
		
		//0-2π之间的角度
		degree = Math.random()*Math.PI*2;
	}
	
	//画炮弹
	public void draw(Graphics g) {
		//用颜色前保存一下，用完了要还回去
		Color c = g.getColor();
		g.setColor(Color.yellow);
		
		
		//开始画炮弹
		g.fillOval((int)x, (int)y, width, height);
		
		//任意角度去飞
		x -= speed*Math.cos(degree);
		y -= speed*Math.sin(degree);
		
		//碰到边界就反弹
		if(x<0||x>常量.GAME_WIDTH-width) {
			degree = Math.PI-degree;
		}
		
		if(y<45||y>常量.GAME_HEFITH-height) {
			degree = -degree;
		}
		
		g.setColor(c);
		
	}
}
