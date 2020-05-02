package 多线程;

public class day5模拟龟兔赛跑 implements Runnable {

	
	private static String winner; //勝利者
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int steps=1;steps <=101;steps++ ) {
			System.out.println(Thread.currentThread().getName()+"--->"+steps);
		
		//模拟休息
			if(Thread.currentThread().getName().equals("rebbit")&&steps%10==0) {
				
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		//比赛是否结束
		boolean flag = gameOver(steps);
		if(flag) {
			break;
		}
		}
	}
	private boolean gameOver(int steps) {
		
		if(winner!=null) {//存在胜利者
			return true;
		}else {
			if(steps == 100) {
				winner = Thread.currentThread().getName();
				System.out.println("winner==>"+winner);
				return true;
			}			
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		day5模拟龟兔赛跑 re = new day5模拟龟兔赛跑();
		new Thread(re,"tortoies").start();
		new Thread(re,"rebbit").start();
	}

}
