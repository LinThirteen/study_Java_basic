package day09;

import java.util.HashMap;

public class 手工实现hashset {
	HashMap map;
	private static final Object PRESENT = new Object();
	
	public 手工实现hashset() { //实例化对象时候执行，相等于init方法
		map = new HashMap();
		
	}
	
	public int size() {
		return map.size();
	}
	
	public void add(Object o) {
		map.put(o, PRESENT);
	}
	
	//重写tostring
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("[");
		for(Object key:map.keySet()) {
			sb.append(key+",");
			
		}
		System.out.println(sb.length());
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		手工实现hashset set = new 手工实现hashset();	
		set.add("aaa");
		set.add("abs");
		set.add("abdd");
		System.out.println(set);
	}

}
