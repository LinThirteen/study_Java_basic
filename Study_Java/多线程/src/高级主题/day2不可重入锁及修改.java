//package 高级主题;

//不可重入锁

//public class day2不可重入锁及修改 {
//	Lock lock = new Lock();
//	
//	public void a() throws InterruptedException {
//		lock.lock(); 
//		dosomething();
//		lock.unlock();
//	}
//	
//	
//	//不可重入
//	public void dosomething() throws InterruptedException {
//		lock.lock(); 
//		//........
//		lock.unlock();
//	}
//	
//	public static void main(String[] args) throws InterruptedException {
//		day2不可重入锁及修改 test = new day2不可重入锁及修改();
//		test.a();
//	}
//
//}
//
//
//class Lock{
//	//是否占用
//	private boolean isLocked = false;
//	
//	//使用锁
//	public synchronized void lock() throws InterruptedException {
//		while(isLocked) {  
//			wait();
//		}
//		 isLocked = true;
//	}
//	
//	//释放锁
//	public synchronized void unlock() {
//		isLocked = false;
//		notify();
//	}
//}





//修改

package 高级主题;

import java.util.concurrent.locks.ReentrantLock;

//不可重入锁

public class day2不可重入锁及修改 {
	Lock lock = new Lock();
	
	//也可以采用
//	ReentrantLock lock = new ReentrantLock();
	
	public void a() throws InterruptedException {
		lock.lock(); 
		System.out.println(lock.holdCount);
		dosomething();
		lock.unlock();
		System.out.println(lock.holdCount);
	}
	
	
	//不可重入
	public void dosomething() throws InterruptedException {
		lock.lock(); 
		System.out.println(lock.holdCount);
		dos() ;
		lock.unlock();
		System.out.println(lock.holdCount);
	}
	
	void dos() throws InterruptedException {
		lock.lock(); 
		System.out.println(lock.holdCount);
		lock.unlock();
		System.out.println(lock.holdCount);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		day2不可重入锁及修改 test = new day2不可重入锁及修改();
		test.a();
	}

}


class Lock{
	//是否占用
	private boolean isLocked = false;
	Thread lockeBy =null; //存储线程
	
	int holdCount =0;
	
	//使用锁
	public synchronized void lock() throws InterruptedException {
		Thread t = Thread.currentThread();
		while(isLocked && lockeBy!=t) {  
			wait();
		}
		System.out.println(Thread.currentThread().getName());
		 isLocked = true;
		 lockeBy = t;
		 holdCount+=1;
	}
	
	//释放锁
	public synchronized void unlock() {
		if(Thread.currentThread()==lockeBy) {
			 holdCount --;
			 if(holdCount==0) {
				isLocked = false;
				notify();
				lockeBy = null;
			 }
	}	
	}
}



















