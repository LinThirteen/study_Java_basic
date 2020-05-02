//package cn.sxt.game;
//
//
//import javax.swing.JFrame;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//
//
////多线程和内部类实现动画效果
// 
//
//
//public class MyGameFrame02  extends JFrame {
//	
//	//加载图片对象
//	Image plane = 图片加载.getImage("images/plane.png");
//	Image bg = 图片加载.getImage("images/bg.jpg");
//	
//	
//	int planeX=250,planeY=250;   //表示飞机初始化坐标
//	
//	
//	//加了这段代码解决awt包的闪烁问题
//	private Image offScreenImage = null;
//	 
//	public void update(Graphics g) {
//	    if(offScreenImage == null)
//	        offScreenImage = this.createImage(500,500);//这是游戏窗口的宽度和高度
//	     
//	    Graphics gOff = offScreenImage.getGraphics();
//	    paint(gOff);
//	    g.drawImage(offScreenImage, 0, 0, null);
//	}  
//	
//	
//	
//	//图形和文本绘制 
//	@Override  
//	public void paint(Graphics g) {
//			
//		 g.drawImage(bg, 0, 0, null);
//		 g.drawImage(plane, planeX, planeY, null);
//		 planeX++;
//	}
//	
//	
//	
//	
//	//定义一个累不累(定义内部类的好处就是可以很方便的去用外部类)
//	class PainThread extends Thread{
//		
//		@Override
//		public void run() {
//			while(true){
//				repaint(); //表示重画窗口
//				try {
//					Thread.sleep(50);//1秒放40次  //按常理来说1秒被放24次人眼才能够适应
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} 
//			}
//		}
//		
//		
//	}
//	
//	
//	
//	
//	
//
//    public void launchFrame(){
//        //在游戏窗口打印标题,继承了Jframe类
//    	this.setTitle("尚学堂学员_程序猿作品");
//      
//        
//        //窗口默认不可见，设为可见，不写默认继承Jframe类
//        this.setVisible(true);
//        
//        //窗口大小：宽度500，高度500
//        this.setSize(500, 500);
//        
//        //窗口左上角顶点的坐标位置
//        this.setLocation(300, 300);
//         
//        //增加关闭窗口监听，这样用户点击右上角关闭图标，可以关闭游戏程序
//        this.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                System.exit(0);
//            }
//        });
//        
//        
//        //启动初始化窗口的线程       
//        new PainThread().start();
//        
//    }
//     
//    public static void main(String[] args) {
//    	MyGameFrame02 f = new MyGameFrame02();
//        f.launchFrame();
//    }
//}