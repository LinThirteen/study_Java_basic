package 多线程;

public class days12多线程_网红思维 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//判断线程是否还活着
		System.out.println(Thread.currentThread().isAlive());
			
		
		//设置名字：真实角色+代理角色
		Myinfo n = new Myinfo("战斗机");
		Thread t =new Thread(n);
		t.setName("公鸡");//修改Thread的名字
		t.start();
		Thread.sleep(1000);
		System.out.println(t.isAlive());
		
	}
	

}


class Myinfo implements Runnable{
	
	private String name;
	
	
	public Myinfo(String name) {
		super();
		this.name = name;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"--->"+name);
	}
}