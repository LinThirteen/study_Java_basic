package WebSevers;

import java.lang.reflect.InvocationTargetException;

public class day01反射 {
	
	//反射：把java类中的各种结构（方法，属性，构造器，类名）映射成一个个的java的对象。
	//利用反射技术可以对一个类进行解剖，反射是框架设计的灵魂
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//三种方式
		//1.获取calss对象
		Iphone iphone = new Iphone();
		Class clz = new Iphone().getClass();
		
		//2.类.class
		clz = Iphone.class;
		
		//3.class.forName(包名.类名)
		clz = Class.forName("WebSevers.Iphone");//灵活，可以动态的传递
		
		
		
		//创建对象
//		Iphone iphone2 = (Iphone)clz.newInstance();
//		System.out.println(iphone2);
//		推荐：
		Iphone iphone2 = (Iphone)clz.getConstructor().newInstance();
		System.out.println(iphone2);
		
	}

}
class Iphone{
	public Iphone() {
		
	}
}