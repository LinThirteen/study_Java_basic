package 高级主题;


//volatile用于保证数据的同步，也就是可见性


public class day1Volitale {
	
	
	
	private  static int num = 0;
	public static void main(String[] args) throws InterruptedException {
		new Thread(()-> {
			while(num==0) {//此处不要编写代码
				
			}
				
	}).start();
		
		//理论上1秒后循环停止，但是1秒后循环没有停止
		//原因是计算机太忙了没有办法同步代码
		//解决办法是加一个volatile
		//private volatile static int num = 0;
		Thread.sleep(1000);
		num=1;

}
}