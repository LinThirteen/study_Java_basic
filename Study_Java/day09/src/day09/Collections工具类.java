package day09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collections工具类 {
	
	public static void main(String[] args) {
		
//		Collections是工具类          Collection是接口
		
//		类 java.util.Collections 提供了对Set、List、Map进行排序、填充、查找元素的辅助方法。
//
//	      1. void sort(List) //对List容器内的元素排序，排序的规则是按照升序进行排序。
//
//	      2. void shuffle(List) //对List容器内的元素进行随机排列。
//
//	      3. void reverse(List) //对List容器内的元素进行逆续排列 。
//
//	      4. void fill(List, Object) //用一个特定的对象重写整个List容器。
//
//	      5. int binarySearch(List, Object)//对于顺序的List容器，采用折半查找的方法查找特定对象。
		
		
		List<String> list = new ArrayList<>();
		list.add("我是1");
		list.add("我是2");
		list.add("我是3");
		list.add("我是4");
	
		Collections.shuffle(list); //随机排序
		System.out.println(list);
		
		
		Collections.reverse(list); //逆序排列
		System.out.println(list);
		
		
		Collections.sort(list); //正常排序，按照递增排序，如果自定义类就用comparable接口
		System.out.println(list);
		
		
		 //查找元素，按二分查找法，返回索引
		System.out.println(Collections.binarySearch(list,"我是4"));
	}

}
