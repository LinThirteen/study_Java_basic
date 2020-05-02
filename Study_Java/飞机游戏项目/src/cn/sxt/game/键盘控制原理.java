package cn.sxt.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class 键盘控制原理 {
	
	class KeyMonitor extends KeyAdapter{

		@Override //按下哪个键
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			System.out.println(e.getKeyCode());
		}

		@Override  //抬起哪个键
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyReleased(e);
			System.out.println(e.getKeyCode());
		}
		
	}

}
