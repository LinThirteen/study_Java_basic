package day04;

public class 方法重写 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Horse ho = new Horse();
		ho.run();  //我是车
	}

}


class Vehicle{
	public void run() {
		System.out.println("跑");
	}
	public void stop() {
		System.out.println("停止");
	}
	
//	public Person whoh(){
//		return new Person();
//	}
}


class Horse extends Vehicle{
	//方法重写，覆盖父类
	public void run() {
		System.out.println("我是车");
	}
	
	
//	public Student whoh() {
//		return new Student();
//	}
}

