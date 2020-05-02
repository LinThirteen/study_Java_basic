package day01;

public class 变量的分类 {
	
//	!!!
//	对于基本类型变量，是无法直接获得变量类型的;
//	对于包装类型变量，是可以直接获得的，变量名称.getClass().getName(); 
	
	
	int a;  //成员变量（实例变量），类内部，方法外部，属于对象，会被自动初始化 a=0
	
	static int size;  //静态变量（类变量），类内部，从属于类，类被加载，静态变量就有效

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		局部变量    local variable
//		成员变量   member variable   方法外部，类的内部定义的变量
//		静态变量  static variable 使用static定义。 从属于类，生命周期伴随类始终
		
		
		//语句块
		{
			int c = 5;  //局部变量，从属于语句块
			
			
		}
//	      System.out.println(c);  //不能打印
		
		
		
		
		
	}

}
