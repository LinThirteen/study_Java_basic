package day04;

public class 内部类 {
	
	public static void main(String[] args) {
		
		
//		创建内部类对象		
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
		
				
	}
			

}



//声明一个类
class Outer{
	private int age = 10;
	public void testOuter() {
		
	}
	
	
	//非静态内部类，目的是未来为外部类服务
	class Inner{
		int age = 30;
		//Outer.this是访问到外部类对象
		public void show() {
			
			int a = 5;
			System.out.println("外部类的成员变量age："+Outer.this.age);
			System.out.println("内部类的成员变量age："+this.age);
			System.out.println("局部变量age："+this.age);
			System.out.println(a);
		}
	}
	
	//静态内部类
	static class Inne{
		
		static int i = 5;
		public static void pri() {
			System.out.println(i);
		}
		
		
	}
	
}