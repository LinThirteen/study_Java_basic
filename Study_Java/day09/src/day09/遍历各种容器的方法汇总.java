package day09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class 遍历各种容器的方法汇总 {
	
public static void main(String[] args) {
	
	List<String> list01 = new ArrayList<>(); //其中list可以切换Collection
	list01.add("aa");
	list01.add("bb");
	list01.add("cc");
	System.out.println(list01);//[aa, bb, cc]
	
	
	//list方法
	//方法一
//	for(int i=0;i<list01.size();i++){//list为集合的对象名
//    String temp = (String)list01.get(i);
//    System.out.println(temp);
//    
//	}
//    
	
	
	
	
//    //方法二
//    for (String temp1 : list01) {
//    	System.out.println(temp1);
//    	}
    
	
	
	
    
    // 方法三：使用Iterator迭代器(1)
//    for(Iterator<String> iter= list01.iterator();iter.hasNext();){
//        String temp = (String)iter.next();
//        System.out.println(temp);
//    }
    
	
	
	
    
	
//		List方法四：使用Iterator迭代器(2)
	
//	Iterator<String>  iter =list01.iterator();
//	while(iter.hasNext()){
//	    Object  obj =  iter.next();
//	    iter.remove();//如果要遍历时，删除集合中的元素，建议使用这种方式！
//	    System.out.println(obj);
//	}
	
	
	
	
	
	//set方法
	
	
//	Set<String> set = new HashSet<>();
//	set.add("aaa");
//	set.add("bbb");
//	set.add("aaa"); //重复了，不会显示
//	System.out.println(set);  //[aaa, bbb]
//	set1.remove("bbb");
//	System.out.println(set1);
//	
//	
//	
//	//	方法一
//	for(String temp:set){
//		System.out.println(temp);
//		}
//
//	
//	
////		方法二：使用Iterator迭代器
//	for(Iterator<String> iter = set.iterator();iter.hasNext();){
//	    String temp = (String)iter.next();
//	    System.out.println(temp);
//	}
//	
	
	
	
		
	
	//	Map
	Map <Integer,String> map = new HashMap<>();
	
	map.put(1,"one");
	map.put(2,"Two");
	map.put(3,"there");
	map.put(4,"four");
	map.put(5,"fire");
//	System.out.println(map);//{1=one, 2=Two, 3=there, 4=four, 5=fire}
	
	
	
//	遍历Map方法一：根据key获取value
//	Set<Integer>  keySet =  map.keySet();
//	for(Integer id : keySet){
//	System.out.println(map.get(id));
//	}
//	
	
	
	
//	遍历Map方法二：使用entrySet
	Set<Entry<Integer, String>>  ss = map.entrySet();
	System.out.println(map.entrySet());//[1=one, 2=Two, 3=there, 4=four, 5=fire]
	for (Iterator iterator = ss.iterator(); iterator.hasNext();) {
	    Entry e = (Entry) iterator.next(); 
	    System.out.println(e.getKey()+"--"+e.getValue());

	
	
	}
	
}
	


}
