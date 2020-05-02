package 多线程;

//死锁过多的同步可能造成相互不释放资源
//避免：不要再同一个代码块中，同时持有多个对象的锁


public class days14死锁 {
	public static void main(String[] args) {
		
	
	Markup g1 = new Markup(1, "第一");
	Markup g2 = new Markup(0, "第二");
	g1.start();
	g2.start();
}
	}

class Lipstick {

	
}

class Mirror {

	
}

class Markup extends Thread {
	static Lipstick lipstick = new Lipstick(); //静态对象，无论创建多少个都为一个
	static Mirror mirror = new Mirror();
	int choice;
	String girl;

	public Markup(int choice, String girl) {
		super();
		this.choice = choice;
		this.girl = girl;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		makup();

	}

	// 相互持有对方的对象锁-->可能造成死锁
	private void makup() {
		if (choice == 0) {
			synchronized(lipstick){// 获得口红的锁
				System.out.println(this.girl + "获得口红");

				// 1秒后想拥有镜子的锁
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				synchronized (mirror) {
//					System.out.println(this.girl + "获得镜子");
//				}
			}
			synchronized(mirror){
				System.out.println(this.girl + "获得镜子");
			}
		} else {
			synchronized(mirror){// 获得镜子的锁
				System.out.println(this.girl + "获得镜子");

				// 1秒后想拥有镜子的锁
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				synchronized (lipstick) {
//					System.out.println(this.girl + "获得口红");
//				}
			}
			
			synchronized (lipstick) {
				System.out.println(this.girl + "获得口红");
			}
		}
	}

}