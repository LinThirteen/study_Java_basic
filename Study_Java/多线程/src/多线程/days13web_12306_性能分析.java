package 多线程;



public class days13web_12306_性能分析 implements Runnable {

	//票数
	private static int ticketNums=300;
	private static boolean flag =  true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(flag) {						
			//模拟延时
			try {
				//加等待时间后就会出现资源争夺
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			test2();
		}
	
	}
	
	//优化，考虑最后欧一张票的情况
	//双重检测
	public void test3() {
		if(ticketNums <=0) {
			flag = false;
			return;
		}
		synchronized (this) {
			//如果是	synchronized ((Integer)ticketNums) {就是线程不安全，ticketNums的对象在变
			
			if(ticketNums <=0) {
				flag = false;
				return;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ticketNums--);

		}
	}
	
	
	public void test2() {
		synchronized (this) {
		//如果是	synchronized ((Integer)ticketNums) {就是线程不安全，ticketNums的对象在变
		
		if(ticketNums <=0) {
			flag = false;
			return;
		}
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+ticketNums--);

	}
	}
	
	public static void main(String[] args) throws InterruptedException {
		//一份资源多个代理
		days13web_12306_性能分析 web = new days13web_12306_性能分析();	
		System.out.println(Thread.currentThread().getName());//main方法

		
		new Thread(web,"代理1-").start();
		new Thread(web,"代理2-").start();
		new Thread(web,"代理3-").start();

		
	}

}
