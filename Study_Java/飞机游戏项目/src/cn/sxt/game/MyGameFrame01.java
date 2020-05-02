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
//public class MyGameFrame01  extends JFrame {
//	
//	//加载图片对象
//	Image ball = 图片加载.getImage("images/ball.png");
//	
//	@Override是伪代码,表示重写(当然不写也可以)，不过写上有如下好处:  1、可以当注释用,方便阅读； 
//	2、编译器可以给你验证@Override下面的方法名是否是你父类中所有的，如果没有则报错。
//	例如，你如果没写@Override，而你下面的方法名又写错了，这时你的编译器是可以编译通过的，
//	因为编译器以为这个方法是你的子类中自己增加的方法。   举例：在重写父类的onCreate时，
//	在方法前面加上@Override 系统可以帮你检查方法的正确性。 @Override public void onCreate(Bundle savedInstanceState) 
//	



//	//图形和文本绘制 
//	@Override  
//	public void paint(Graphics g) {
//		// TODO Auto-generated method stub
//		//改变画笔颜色
//		Color c = g.getColor();		
//		g.setColor(Color.BLUE);
//		
//		//改变字体
//		Font f = g.getFont();
//		
////		 从坐标点(100,50)到(400,400)画出直线
//	    g.drawLine(100, 50, 400, 400); 
//	    //画出矩形。矩形左上角顶点坐标(100,50)，宽度300，高度300
//	    g.drawRect(100, 50, 300, 300);  
//	    //画出椭圆。椭圆外切矩形为：左上角顶点(100,50),宽度300，高度300
//	    g.drawOval(100, 50, 300, 300);  
//	    
//	    g.setColor(Color.red);
////	    g.setFont(new Font("宋体",Font.BOLD.50));
//	    g.drawString("我是谁？", 200, 200);
//	    
//	    g.drawImage(ball, 250, 250, null);
//	    
//	    g.setColor(c);
//	    g.setFont(f);
//	}
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
//    }
//     
//    public static void main(String[] args) {
//    	MyGameFrame01 f = new MyGameFrame01();
//        f.launchFrame();
//    }
//}