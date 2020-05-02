package day04;

public class 继承 {
	
	//java中只有单继承
//	crtl+t 可以查看类型层次
	//同一个包写不可以有相同的类名

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("高琪",172,"java");
	
		s.rest();
		s.study();
	}
}

class Persong{
	String name;
	int height;
	public void rest() {
		System.out.println("哈哈哈");
		
	}
}

class Student extends Persong{
	String major;
	public void study() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(major);
		System.out.println("学习了！");
		
	}
	public Student(String name,int height,String major) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
}
