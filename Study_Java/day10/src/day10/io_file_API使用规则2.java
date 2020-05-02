package day10;

import java.io.File;

public class io_file_API使用规则2 {
	public static void main(String[] args) {
		
		//基本信息
//		File src = new File("D:\\eclipse\\Study_Java\\day10\\12458.png");
		
//		System.out.println("名称:"+src.getName());//名称:12458.png
//		
//		System.out.println("名称:"+src.getPath()); //名称:D:\eclipse\Study_Java\day10\12458.png
//		
//		System.out.println("绝对路径："+src.getAbsolutePath()); //D:\eclipse\Study_Java\day10\12458.png
//	
//		System.out.println("父路径："+src.getParent());//父路径：D:\eclipse\Study_Java\day10
//	
//		System.out.println("父对象："+src.getParentFile().getName());
		
		
		
		//文件状态
		File src = new File("D:\\eclipse\\Study_Java\\day10\\12458.png");
		System.out.println("是否存在:"+src.exists());  //判断是否存在
		
		System.out.println("是否是文件:"+src.isFile()); //是否是文件
		
		System.out.println("是否是文件夹:"+src.isDirectory());  //是否是文件夹
		
		
		//文件状态
		src = new File("Xxx");
		if(!src.exists() || null==src) {
			System.out.println("文件不存在");
		}else {
			if(src.isFile()) {
				System.out.println("文件操作");
			}else {
				System.out.println("文件夹操作");
			}
		}
		
	}
	

}
