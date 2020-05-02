package day01;

public class 变量本质 {
	
	int a;  //成员变量，属于类对象，会被自动初始化 a=0
	
//	public void test() {
//		   int i;
//		   int j = i+5 ; // 编译出错，变量i还未被初始化 
//		} 
		  
//		public void test() {
//		   int i;
//		   i=10;
//		   int j = i+5 ; // 编译正确
//		}
//	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 变量本质上就是代表一个“可操作的存储空间”，
		 * 空间位置是确定的但是里面放置什么值不确定。
		 * 我们可通过变量名来访问“对应的存储空间”，
		 * 从而操纵这个“存储空间”里面存储的值
		 */
		
		
//		数据类型  变量名  [=初始值] [,变量名  [=初始值]…];
		double  salary;     //8个字节大小
		long  earthPopulation;  //8个字节大小
		int  age = 5;   //4个字节大小 int a = 4 表示a变量的空间大小为4个字节
		
		salary = 2.53;  //初始化，一定要加“;”
		
		System.out.println(salary);
		
		
		
		
		
		  boolean flag = true;  // 声明boolean型变量并赋值
	       char c1, c2;   // 声明char型变量
	       c1 = '\u0041';   // 为char型变量赋值
	      c2 = 'B';   // 为char型变量赋值
	      int x;   // 声明int型变量
	      x = 9;  //为int型变量赋值  
	       int y = x;  // 声明并初始化int型变量
	       float f = 3.15f;   // 声明float型变量并赋值
	      double d = 3.1415926;  //声明double型变量并赋值
	      

		
	}

}
