package 多线程;

import java.util.ArrayList;
import java.util.List;

public class days13快乐电影院 {

	public static void main(String[] args) {
		
		//准备可用位置
		List<Integer> avaliable = new ArrayList<Integer>();
		avaliable.add(1);
		avaliable.add(2);
		avaliable.add(3);
		avaliable.add(4);
		avaliable.add(5);
		avaliable.add(6);
		avaliable.add(10);
		avaliable.add(13);
		
		
		//顾客需要的位置
		List<Integer> seats1 = new ArrayList<Integer>();
		seats1.add(1);
		seats1.add(2);
		//顾客需要的位置
		List<Integer> seats2 = new ArrayList<Integer>();
		seats2.add(5);
		seats2.add(7);
		
		
		
		Cinema c = new Cinema(avaliable,"影院1");
		//将电影院抛给用户去选
		new Thread(new Customer(c,seats1),"老高").start();
		new Thread(new Customer(c,seats2),"老红").start();
	}
	
}


//顾客
//class Customer implements Runnable{
//	Cinema cinema;
//	int seats;
//	
//	public Customer(Cinema cinema, int seats) {
//		super();
//		this.cinema = cinema;
//		this.seats = seats;
//	}
//
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		synchronized (cinema) {		
//		boolean flag = cinema.bookTickets(this.seats);
//		if(flag) {
//			System.out.println("订购成功"+Thread.currentThread().getName()+"-<位置为"+seats);
//		}else {
//			System.out.println("出票失败");
//		}
//		}
//	}
//}



//优化改容器
class Customer implements Runnable{
	Cinema cinema;
	List<Integer> seats;
	
	public Customer(Cinema cinema, List<Integer> seats) {
		super();
		this.cinema = cinema;
		this.seats = seats;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (cinema) {		
		boolean flag = cinema.bookTickets(this.seats);
		if(flag) {
			System.out.println("订购成功"+Thread.currentThread().getName()+"-<位置为"+seats);
		}else {
			System.out.println("出票失败");
		}
		}
	}
}


////影院
//class Cinema{
//	int avaliable;//可用的位置
//	String name;//名称
//	public Cinema(int avaliable, String name) {
//		super();
//		this.avaliable = avaliable;
//		this.name = name;
//	}
//	
//	//购票
//	public boolean bookTickets(int seats) {
//		System.out.println("可用位置为---->"+avaliable);
//		if(seats>avaliable) {
//			return false;
//		}
//		avaliable -=seats;
//		return true;
//	}
//	
//}




//优化影院
class Cinema{
	List<Integer> avaliable;//可用的位置
	String name;//名称
	public Cinema(List<Integer> avaliable, String name) {
		super();
		this.avaliable = avaliable;
		this.name = name;
	}
	
	//购票
	public boolean bookTickets(List<Integer> seats) {
		System.out.println("可用位置为---->"+avaliable);
		List<Integer> copy = new ArrayList<Integer>();
		copy.addAll(avaliable);
	
		//相减,取差集
		copy.removeAll(seats);
		
		//判断大小
		if(avaliable.size()-copy.size() !=seats.size()) {
			return false;
		}
		//成功
		avaliable = copy;
		return true;
	}
	
}