package day04;

public class 继承树追溯 {
	//如果是静态初始化块也一样，首先调用父类的静态初始化块，在调用子类的静态初始化块
	//super永远位于第一句
	
	 public static void main(String[] args) {
	        System.out.println("开始创建一个ChildClass对象......");
	        new ChildClass2();
	        
	        	//打印创建FatherClass
//	        		  创建ChildClass

	    }
	}
	class FatherClass2{
	    public FatherClass2() {
	        System.out.println("创建FatherClass");
	    }
	}
	
	
	class ChildClass2 extends FatherClass2{
		//new 时会自动调用方法重载函数
		//因为默认构造方法的第一句总是super(),写与不写都一样。
	    public ChildClass2() {
	    	super();  //默认先调用父类构造器
	        System.out.println("创建ChildClass");
	    }
	}
