package day09;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap实现 {
	
	public static void main(String[] args) {
		
//		 TreeMap是红黑二叉树的典型实现
//		  TreeMap和HashMap实现了同样的接口Map，因此，用法对于调用者来说没有区别。
//		HashMap效率高于TreeMap;在需要排序的Map时才选用TreeMap。
		
		
		
		Map<Integer,String> treemap = new TreeMap<>();
		treemap.put(20, "aa");
		treemap.put(3, "bb");
		treemap.put(6, "cc");
		
		//按照key递增的方式排序
		for(Integer key:treemap.keySet()) {
			System.out.println(key+"-----"+treemap.get(key));
		}
		
		Map<Emp,String> treemap2 = new TreeMap<>();
		
		//因为不是静态的类，所以要加new
		treemap2.put(new Emp(100,"张三",50000), "哈哈哈1");
		treemap2.put(new Emp(200,"张四",55000), "哈哈哈2");
		treemap2.put(new Emp(300,"张五",600), "哈哈哈3");
		treemap2.put(new Emp(250,"张六",600), "哈哈哈4");
		//工资从小到大排序
		System.out.println(treemap2);
	}
   



}


class Emp implements Comparable<Emp>{
	int id;
	String name;
	double salary;
	
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString() {
		return "id:"+id+",name:"+name+",salary:"+salary;
	}
	

	@Override
	public int compareTo(Emp o) {  //内置接口， 负数：小于      0：等于              正数：大于
		// TODO Auto-generated method stub
		
		if(this.salary>o.salary) {
			return 1;
			
		}else if(this.salary<o.salary) {
			return -1;
			
		}else {
			//如果工资相等就判断id
			if(this.id>o.id) {
				return 1;
			}else if(this.id<o.id) {
				return -1;
			}else {
				return 0;
			}
		}
		
		
		
	
		
	}
}