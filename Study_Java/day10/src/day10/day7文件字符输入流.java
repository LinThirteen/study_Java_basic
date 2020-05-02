package day10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class day7文件字符输入流 {
	
	public static void main(String[] args) {
		
		//文件字符输入流(一个中文也是一个字符)
		
		//1.创建源
		//2.选择流
		//3.操作
		//4.关闭资源
		
		
		
		//1.创建源
		File src = new File("abc.txt");
		
		//2.选择流
		Reader reader = null;
		
		try {
			reader = new FileReader(src);
			
			//操作(操作字符数组)
			char[] flush = new char[3];
			int len =-1;
			while((len=reader.read(flush))!=-1) {
				//字符数组----->字符串
				String str = new String(flush,0,len);
				System.out.println(str);
			}
						
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(null!=reader) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
