package 多线程;



public class day4Web12306 implements Runnable {

	//票数
	private static int ticketNums=300;
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(ticketNums >0) {
			try {
				//加等待时间后就会出现资源争夺
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ticketNums--);
			
		}
	
	}
	public static void main(String[] args) throws InterruptedException {
		//一份资源多个代理
		day4Web12306 web = new day4Web12306();	
		System.out.println(Thread.currentThread().getName());//main方法

		
		new Thread(web,"代理1-").start();
		new Thread(web,"代理2-").start();
		new Thread(web,"代理3-").start();

		
	}

}
