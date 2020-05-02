package day09;

import java.util.ArrayList;
import java.util.List;

public class arraylist_索引和顺序相关方法 {
	
	public static void main(String[] args) {

		//list接口实现类有三个，Arratylist，linkedlist，vector
		
		
//		  ArrayList底层是用数组实现的存储。 特点：查询效率高，增删效率低，线程不安全。

//		LinkedList底层是一个列表，增删效率高，查询效率低
		
		//Vector底层是一个数组，负责线程安全的
		
		
		test();
	
}
	
	
	//测试索引相关的方法
	public static void test() {
		

//		System.out.println(in==s);
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		
		//在索引为2的地方加入一个数据
//		list.add(2,"高企");
//		System.out.println(list);
//		
		//2号位置内容删除
//		list.remove(2);
//		System.out.println(list);
		
//		//将2号位置的C替换成哈哈，
//		list.set(2, "haha"); //替换
//		
//		
//		//获取指定位置的数
		System.out.println(list.get(2) instanceof String);
//		
//		
//		//反回元素第一次出现的位置,当没找到就返回-1
//		System.out.println(list.indexOf("B"));
//		System.out.println(list.lastIndexOf("B"));//返回最后一个出现的位置
//	
	
	}
	
}