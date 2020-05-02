package 多线程;


//加入标识干涉线程停止

public class day9线程停止 implements Runnable {

	//加入标识标记线程体是否可以运行
	private boolean flag = true;
	private String name;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	int i =0;
	while(flag) {
		System.out.println(name+"--->"+i++);
	}
		
		
	}
	
	public day9线程停止( String name) {
		this.name = name;
	}
	
	//对外提供方法改变标识
	public void terminate() {
		
		this.flag = false;
		
	}
	

	public static void main(String[] args) {
		day9线程停止 st = new day9线程停止("hah");
		new Thread(st).start();
		for(int i=0;i<=99;i++) {
			if (i==88){
				st.terminate();
				System.out.println("线程停止");
			}
			System.out.println("main--->"+i);
		}
		
		
	}

}
