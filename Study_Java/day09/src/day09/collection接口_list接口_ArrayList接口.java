package day09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class collection接口_list接口_ArrayList接口 {
	public static void main(String[] args) {
		
		//测试Collection接口中的方法
		
		
		//其中ArrayList实现了List接口，而List接口又继承了Collection
		Collection<String> c = new ArrayList<>(); //ArrayList<>里面的String可写可不写
		
		System.out.println(c.size());//里面没有东西为0
		System.out.println(c.isEmpty()); //里面没有对象为true
		
		//add（）方法
		c.add("高老大");  //存储对象的引用地址
		c.add("高老er");//存储对象的引用地址
		c.add("高老san");//存储对象的引用地址
		
		//默认调用同toString方法
		System.out.println(c);
		System.out.println(c.getClass().getName());//java.util.ArrayList
		System.out.println(c.size());
		
		
		
		//转换成object数组
		Object[] objes = c.toArray();
		System.out.println(objes);
		System.out.println(Arrays.toString(objes));
		
		
		//contains，查看是否包含对象
		System.out.println(c.contains("高老大"));//true
		
		
//		//remove(),表示移除，并不是删除，只是删除对象的应用地址，对象还在
//		c.remove("高老大");//存储对象的引用地址
//		c.remove("高老er");//存储对象的引用地址
//		System.out.println(c);
//		System.out.println(c.getClass().getName());//java.util.ArrayList
//		System.out.println(c.size());
//		
		
		
//		//remove()移除所有的元素
//		c.clear();
//		System.out.println(c.size());
		
		
		
		
		
		
		
	}
}
