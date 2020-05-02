package 多线程;

public class day9多线程join {
	
	//join合并线程，待此线程执行完毕后，在执行其他线程，其他线程阻塞
	//类似插队
	
	public static void main(String[] args) throws InterruptedException {
//		Thread t = new Thread(()-> {
//			for(int i=0;i<100;i++) {
//				System.out.println("lambda"+i);
//			}
//	});//因为对象要多次使用，所以不能直接.start()
//		
//		t.start();
//		
//		for(int i=0;i<100;i++) {
//			if(i==10) {
//				//当main==20之后只能等lambda线程执行完毕后才能执行main线程
//				t.join();//其中join也可以传时间，如果时间到了还没有完成cpu重新调度
//			}
//			System.out.println("main"+i);
//		}
		
		
		
		
		
		
		//爸爸和儿子买烟的故事
		Thread st = new Thread(new Father());
		st.start();
		
		
}
}


class Father extends Thread{
	public void run() {
		System.out.println("想抽烟，发现烟没了！");
		System.out.println("让儿子去买烟");
		Thread t = new Thread(new Son());
		t.start();
		try {
			t.join(); //father被阻塞
			System.out.println("老爸接过烟，把零钱给儿子");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("老爸找儿子去");
		}
		
	}
}

class Son extends Thread{
	public void run() {
		System.out.println("接过老爸的前出去了");
		System.out.println("路边有个游戏厅完了10秒");
		for(int i=0;i<10;i++) {
			System.out.println(i+"秒过去了！");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("赶紧买烟去");
		System.out.println("手拿中华回家了");
	}
}
