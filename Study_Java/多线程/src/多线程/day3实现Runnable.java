package 多线程;


//使用多线程，建议使用Runnable
//避免单继承的局限性，优先使用接口
//方便共享资源



//创建；实现Runnabel+重写run
//启动：创建实现类的对象，+Thread + start




public class day3实现Runnable implements Runnable {

	
	@Override  //一定要重写run方法,线程入口点
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0;i<20;i++) {
			System.out.println("一边听歌");
		}
	}
	
public static void main(String[] args) {
		
	
		//第一种写法，
//		//创建实现类对象
//		day1开始线程 st = new day1开始线程();
//		//创建代理类对象,并丢入st
//		Thread t = new Thread(st);
//		//开始一个新的线程，交给cpu去调度
//		t.start();
	
	
	
		//第二种写法，如果一个对象只使用一次可以使用匿名，不用声明引用
		new Thread(new day3实现Runnable()).start();
		
	
			
		for(int i=0;i<20;i++) {
			System.out.println("一边coding");
			
		}
		
	}
}
