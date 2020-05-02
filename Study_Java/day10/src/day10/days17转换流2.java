package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class days17转换流2 {
	
	//InputStreamReader OutputStreamWriter
//		1.以字符流的形式操作字节流（纯文本）
//		2.指定字符集
	
	public static void main(String[] args) {
		
		//加入newinputStreamReader对乱码进行快速处理
		try(BufferedReader reader = 
				new BufferedReader(
						new InputStreamReader(
								new URL("https://www.baidu.com").openStream(),"UTF-8"));
				BufferedWriter writer = 
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("baidu.html"),"utf-8"));){//字节节点流
		String msg = null;
		while((msg=reader.readLine())!=null) {
			System.out.println(msg);
			writer.write(msg);
			writer.newLine();
			writer.flush();
		}
				
	}catch (IOException e) {
		// TODO: handle exception
		System.out.println("操作异常");
	}

}
public static void test1() {
		
		//操作网络流,下载百度源代码
		try(InputStream is = new URL("https://www.baidu.com").openStream();){//字节节点流
		int temp;
		//出现中文乱码
		while((temp=is.read())!=-1) {
			System.out.print((char)temp);
		}
		
		
	}catch (IOException e) {
		// TODO: handle exception
		System.out.println("操作异常");
	}

}



public static void test2() {
	
	//加入newinputStreamReader对乱码进行快速处理
	try(InputStreamReader is =new InputStreamReader(new URL("https://www.baidu.com").openStream(),"UTF-8");){//字节节点流
	int temp;
	//出现中文乱码
	while((temp=is.read())!=-1) {
		System.out.print((char)temp);
	}
	
	
}catch (IOException e) {
	// TODO: handle exception
	System.out.println("操作异常");
}

}
}