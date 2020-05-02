package cn.sxt.game;

import javax.swing.JFrame;
import javax.xml.stream.events.EndDocument;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Date;

//时间计数，重开始玩到结束

public class MyGameFrame08 extends Frame {

	// 加载图片对象
	Image planeImage = 图片加载.getImage("images/plane.png");
	Image bg = 图片加载.getImage("images/bg.jpg");

//	int planeX=250,planeY=250;   //表示飞机初始化坐标
	Plane plane = new Plane(planeImage, 250, 250);
//	shell sh = new shell();

	// 用数组方法实现多发炮弹，声明后一定要初始化
	shell[] shells = new shell[10];

//	用容器方法
//	ArrayList<shell>  shellList = new ArrayList<shell>(); 
	
	
	//爆炸对象
	Explode bao;
	
	
	
	//时间计数
	Date startTime = new Date();
	Date endTime;
	int period;   //游戏持续的时间
	
	

	// 加了这段代码解决awt包的Jfarem的闪烁问题
	private Image offScreenImage = null;

	
	
	public void update(Graphics g) {
		if (offScreenImage == null)
			offScreenImage = this.createImage(500, 500);// 这是游戏窗口的宽度和高度

		Graphics gOff = offScreenImage.getGraphics();
		paint(gOff);
		g.drawImage(offScreenImage, 0, 0, null);
	}

	
	
	// 图形和文本绘制
	@Override
	// 该方法自动加载
	public void paint(Graphics g) {
		Color c = g.getColor();

		g.drawImage(bg, 0, 0, null);
		plane.drawSelf(g);
		// 用数组方法
		for (int i = 0; i < shells.length; i++) {
			shells[i].draw(g);

			// 检测碰撞
			boolean peng = shells[i].getRect().intersects(plane.getRect());
			if (peng) {
				plane.live = false;
				if(bao == null){//如果不加这句话每次都会都会建一个新对象
				bao = new Explode(plane.x, plane.y); //到这一步bao就不等于null了
				
				endTime = new Date();
				period = (int)((endTime.getTime() - startTime.getTime())/1000);
				System.out.println(period);
				}
				
				
			
				bao.draw(g);
			}
			if(!plane.live) {
				g.setColor(Color.red);
				Font f = new Font("宋体",Font.BOLD,50);
				g.setFont(f);
				g.drawString("时间："+period+"秒",140, 250);
			}
		}

		// 用容器方法
//		 for(int i=0;i<shellList.size();i++){
//	            shell b =  shellList.get(i);
//	            b.draw(g);
//	          
//	        }
		g.setColor(c);
		
	}

	// 定义一个内部类(定义内部类的好处就是可以很方便的去用外部类)
	class PainThread extends Thread {
		// 多线程和内部类实现动画效果
		@Override
		public void run() {
			while (true) {
				repaint(); // 表示重画窗口,不断的调用paint
				try {
					Thread.sleep(50);// 1秒放40次 //按常理来说1秒被放24次人眼才能够适应
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	// 键盘监听的内部类
	class KeyMonitor extends KeyAdapter {

		@Override // 按下哪个键
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyPressed(e);
			System.out.println("按下" + e.getKeyCode());
			plane.addDirection(e);
		}

		@Override // 抬起哪个键
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			super.keyReleased(e);
			System.out.println("抬起" + e.getKeyCode());
			plane.minusDirection(e);
		}

	}

	public void launchFrame() {
		// 在游戏窗口打印标题,继承了Jframe类
		this.setTitle("尚学堂学员_程序猿作品");

		// 窗口默认不可见，设为可见，不写默认继承Jframe类
		this.setVisible(true);

		// 窗口大小：宽度500，高度500
		this.setSize(常量.GAME_WIDTH, 常量.GAME_HEFITH);

		// 窗口左上角顶点的坐标位置
		this.setLocation(300, 300);

		// 增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		// 启动初始化窗口的线程
		new PainThread().start();

		// 启动增加键盘盘监听
		addKeyListener(new KeyMonitor());

		// 用数组方法初始化50个炮弹
		for (int i = 0; i < shells.length; i++) {
			shells[i] = new shell();
		}

		// 用容器方法初始化50个炮弹
//        for(int i=0;i<50;i++){
//            shell b = new shell();
//            shellList.add(b);
//        }

	}

	public static void main(String[] args) {
		MyGameFrame08 f = new MyGameFrame08();
		f.launchFrame();
	}
}