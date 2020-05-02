package day08;

import java.util.Date;

public class Date时间类 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		Date d = new Date();
		System.out.println(d); //获取当前时间
		System.out.println(d.getTime());//获取毫秒数
	
	
		
		
		 Date date1 = new Date();
	        System.out.println(date1.toString());
	        long i = date1.getTime();
	        Date date2 = new Date(i - 1000);
	        Date date3 = new Date(i + 1000);
	        System.out.println(date1.after(date2));
	        System.out.println(date1.before(date2));
	        System.out.println(date1.equals(date2));
	        System.out.println(date1.after(date3));
	        System.out.println(date1.before(date3));
	        System.out.println(date1.equals(date3));
	        System.out.println(new Date(1000L * 60 * 60 * 24 * 365 * 39L).toString());
	
	
	}

}
