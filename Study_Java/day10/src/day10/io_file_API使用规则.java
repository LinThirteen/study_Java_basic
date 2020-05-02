package day10;

import java.io.File;

public class io_file_API使用规则 {
	public static void main(String[] args) {
		
		
		//其中 \ 或 / 为名称分割符
		String path = "D:\\eclipse\\Study_Java\\day10\\12458.png" ;
		System.out.println(File.separatorChar);
		
		//路径写法建议
		//1. /
		path = "D:/eclipse/Study_Java/day10/12458.png" ;
		
		
		//2.常量拼接
		path = "D:" +File.separator + "java300" + File.separator + "IO.png" + File.separator;
		System.out.println(path);
	}

}
