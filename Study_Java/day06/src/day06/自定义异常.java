package day06;

public class 自定义异常 {
	
	public static void main(String[] args) {
//		   2.自定义异常类只需从Exception类或者它的子类派生一个子类即可。
		
		Person p = new Person();
		p.setAge(-1);
		
	}

}

class Person{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			throw new IllegalAgeException("年龄不能为负数");
		}
		this.age = age;
	}
	
}


class IllegalAgeException extends RuntimeException{
	
	//构造器
	public IllegalAgeException() {
		
	}
	
	public IllegalAgeException(String msg) {
		super(msg);
	}
}
