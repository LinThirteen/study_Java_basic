package 多线程;

public class days14并发协作_生产者消费模式 {
	
//	wait()的作用是让当前线程进入等待状态，同时，wait()也会让当前线程释放它所持有的锁。
//	因为wait需释放锁，所以必须在synchronized中使用
	
	public static void main(String[] args) {
		
		SynContainer container = new SynContainer();
		new Productor(container).start();
		
		new Consumer(container).start();
		
	}
	

}

//生产者
class Productor extends Thread{
	SynContainer container;
	
	//开始生产
	public Productor(SynContainer container) {
		super();
		this.container = container;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			System.out.println("生产---->"+i+"个馒头");
			container.push(new Stemedbun(i));
		}
	}
}

//消费者
class Consumer extends Thread{
	SynContainer container;
	Stemedbun bun;
	//开始消费
	public Consumer(SynContainer container) {
		super();
		this.container = container;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			System.out.println("消费---->"+container.pop().id+"个馒头");
			
		}
	}
}


//缓冲区
class SynContainer{
	
	Stemedbun[] buns = new Stemedbun[10]; //存储容器
	int count=0;
	
	//存储
	public synchronized void push(Stemedbun bun) {
		//容器存在空间才能生产
		//不能生成
		if(count == buns.length) {
			try {
				this.wait();//线程阻塞，消费者通知消费解除，才能阻塞，
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		buns[count] = bun;
		count++;
		this.notify();   //this.notifyAll();   //存在空间了，可以唤醒对方
	}
	
	//获取
	public synchronized Stemedbun pop() {
		//何时才能消费容器中的数据
		//如果没有数据只有等待
		if(count ==0) {
			try {
				this.wait();//线程阻塞，生产者通知消费才能解除阻塞
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//存在
		count --;
		Stemedbun bun = buns[count];
		//唤醒等待者
		this.notify();   //this.notifyAll();   //存在空间了，可以唤醒对方
		return bun;
		
	}
	
	
}



//馒头
class Stemedbun{
	int id;

	public Stemedbun(int id) {
		super();
		this.id = id;
	}
	
}




