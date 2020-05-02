package 多线程;

import java.util.ArrayList;
import java.util.List;

public class days13多线程_并发_非同步 implements Runnable {

	//票数
		private static int ticketNums=10;
		private boolean flag = true;
		static int num =0;
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
			while(flag) {
				test();
		
		}
		
		}
		public void test() {
			if(ticketNums<0) {
				flag = false;
				return;
				
			}
			try {
				
				//加等待时间后就会出现资源争夺
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ticketNums--);
			
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		  处理多线程问题时，多个线程访问同一个对象，并且某些线程还想修改这个对象。 这时候，我们就需要用到“线程同步”。 
//		  线程同步其实就是一种等待机制，多个需要同时访问此对象的线程进入这个对象的等待池形成队列，等待前面的线程使用完毕后，
//		  下一个线程再使用。
		
		
		
		days13多线程_并发_非同步 web = new days13多线程_并发_非同步();	
		
		new Thread(web,"代理1-").start();
		new Thread(web,"代理2-").start();
		new Thread(web,"代理3-").start();
		
//		List<String> list = new ArrayList<String>();
//		for(int i=0;i<10000;i++) {
//			new Thread(()->{
//				list.add(Thread.currentThread().getName());
//				
//			
//		}).start();
			
		
//	}
//		System.out.println(list.size());
	}
}
