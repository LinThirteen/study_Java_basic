package day09;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class 表格数据存储_map和list结合存储整张表 {
	
	//ORM思想的简单实验：map表示一行数据，多行数据是多个map，将多个map放到list里面
	//对象的关系映射
	//每一行数据使用一个javabean对象存储，多行数据放到map/list
	//整个表格使用一个map/list
	
	
	
	
	public static void main(String[] args) {
		
//		Map<String,Object> row1 = new HashMap<>();
//		row1.put("ID",1001);
//		row1.put("姓名","张三");
//		row1.put("工资",20000);
//		row1.put("入职日期","2018-5.05");
//		
//		
//		
//		Map<String,Object> row2 = new HashMap<>();
//		row2.put("ID",1002);
//		row2.put("姓名","张四");
//		row2.put("工资",25000);
//		row2.put("入职日期","2019-5.15");
//		
//		
//		Map<String,Object> row3 = new HashMap<>();
//		row3.put("ID",1003);
//		row3.put("姓名","张五");
//		row3.put("工资",26000);
//		row3.put("入职日期","2019-4.01");
//		
//		List<Map<String,Object>> table1 =new ArrayList<>();
//		
//		table1.add(row1);
//		table1.add(row2);
//		table1.add(row3);
//		
//		for(Map<String,Object> row:table1) {
//			Set<String> keyset = row.keySet();
////			System.out.println(row.keySet()); //[姓名, 工资, ID, 入职日期]
//			for(String key : keyset) {
//				System.out.print(key+":"+row.get(key)+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		//2.0
		//4个javabean对象
		User user1 = new User(1001,"张三",2000,"2008-5-05");
		User user2 = new User(1002,"张四",3000,"2008-6-05");
		User user3 = new User(1003,"张五",4000,"2008-7-05");
		User user4 = new User(1004,"张六",5000,"2008-8-05");
		
		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		for(User u:list) {
			System.out.println(u);
		}
		
		//放到map里面
		Map<Integer,User> map = new HashMap<>();
		map.put(1001, user1);
		map.put(1002, user2);
		map.put(1003, user3);
		map.put(1004, user4);
		Set<Integer> keyset = map.keySet();	
		for(Integer key:keyset) {
			System.out.println(key+"====="+map.get(key));
		}
		
		
		
	}

}




//一个完整的javabean要有set和get方法以及一个无参的构造器！
class User{
	private int id;
	private String name;
	private double salary;
	private String hiredate;
	
	
	public User() {
		
	}
	
	
	public User(int id, String name, double salary, String hiredate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id:"+id+",name:"+name+",salary:"+salary+",hiredate"+hiredate;
	}
	
}



