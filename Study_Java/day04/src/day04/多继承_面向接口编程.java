package day04;

public interface 多继承_面向接口编程 {
	
//	接口就是比“抽象类”还“抽象”的“抽象类”，可以更加规范的对子类进行约束。
//	全面地专业地实现了：规范和具体实现的分离。
	
	
	
//	  抽象类还提供某些具体实现，了一批类具有的公共方法规范。
//	 接口不提供任何实现，接口中所有方法都是抽象方法。
//	  接口是完全面向规范的，规定
	
	
	int MAX_Age = 100;  //默认public static final 修饰
		
	
	void test01(); //默认public abstract
	
	void test02();

	
}


class Myclass implements 多继承_面向接口编程{

	@Override
	public void test01() {
		// TODO Auto-generated method stub
		System.out.println(MAX_Age);
		System.out.println("嘻嘻嘻");
		
	}

	@Override
	public void test02() {
		// TODO Auto-generated method stub
		System.out.println("我是test02");
	}
	
}


//定义接口的详细说明：
//
//1. 访问修饰符：只能是public或默认。
//
//2. 接口名：和类名采用相同命名机制。
//
//3. extends：接口可以多继承。
//
//4. 常量：接口中的属性只能是常量，总是：public static final 修饰。不写也是。

//5. 方法：接口中的方法只能是：public abstract。 省略的话，也是public abstract。


//声明格式
//[访问修饰符]  interface 接口名   [extends  父接口1，父接口2…]  {
//常量定义；  
//方法定义；
//}


























