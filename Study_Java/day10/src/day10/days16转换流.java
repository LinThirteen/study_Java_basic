package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class days16转换流 {
	
	//InputStreamReader OutputStreamWriter
//		1.以字符流的形式操作字节流（纯文本）
//		2.指定字符集
	
	public static void main(String[] args) {
		
		
		
		//以字符流的形式操作字节流
		//操作System.in和System.out
		try(BufferedReader isr =new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter osw =new BufferedWriter(new OutputStreamWriter(System.out));){
		
		//循环获取键盘的输入，输出此内容
		String msg = "";
		while(!msg.equals("exit")) {
			msg = isr.readLine();
			osw.write(msg); //循环写出
			osw.newLine();
			osw.flush();
		}
		
		
	}catch (IOException e) {
		// TODO: handle exception
		System.out.println("操作异常");
	}

}
}