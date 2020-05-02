package day10;

import java.io.File;

public class 构造器 {
	
	
	public static void main(String[] args) {
		
		
		String path = "D:/eclipse/Study_Java/day10/12458.png" ;
		
		//使用构建器，构造File对象
		File src = new File(path);
		System.out.println(src.length());
		
		
		
		//2.构造File对象,会自动加 /
		src = new File("D:/eclipse/Study_Java/day10","12458.png");
		System.out.println(src.length());
		
		
		
		//3.构建file对象
		src = new File(new File("D:/eclipse/Study_Java/day10"),"12458.png");
		System.out.println(src.length());
		
		
		src = new File("12458.png");
		System.out.println(src.getAbsolutePath());   //打印绝对路径
		
		
		
		//相对项目
		System.out.println(System.getProperty("user.dir"));
		
		
		
		//构建一个不存在的路径
		src = new File("02.jpg");
		System.out.println(src.getAbsolutePath()); //D:\eclipse\Study_Java\day10\02.jpg
		System.out.println(src.length());//0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
