package 多线程;

public class day8推导lambda简化线程 {
	
	
	//静态内部类，随着外部类的调用而加载，只在内部类中调用一次，用于提高性能，
	static class Test implements Runnable{

	
	public void run() {
		for(int i =0;i<20;i++) {
			System.out.println("一边听歌");
		}
	}
	}
	
	public static void main(String[] args) {
		
		
		//使用到  day8推导lambda简化线程（）才会编译
		new Thread(new Test()).start(); 
		
		for(int i=0;i<20;i++) {
			System.out.println("一边coding");
			
		}
		
		
		
		//局部内部类，方法内部的
		 class Test2 implements Runnable{
	
			public void run() {
				for(int i =0;i<20;i++) {
					System.out.println("一边听歌");
				}
			}
			}
		
		new Thread(new Test2()).start(); 
		
		
		
		
		//匿名内部类，必须借助管口或者父类
		new Thread(new Runnable(){
			public void run() {
				for(int i =0;i<20;i++) {
					System.out.println("一边听歌");
				}
			}
		}).start();
		
		
		
		
		//jdk8简化 lambda,规定类里面只能有一个方法
		new Thread(()->{
				for(int i =0;i<20;i++) {
					System.out.println("一边听歌");
				}
			}
		).start();
		
		
		
	}
}
