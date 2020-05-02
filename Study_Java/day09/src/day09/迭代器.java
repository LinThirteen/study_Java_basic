package day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class 迭代器 {
	
	
	
	//遍历列表
	public static void testIterator() {
		
//		List<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		list.add("add");
		list.add("lll");
		list.add("hhf");
		
		//使用iterator()迭代器
		for(Iterator<String> iter = list.iterator();iter.hasNext();) {       //方法返回一个迭代器
		
			String temp = iter.next();
			System.out.println(temp);
			
	}
	}
	
	
	//遍历集合
	public static void SetIterator() {
			
	//		List<String> list = new ArrayList<>();
			Set<String> set = new HashSet<>();
			
			 set.add("add");
			 set.add("lll");
			 set.add("hhf");
			
			//使用iterator()迭代器
			for(Iterator<String> iter = set.iterator();iter.hasNext();) {       //方法返回一个迭代器
			
				String temp = iter.next();
				System.out.println(temp);
				
		}
		}
	
	//遍历字典
	public static void MapIterator() {
		
		//		List<String> list = new ArrayList<>();
				Map<Integer,String> map = new HashMap<>();
				
				map.put(100,"add");
				map.put(200,"lll");
				map.put(300,"hhf");
				
				Set<Entry<Integer,String>> ss = map.entrySet();    //获得一个个键值对                   //map.entrySet()返回一个集合
				System.out.println(ss);  //[100=add, 200=lll, 300=hhf]
				//使用iterator()迭代器
				for(Iterator<Entry<Integer,String>> iter = ss.iterator();iter.hasNext();) {       //方法返回一个迭代器
				
					Entry<Integer,String> temp = iter.next();
					System.out.println(temp.getKey()+":"+temp.getValue());
					
			}
				
				
				
			//第二种遍历map的方式
				Set<Integer> keyset = map.keySet();  //获取所有的键值
				System.out.println(keyset);  //[100, 200, 300]
				for(Iterator<Integer> iter = keyset.iterator();iter.hasNext();) {       //方法返回一个迭代器
					
					Integer key = iter.next();
					System.out.println(key+"-----"+map.get(key));
					
			}
				
			}
	
	public static void main(String[] args) {
		testIterator();
		SetIterator();
		MapIterator();
	}

}


