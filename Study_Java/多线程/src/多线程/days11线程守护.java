package 多线程;

public class days11线程守护 {

	//默认线程是用户线程，虚拟机等待所有的用户线程执行完毕才会结束
	public static void main(String[] args) {
		Thread t = new Thread(new God());
		t.setDaemon(true);//将用户线程设置为守护线程，意思为jvm不用等待该程序执行完就可以结束了
		t.start();
		new Thread(new Yous()).start();
	}
}


class Yous implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<500;i++) {
			System.out.println("happy life...."+i);
		}
		System.out.println("000000");
	}
}

class God extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<50000000;i++) {
			System.out.println("god"+i);
		}
		System.out.println("000000");
	}
}