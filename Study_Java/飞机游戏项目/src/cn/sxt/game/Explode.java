package cn.sxt.game;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Time;
import java.util.Timer;
 
/*
 * 爆炸类
 */
public class Explode {
    double x,y;
    static Image[] imgs = new Image[16]; //静态加载，记载一次图片就可以了
    static {
        for(int i=0;i<16;i++){
            imgs[i] = 图片加载.getImage("images/explode/e"+(i+1)+".gif");
            imgs[i].getWidth(null);
        }
    }
     
    int count;
     
    public void draw(Graphics g) {

        if(count<=15){
        	
            g.drawImage(imgs[count], (int)x, (int)y, null);
            
            count++;
        }
    }
     
    public Explode(double x,double y){
        this.x = x;
        this.y = y;
    }
}
