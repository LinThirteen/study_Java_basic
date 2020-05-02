package day08;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class calendar日历类 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建日期类
		Calendar calendar = new GregorianCalendar(2999,10,9,22,10,50);
		//获取年份
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		int month= calendar.get(Calendar.MONTH);
		System.out.println(month);//0是1月
		
		//星期几， 1：代表星期日。
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekday);
		
		
		int day = calendar.get(Calendar.DATE);
		System.out.println(day);
		
		
		//设置日期的相关元素
		Calendar c1 = new GregorianCalendar();
		
		//设置年限
		c1.set(Calendar.YEAR, 8012);
		System.out.println(c1);
		
		
		//日期的计算
		Calendar c2 = new GregorianCalendar();
		//往后100天
		c2.add(Calendar.DATE,100);
		System.out.println(c2);
		
		//日期对象和时间对象的转化
		Date d4 = c2.getTime();
		Calendar c4 = new GregorianCalendar();
		c4.setTime(new Date());
		
	}
	
	
	public static void printCalendar(Calendar c) {
		//打印：1918年10月10日 11:23:45 周三
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1; //1-12
		int date = c.get(Calendar.DAY_OF_MONTH);
		int dayweek = c.get(Calendar.DAY_OF_WEEK)-1;//0为周日
		
		String dayweek2 = dayweek ==0?"日":dayweek+"";
		
		int hour =c.get(Calendar.HOUR);
		int minute =c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒"+dayweek2+"周");
		
	}
	

}
