package 高级主题;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

//任务定时调度借助Timer和TimerTask类


public class day1任务定时调度 {

	
	public static void main(String[] args) {
		Timer time= new Timer();
		
		//执行安排,1秒后执行任务
//		time.schedule(new MyTask(), 1000);  //执行任务一次
		
		
		//循环执行，1秒后执行，每隔200毫秒再次执行
//		time.schedule(new MyTask(), 1000,200);
		
		Calendar cal = new GregorianCalendar(2099,12,31,21,53,54);
		time.schedule(new MyTask(), cal.getTime() ,200);
	}
	
}

class MyTask extends TimerTask{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println("放空一下大脑");
		}
	}
}
