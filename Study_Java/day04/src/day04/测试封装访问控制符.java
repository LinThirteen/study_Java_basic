package day04;



public class 测试封装访问控制符 {
	
	//访问控制符
//    1. private 表示私有，只有自己类能访问
//
//  2. default表示没有修饰符修饰，只有同一个包的类能访问
//
//  3. protected表示可以被同一个包的类以及其他包中的子类访问
//
//  4. public表示可以被该项目的所有包中的所有类访问
	
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13; 不可以访问private 的age
		h.name = "kafka";
		
	}
}

class Human{  //加public后才可以被其他的package调用
	private int age;  //私有
	
	String name;  //默认同一个包可以使用，但是不同package不可以用
	
	
	
	public int sex;  //可以被外部包访问
	
	void sayAge() {
		System.out.println(age);
	}
}

class Boy extends Human{
	void sayHellow() {
//		System.out.println(age); 也不能使用age
	}
}
