package day06;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.ProcessBuilder.Redirect;

public class try_catch_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		即使try和catch块中存在return语句，finally语句也会执行。是在执行完finally语句后再通过return退出。
		
		FileReader reader = null;
		
		try {
			 reader = new FileReader("d:/02.txt");//遇到异常后，在此之后的代码都不会被执行
			 
			 //FileReader reader声明在外部的原因，只有在try里面才能使用reader。close（）
//			 FileReader reader = new FileReader("d:/02.txt");

			// 默认返回一个int类型，所以需要转一下类型
			char c1 = (char) reader.read();
			System.out.println(c1);

			
			//如果catch两个异常，那么子类在前父类类在后
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// 打印异常信息
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			
			//关闭reader
			try {
				if(reader!=null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
