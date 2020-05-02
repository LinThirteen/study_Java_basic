package day08;

public class 装箱_拆箱_缓存 {
	
	public static void main(String[] args) {
		
//		自动装箱：
//
//	      基本类型的数据处于需要对象的环境中时，会自动转为“对象”。
//		因此只需Integer i = 5这样的语句就能实现基本数据类型转换成包装类，这是因为JVM为我们执行了Integer i = Integer.valueOf(5)这样的操作
//	   ，这就是Java的自动装箱。
		
		
//		自动拆箱：
//		 每当需要一个值时，对象会自动转成基本数据类型，没必要再去显式调用intValue()、doubleValue()等转型方法。

//	      如 Integer i = 5;int j = i;  //这样的过程就是自动拆箱。
		
		//自动装箱
		Integer i = 100;//自动装箱
		//相当于编译器自动为您作以下的语法编译：
//		Integer i = Integer.valueOf(100);//调用的是valueOf(100)，而不是new Integer(100)
		 
		
//		自动拆箱

		Integer h = 100;
		int j = h;//自动拆箱
		//相当于编译器自动为您作以下的语法编译：
//		int j = i.intValue();
		
		
		
		//报错，为空指针
		  Integer t = null;
//	        int k = t;  //自动调用了t.intValue()
	        //修改
	        if(t!=null) {
	        	int k = t;
	        }
	        
	        
	        
	        //缓存（-128,127）之间的数字
	        Integer in1 = -128;  //Integer in1 = Integer.valueOf(-128);  两种写法一样
	        Integer in2 = -128;
	        System.out.println(in1 == in2);//true 因为123在缓存范围内
	        System.out.println(in1.equals(in2));//true
	        
	        
	        Integer in3 = 1234;
	        Integer in4 = 1234;
	        System.out.println(in3 == in4);//false 因为1234不在缓存范围内
	        System.out.println(in3.equals(in4));//true
	    	
	        
	        //获取包装类的类型
	        System.out.println(in3.getClass().getName());
	}
	
	

}
