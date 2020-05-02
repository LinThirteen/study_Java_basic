package 多线程;

public class day9多线程yield {
	
	//yield中让当前正在执行线程暂停，不是阻塞线程，而是线程从运行状态转入就绪状态
	//让cpu调度器重新调度
	
	public static void main(String[] args) {
		MyYield my = new MyYield();
		 new Thread(my,"A").start();
		 new Thread(my,"B").start();
		
	
	
	//lambda
	new Thread(()-> {
		for(int i=0;i<100;i++) {
			System.out.println("lambda"+i);
		}
	}).start();
	
	for(int i=0;i<100;i++) {
		if(i%20==0) {
			Thread.yield();//main线程礼让
		}
		System.out.println("main"+i);
	}
	
}
}
class MyYield implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"--->start");
		Thread.yield();//礼让，重回调度器里面等待调度
		System.out.println(Thread.currentThread().getName()+"--->end");

	}
	
}