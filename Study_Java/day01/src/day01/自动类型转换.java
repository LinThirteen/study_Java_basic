package day01;

public class 自动类型转换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		short  b = 12;  //合法
//		short  b = 1234567;//非法，1234567超出了short的表数范围
		
//		可以将整型常量直接赋值给byte、 short、 char等类型变量，而不需要进行强制类型转换，只要不超出其表数范围即可。
		
		int a =4;
		long b = a;
		double d =b;
//		a=b;    //不能转要比a的类型大才能赋值
		
//		float p = 3.14;  报错，因为小数默认为double类型
//		float p = 3.14F;  不报错,因为转换为浮点类型
		
		//特例
//		byte b2 = 123; 不报错 ，byte类型 -128 —————— +128
		
	}

}
