package 高级主题;

//ThreadLocal能够放一个线程级别的变量，器本身能够被多个线程共享使用，并且达到安全的目的。
//就是想在多个线程环境下去保证成员变量的安全


public class day1ThreadLocal {
	//开辟一块大的存储空间用来存储各个线程
//	private static ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>();	
	
	//更改初始值
//	private static ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>() {
//		protected Integer initialValue() {
//			return 200;
//		}
//	};	
	
	//更改初始值2
//	private static ThreadLocal<Integer> threadlocal1 = ThreadLocal.withInitial(()->{
//		return 200;
//	});
	
	//更改初始值3
	private static ThreadLocal<Integer> threadlocal2 = ThreadLocal.withInitial(()->1);
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//获取值
//		System.out.println(Thread.currentThread().getName()+"---->"+threadlocal2.get()); //null
		
		//设置值
		
		System.out.println(Thread.currentThread().getName()+"---->"+threadlocal2.get()); //99
		MyRun m = new MyRun();
		new Thread(m).start();
		new Thread(m).start();
		Thread.sleep(1000);
		m.run();
	}


//内部
public static class MyRun implements Runnable{
	
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		threadlocal2.set((int)(Math.random()*99));//0-98的整数 
//		System.out.println(Thread.currentThread().getName()+"---->"+threadlocal2.get()); 
//
//	}
	
	//线程获取同一个资源
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//每个线程都有自己的存储区域，并且得到的资源和更改其他的资源不会互相的影响
		Integer lef = threadlocal2.get();
		System.out.println(Thread.currentThread().getName()+"得到了"+threadlocal2.get()); 
		threadlocal2.set(lef-1);
		System.out.println(Thread.currentThread().getName()+"还剩"+threadlocal2.get()); 
	
	}
	
}

}






















