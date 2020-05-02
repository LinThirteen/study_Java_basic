package day09;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
	public static void main(String[] args) {
		
//	    Map就是用来存储“键(key)-值(value) 对”的。 Map类中存储的“键值对”通过键来标识，所以“键对象”不能重复。
		
		Map <Integer,String> m1 = new HashMap<>();
		
		m1.put(1,"one");
		m1.put(2,"Two");
		m1.put(3,"there");
		m1.put(4,"four");
		m1.put(5,"fire");
		
		
//		System.out.println(m1.get(1));	
//		System.out.println(m1.size());//查看大小
//		System.out.println(m1.isEmpty());//判断是否为空
//		System.out.println(m1.containsKey(2)); //是否包含
//		System.out.println(m1.containsValue("fire"));
		System.out.println(m1);
//		
//		
//		Map <Integer,String> m2= new HashMap<>();
//		
//		m1.put(1,"10");
//		m1.put(2,"20");
//		m1.put(3,"30");
//		m1.put(4,"40");
//		m1.put(5,"50");
//		
//		
//		m1.putAll(m2);//没则增加，有则覆盖，根据equals判断	
//		System.out.println(m1);
	}

}
