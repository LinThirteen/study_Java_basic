package 多线程;

import java.util.ArrayList;
import java.util.List;

public class days13快乐火车票 {
	
	public static void main(String[] args) {
		
//		任何实现了Runnable接口类型的对象都可以做为参数传进去
//		比如 class A implements Runnable{}
//		A a = new A();
//		这个a就可以作为参数传 进去
		
		seats12306 c = new seats12306(4,"影院1");
//		new Thread(new Customers(c,seats1),"老高").start();
//		new Thread(new Customers(c,seats2),"老红").start();
		
		
		//seats12306找寻哪个用户在用它
		new  Customers(2,c,"老高").start();
		new  Customers(3,c,"老黄").start();
		
	}
}


//继承Thread为seats12306做代理
class Customers extends Thread{
	int seats;
	
	public Customers(int seats,Runnable target,String name) {
		//其中Runnable target为将父类的构造器延续下来
		super(target,name);
		this.seats = seats;
		
	}
}


class seats12306 implements Runnable{
	int avaliable;//可用的位置
	String name;//名称
	public seats12306(int avaliable, String name) {
		super();
		this.avaliable = avaliable;
		this.name = name;
	}
	
	public void run() {
		
		//查找哪个对象在使用本对象，并对它进行强转
		Customers c = (Customers)Thread.currentThread();
			
		// TODO Auto-generated method stub	
		boolean flag = this.bookTickets(c.seats);
		if(flag) {
			System.out.println("订购成功"+Thread.currentThread().getName()+"-<位置为"+c.seats);
		}else {
			System.out.println("出票失败");
		}
		}
	
	//购票
	public synchronized boolean bookTickets(int seats) {
		System.out.println("可用位置为---->"+avaliable);
		if(seats>avaliable) {
			return false;
		}
		avaliable -=seats;
		return true;
	}
	
}