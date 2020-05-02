package 多线程;

public class day7lambda简化多线程 {

	
	public static void main(String[] args) {
		new Thread(()-> {
		System.out.println("两行代码");
		System.out.println("一边学习lambda");	
		}).start();
		
		
		new Thread(()->System.out.println("一边成长")).start();
	
	
	}
	
}
