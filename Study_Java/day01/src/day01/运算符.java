package day01;

public class 运算符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	long g = 5;
	int c = 5;
	
	
	float y = g+c;
//	float h = g+6.2;  //报错
	double h = g+6.2; //不报错
		

	int a = 3;
	int b = a++;   //执行完后,b=3。先给b赋值，再自增。
	System.out.println("a="+a+"\nb="+b);
	a = 3;
	b = ++a;   //执行完后,b=4。a先自增，再给b赋值
	System.out.println("a="+a+"\nb="+b);
	
		}
	
	//逻辑运算符
//	逻辑与	&( 与)	两个操作数为true，结果才是true，否则是false
//	逻辑或	|(或)	两个操作数有一个是true，结果就是true
//	短路与	&&( 与)	只要有一个为false，则直接返回false
//	短路或	||(或)	只要有一个为true， 则直接返回true
//	逻辑非	!（非）	取反：!false为true，!true为false
//	逻辑异或	^（异或）	相同为false，不同为true
	
	
//	//1>2的结果为false，那么整个表达式的结果即为false，将不再计算2>(3/0)
//	boolean c = 1>2 && 2>(3/0);
//	System.out.println(c);
//	//1>2的结果为false，那么整个表达式的结果即为false，还要计算2>(3/0)，0不能做除数，//会输出异常信息
//	boolean d = 1>2 & 2>(3/0);
//	System.out.println(d);
	

}
