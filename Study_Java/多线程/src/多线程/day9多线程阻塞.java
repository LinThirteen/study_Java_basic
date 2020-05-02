package 多线程;

import java.text.SimpleDateFormat;
import java.util.Date;

public class day9多线程阻塞 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//倒计时
		Date endTime = new Date(System.currentTimeMillis()+1000*10);
		long end = endTime.getTime();
		System.out.println(endTime);
		while(true) {
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			Thread.sleep(1000);
			endTime = new Date(endTime.getTime()-1000);
			if(end -10000 > endTime.getTime()){
				break;
			}
		}
	}

}
