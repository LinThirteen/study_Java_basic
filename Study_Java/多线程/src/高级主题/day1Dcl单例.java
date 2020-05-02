package 高级主题;

//Dcl单例模式：懒汉式套路基础上加入并发控制，保证在多线程环境下，对外存在一个对象


//1.构造器私有化-->避免外部new构造器
//2.提供私有的静态属性 --->存储对象的地址
//3.提供公共的静态方法 -->获取属性

public class day1Dcl单例 {
	//2.提供私有的静态属性 --->存储对象的地址
	//加volatile避免指令重排，如果没有volatile其他线程可能会访问到一个没有初始化的对象
	private static volatile day1Dcl单例 instance;
	
	
	
	//1.构造器私有化-->避免外部new构造器
	private day1Dcl单例(){
		
	}
	
	//3.提供公共的静态方法 -->获取属性
	public static day1Dcl单例 getInstance() {
		//检测是否已经存在对象，避免不必要的同步
		if(null!=instance) {
			
			return instance;
		}
		synchronized (day1Dcl单例.class) {
				
		if(null == instance) {
			//指令重排可能会发生在这里，因为初始化对象比较消耗时间，所以会先返回一个对象的地址给外部，那么外部就会得到一个空对象
			//因为在new一个对象时候会做三件事情，1.开辟空间，2.初始化对象信息。3.返回对象的地址给引用
			instance = new day1Dcl单例();
		}}
		return instance;
	}
	
	public static void main(String[] args) {
		new Thread(()-> {
		System.out.println(day1Dcl单例.getInstance());
				
	}).start();
	
	System.out.println(day1Dcl单例.getInstance());
	day1Dcl单例 s = new day1Dcl单例();
	System.out.println(s.getInstance());
}
}




