package 多线程;

public class days11线程的优先级 {

	
//	  1. 处于就绪状态的线程，会进入“就绪队列”等待JVM来挑选。
//
//      2. 线程的优先级用数字表示，范围从1到10，一个线程的缺省优先级是5。
//
//      3. 使用下列方法获得或设置线程对象的优先级。
//
//         int getPriority();
//
//         void setPriority(int newPriority);
//
//      注意：优先级低只是意味着获得调度的概率低。并不是绝对先调用优先级高的线程后调用优先级低的线程。
	

	  
	
	
	
	public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread(), "t1");
        Thread t2 = new Thread(new MyThread(), "t2");
    	//#MAX_PRIORITY  10
    	//#MIN_PRIORITY  1
    	//#NORM_PRIORITY   5    默认为5
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }
}
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}