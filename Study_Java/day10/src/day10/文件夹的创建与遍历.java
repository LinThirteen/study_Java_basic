package day10;

import java.io.File;

public class 文件夹的创建与遍历 {
	
	
	private static long len=0; //统计文件大小
	
	public static void main(String[] args) {
		
		//mkdir  保证上一级的目录存在
		//mkdirs   上一级目录不存在则创建父目录
		//list()    下级名称
		//listFiles()   下一级File
		//listRoots()   跟路径
		
		
//		File dir = new File("D:/eclipse/Study_Java/day10");
		//创建目录
//		boolean flag = dir.mkdir();
//		System.out.println(flag);  //flag
		
//		boolean flag = dir.mkdirs();
//		System.out.println(flag);  //true
		
		
		
		//列出下一级名称
//		String[] subsNames = dir.list();
//		for(String s :subsNames) {
//			System.out.println(s);
//		}
//		
//		
//		
//		//下一级对象 listFiles()
//		File[] subFiles = dir.listFiles();
//		for(File s:subFiles) {
//			System.out.println(s.getAbsolutePath());
//		}
//		
		
		
		//列出所有的盘符：listRoots
//		File[] roots = dir.listRoots();
//		for(File r:roots) {
//			System.out.println(r.getAbsolutePath());
//		}
		
		
		
		File dirs = new File("D:/eclipse/");
		
//		printName(dirs,0);
		
		
		
		//统计文件夹的大小
		count(dirs);
		System.out.println(len);
		
		
		
	}
	
	
	public static void printName(File dirs,int deep) {
		
		
		System.out.println(dirs.getAbsolutePath());
		
		//控制层次感
		for(int i=0;i<deep;i++) {
			System.out.print("-");
		}
		
		
		if(null == dirs||!dirs.exists()) {
			
		}else if(dirs.isDirectory()) {
			for(File s :dirs.listFiles()) {
				printName(s,deep+1);
			}
		}
		
		
		
		
		
		
	}
	
	
	
	public static void count(File dirs) {
			
//		System.out.println(dirs.getAbsolutePath());		
		
		if(null != dirs&&dirs.exists()) {
			
		if(dirs.isFile()) {
			//大小
			len +=dirs.length();
					
		}else {	
			for(File s:dirs.listFiles()) {
				count(s);
			}	
		}
		}
		
		
		
		
		
		
	}
	
	
	
}
