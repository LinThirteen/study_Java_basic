package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class day5_1并发龟兔赛跑 implements Callable<Integer> {
private static String winner; //勝利者
	
	@Override
	public Integer call() throws Exception  {
		// TODO Auto-generated method stub
		for(int steps=1;steps <=101;steps++ ) {
			System.out.println(Thread.currentThread().getName()+"--->"+steps);
		
		//模拟休息
			if(Thread.currentThread().getName().equals("rebbit")&&steps%10==0) {
		
					Thread.sleep(50);}			
		//比赛是否结束
		boolean flag = gameOver(steps);
		if(flag) {
			return steps;	
		}
		}
			return null;
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
	
	public static void main(String[] args) throws InterruptedException,ExecutionException{
		day5模拟龟兔赛跑 re = new day5模拟龟兔赛跑();
		
		//创建执行任务服务
		ExecutorService ser = Executors.newFixedThreadPool(2);
		
		//提交执行
		Future<Integer> resul1 =  (Future<Integer>) ser.submit(re);
		Future<Integer> resul2 =  (Future<Integer>) ser.submit(re);
		
		//获取结果
		Integer r1 = resul1.get();
		Integer r2 = resul2.get();
		System.out.println(r1+"---->"+r2);
		
		//关闭服务
		ser.shutdownNow();

	}

}