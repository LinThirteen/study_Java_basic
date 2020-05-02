package cn.sxt.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {
	
	//用于方向的改变
	boolean left,up,right,down;
	
	boolean live = true;  //判断飞机是否死掉
	
	
	//继承为了更加方便的去用类里面的内容
	
	//重写父类方法
	public void drawSelf(Graphics g) {
		
		if(live) {
		g.drawImage(img,(int)x,(int)y,null);
		
		if(left) {
			x-=speed;
			
		}
		if(right) {
			x+=speed;
			
		}
		if(up) {
			y-=speed;
			
		}
		if(down) {
			y+=speed;
			
		}
	}else {
		System.out.println("飞机死掉了！");
	}
	}
	
	//建造一个构造
	public Plane(Image img,double x,double y) {
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = 5;
		this.width = img.getWidth(null); //获取图片的宽度和高度
		this.height = img.getHeight(null);
	}
	
	
	//按下某键，增加方向
	public void addDirection(KeyEvent e){
		
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = true;
			break;
		case KeyEvent.VK_UP:
			up = true;
			break;
		case KeyEvent.VK_RIGHT:
			right = true;
			break;
		case KeyEvent.VK_DOWN:
			down = true;
			break;
			
		}
		
	}
	
	//按下某键，取消方向
	public void minusDirection(KeyEvent e){
		
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			left = false;
			break;
		case KeyEvent.VK_UP:
			up = false;
			break;
		case KeyEvent.VK_RIGHT:
			right = false;
			break;
		case KeyEvent.VK_DOWN:
			down = false;
			break;
			
		}
		
	}
	
}
