package day10;

import java.io.File;
import java.io.IOException;

public class io_file_API使用规则3 {
	public static void main(String[] args) throws IOException {
		
		File src = new File("D:/eclipse/Study_Java/day10/12458.png");
		
		
		//返回一个文件的长度，文件夹则为0
		System.out.println("长度"+src.length());
		
		
		//创建文件 createNewFile(),不存在则创建，存在则创建不成功
		File src1 = new File("D:/eclipse/Study_Java/day10/io.txt");
		boolean flag = src1.createNewFile();
		System.out.println(flag);
		
		flag = src1.delete(); //删除文件
		System.out.println(flag);
	}
}
