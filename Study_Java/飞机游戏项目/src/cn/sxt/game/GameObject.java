package cn.sxt.game;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

//游戏物体的父类


public class GameObject {
	Image img;  //加private也行但是要加一大堆的get和set的方法
	double x,y;
	int speed;
	int width,height;
	

	public void drawSelf(Graphics g) {
		g.drawImage(img,(int)x,(int)y,null);
	}
	

	//为了方便使用加一个重载的构造器	
	public GameObject(Image img, double x, double y, int speed, int width, int height) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
		this.speed = speed;
		this.width = width;
		this.height = height;
	}
	
	//img,x,y构造器
	public GameObject(Image img, double x, double y) {
		super();
		this.img = img;
		this.x = x;
		this.y = y;
	}
	
	//空构造器
	public GameObject() {
		super();
	}
	
	
	//返回物体所在的矩形，便于后续的碰撞检测，这个方法比较重要
	public Rectangle getRect() {
		return new Rectangle((int)x,(int)y,width,height);
	}

	
	
}
