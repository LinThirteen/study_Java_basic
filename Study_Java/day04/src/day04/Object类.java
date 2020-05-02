package day04;

public class Object类 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object类  to = new Object类();
		System.out.println(to.toString());//day04.Object类@15db9742
			
		Person2 p2 = new Person2("嘻嘻",6);
		System.out.println(p2.toString());
	}
	//重写tostring方法
	public String toString(){
		return "测试对象";
	}

}


class Person2{
	String name;
	int age;
	
	@Override   //可写可不写
	public String toString(){
		return name+",年龄:"+age;
	}
	
	public Person2(String name,int age) {
		this.name = name;
		this.age = age;
	}
}