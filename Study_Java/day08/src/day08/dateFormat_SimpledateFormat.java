package day08;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormat_SimpledateFormat {
	
	//throws ParseException代表直接抛出异常
	 public static void main(String[] args) throws ParseException {
		 
		 	
		 	//测试时间对象和字符串之间的转换
		 
	        // new出SimpleDateFormat对象
//	        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	        SimpleDateFormat s1 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
	        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd");
	        // 将时间对象转换成字符串
	        //1970年01月01日 08:00:01
	        String daytime = s1.format(new Date(1000));
	        System.out.println(daytime);
	        
	        
	        
//	        System.out.println(s2.format(new Date()));
//	        System.out.println(new SimpleDateFormat("hh:mm:ss").format(new Date()));
//	        // 将符合指定格式的字符串转成成时间对象.字符串格式需要和指定格式一致。
//	        String time = "2007-10-7";
//	        Date date = s2.parse(time);
//	        System.out.println("date1: " + date);
//	        time = "2007-10-7 20:15:30";
//	        date = s1.parse(time);
//	        System.out.println("date2: " + date);
	        
	        
	        
	        //其他格式
	        SimpleDateFormat s4 = new SimpleDateFormat("D");
	        String day = s4.format(new Date());
	        System.out.println(day);
	    }
}
