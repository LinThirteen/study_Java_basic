//package cn.sxt.game;
//
//
//import javax.swing.JFrame;
//
//import java.awt.Image;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
// 
//public class MyGameFrame  extends JFrame {
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
//    	MyGameFrame f = new MyGameFrame();
//        f.launchFrame();
//    }
//}