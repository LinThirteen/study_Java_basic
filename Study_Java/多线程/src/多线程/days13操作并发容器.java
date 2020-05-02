package 多线程;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class days13操作并发容器 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//内部实现了并发块
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		for(int i=0;i<10000;i++) {
			new Thread(()->{
				list.add(Thread.currentThread().getName());		
		}).start();
	
	}
		Thread.sleep(2000);
		System.out.println(list.size());
	}

}
