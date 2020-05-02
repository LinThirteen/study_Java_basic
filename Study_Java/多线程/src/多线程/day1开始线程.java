package 多线程;


//继承thread+重写run

public class day1开始线程 extends Thread {

	@Override  //一定要重写run方法,线程入口点
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<20;i++) {
			System.out.println("一边听歌");
		}
	}
	
	
	public static void main(String[] args) {
		
		//创建实现类对象
		day1开始线程 st = new day1开始线程();
		//开始一个新的线程，交给cpu去调度
		st.start();
		
//		//普通方法的调用
//		st.run();
		
		for(int i=0;i<20;i++) {
			System.out.println("一边coding");
			
		}
		
	}
}
