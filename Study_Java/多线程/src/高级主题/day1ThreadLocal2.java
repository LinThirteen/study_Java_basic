package 高级主题;

//ThreadLocal能够放一个线程级别的变量，器本身能够被多个线程共享使用，并且达到安全的目的。
//就是想在多个线程环境下去保证成员变量的安全


public class day1ThreadLocal2 {

	
	//更改初始值3
	private static ThreadLocal<Integer> threadlocal2 = ThreadLocal.withInitial(()->1);
	
	public static void main(String[] args) {
		
		
		MyRuns m = new MyRuns();
		m.ret();
		new Thread(m).start();
	}


//内部类
public static class MyRuns implements Runnable{
	
	public MyRuns() {
		//main线程
		threadlocal2.set(200);
		System.out.println(Thread.currentThread().getName()+"--->"+threadlocal2.get()); //200

	}
	
	void ret(){
		//main线程
		System.out.println(Thread.currentThread().getName()+"--->"+threadlocal2.get()); //200

	}
	
	//线程获取同一个资源
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//不是main线程，是Thread-0
		System.out.println(Thread.currentThread().getName()+"得到了"+threadlocal2.get()); 

	}
	
}

}






















