package 多线程;

public class day14s信号灯法 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		new Player(tv).start();
		new Watcher(tv).start();
		
		
	}

}

//生产者 演员
class Player extends Thread{
	Tv tv;

	public Player(Tv tv) {
		this.tv = tv;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			if(i%2==0) {
				this.tv.play("奇葩说");
			}else {
				this.tv.play("太无聊");
			}
		}
	}
	
}
//消费者 观众
class Watcher extends Thread{
	Tv tv;

	public Watcher(Tv tv) {		
		this.tv = tv;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<20;i++) {
			tv.watch();
		}
	}
	
}




//同一个资源

class Tv{
	String voice;
	//信号灯
	//T表示演员表演 观众等待
	//F表示观众观看  演员等待
	boolean flag = true;
	
	
	//表演
	public synchronized void play(String voice){
		//演员等待，
		if(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("表演了："+voice);
		this.voice =voice;
		//唤醒
		this.notifyAll();
		this.flag=!this.flag;
	}
	
	
	public synchronized void watch() {
//		观众等待
		if(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("听到了:"+voice);
		
		//唤醒
		this.notifyAll();
		this.flag=!this.flag;
	}
	
	
}