package day10;

import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

public class days18打印流 {
	public static void main(String[] args) throws FileNotFoundException {
		
		//输出到控制台
		PrintStream ps = System.out;
		ps.println("打印流");
		ps.println(true);
		
		//输入到文件
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream("print.txt")));
		ps.println("打印流");
		ps.println(true);
		ps.flush();
		ps.close();
		
		//重定向到输出端
		System.setOut(ps);
		System.out.println("change");
		
		//重定向会控制台
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out))));
		System.out.println("back");
		
		
		
		
		//printWtiter
		//输出到控制台
		PrintWriter pw = new PrintWriter(new BufferedOutputStream(new FileOutputStream("print.txt")));
		pw.println("打印流");
		pw.println(true);
		pw.close();
		
	}

}
