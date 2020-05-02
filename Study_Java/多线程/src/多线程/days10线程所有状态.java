package 多线程;

import java.lang.Thread.State;

public class days10线程所有状态 {
	public static void main(String[] args) {
		Thread t = new Thread(()-> {
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("......");}
		});
		
		
		//观察状态
		State state = t.getState();
		System.out.println(state); //new
		
		
		t.start();
		state = t.getState();
		System.out.println(state);//runnable
		
		
		
		while(state != Thread.State.TERMINATED) {
			
			//活动的线程数
			int num=Thread.activeCount();
			if(num == 1) {
				break;
			}
			
			state = t.getState();
			//200ms监控一次
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(state);//time_waiting
		}
		
		
		
		state = t.getState();
		System.out.println(state);//结束状态TERMINATED
	}

}
