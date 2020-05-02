package 高级主题;


//java中synchronized和ReentrantLock的区别

//
//两者的共同点：
//
//都是用来协调多线程对共享对象、变量的访问
//都是可重入锁，同一线程可以多次获得同一个锁
//都保证了可见性和互斥性







//锁可以延续使用

public class day2可重入锁 {
	
	public void test() {
		//第一次获得锁
		synchronized (this) {
			while(true) {
			//第二次获得锁
			synchronized (this) {
				System.out.println("ReentrantLock!");
				
			}	
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		new day2可重入锁().test();
	}

}
