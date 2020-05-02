package 高级主题;

public class day1HappenBefore {
	//变量1
	private static int a = 0;
	
	
	//变量2
	private static boolean flag = false;
	
	public static void main(String[] args) throws InterruptedException {
		
		for(int i=0;i<100;i++) {
			a=0;
			flag = false;
			
			
			
		
		//线程1 更改数据
		Thread t = new Thread(()-> {
		a = 1;
		flag = true;
		
	});
	
		//线程2 读取数据
		Thread t1 = new Thread(()-> {
			if(flag) {
				a*=1;
			}
			
			//存在指令重排,a的值还没回来就执行
			//有时候会有时候不会
			if(a==0) { //预期的走法，a永远不会为0
				a*=1;
				System.out.println("happen before a->"+a);
			}
			
		});
		
		t.start();
		t1.start();
		//让t执行完在执行t1
		//线程插队
		t.join();
//		System.out.println("----"+a);
		t1.join();
}
	}
}