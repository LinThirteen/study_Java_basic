package day09;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class treeSet接口 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//测试treeSet的还有
		
		Set<Integer> set = new TreeSet<>();
		set.add(300);
		set.add(200);
		set.add(600);
		
		//按照元素递增的方式排序
		for(Integer m:set) {
			System.out.println(m);
		}
		
		
		
		Set<Emps> set2 = new TreeSet<>();
		
		//因为不是静态的类，所以要加new
		set2.add(new Emps(100,"张三",50000));
		set2.add(new Emps(200,"张四",55000));
		set2.add(new Emps(300,"张五",600));
		set2.add(new Emps(250,"张六",600));
		//工资从小到大排序
//		System.out.println(treemap2);
		for(Emps m :set2) {
			System.out.println(m);
		}
		
	}

}


class Emps implements Comparable<Emps>{
	int id;
	String name;
	double salary;
	
	public Emps(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	 
	public String toString() {
		return "id:"+id+",name:"+name+",salary:"+salary;
	}
	

	@Override
	public int compareTo(Emps o) {  //内置接口， 负数：小于      0：等于              正数：大于
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

