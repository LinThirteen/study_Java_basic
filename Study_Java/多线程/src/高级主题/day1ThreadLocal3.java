package 高级主题;


public class day1ThreadLocal3 {
	
	
//	InheritableThreadLocal:继承上下文环境的数据，拷贝一份给子线程 起点
	private static ThreadLocal<Integer> threadlocal2 = new InheritableThreadLocal<Integer>();	

	public static void main(String[] args) {
		threadlocal2.set(2);
		System.out.println(Thread.currentThread().getName()+"--->"+threadlocal2.get()); //2
		
		//子线程有main线程开辟
		new Thread(()-> {
			System.out.println(Thread.currentThread().getName()+"--->"+threadlocal2.get());//2
			threadlocal2.set(200);
			System.out.println(Thread.currentThread().getName()+"--->"+threadlocal2.get());//200

	}).start();;

	}
}






















