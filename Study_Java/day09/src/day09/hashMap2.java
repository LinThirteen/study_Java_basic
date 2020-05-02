package day09;

import java.util.HashMap;
import java.util.Map;

public class hashMap2 {
	
	public static void main(String[] args) {
		
		Employee e1 =new Employee(1001, "高企", 5000);
		Employee e2=new Employee(1001, "小二", 7000);
		Employee e3 =new Employee(1001, "小三", 9000);
		
		Map<Integer,Employee> map = new HashMap<>();
		
		map.put(101,e1);
		map.put(102,e2);
		map.put(103,e3);
		
		Employee emp = map.get(101);
		System.out.println(emp);
		
		System.out.println(map);
		
	}

}


//员工信息
class Employee{
	private int id;
	private String ename;
	private double salary;
	public Employee(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public String toString() {
		
		return "id:"+id+"name:"+ename+"薪水:"+salary;
		
	}
	
	
	
}