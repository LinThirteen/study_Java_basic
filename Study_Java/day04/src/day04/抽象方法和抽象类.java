package day04;

public abstract class 抽象方法和抽象类 { //包含抽象方法的类就是抽象类。
	
	
	//特点：第一，没有实现。    第二：子类必须实现重写
	//给子类提供统一的，规范的模板。子类必须实现
	abstract public void shout();  //抽象方法没有方法体
		
	public void run() {  //普通方法
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		包含抽象方法的类就是抽象类。通过abstract方法定义规范，
//		然后要求子类必须定义具体实现。
		
		
//		抽象类的使用要点:
//
//		     1. 有抽象方法的类只能定义成抽象类
//
//		     2. 抽象类不能实例化，即不能用new来实例化抽象类。
//
//		     3. 抽象类可以包含属性、方法、构造方法。但是构造方法不能用来new实例，只能用来被子类调
			
//			 4. 抽象类只能用来被继承。
//
//		     5. 抽象方法必须被子类实现。
		
	}

}

class Dogss extends 抽象方法和抽象类{

	@Override  //子类必须实现父类没有实现的抽象方法
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("哈哈哈");
		
	}
	
}