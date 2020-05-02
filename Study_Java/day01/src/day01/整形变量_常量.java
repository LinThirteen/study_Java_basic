package day01;

public class 整形变量_常量 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =15;
		int b =015;  //以0开头是八进制 
		System.out.println(b);  //13   每八进一。相当于8+5=13
		
		int c = 0x15;  //以0x开头是16进制
		System.out.println(c); //21  16+5
		
		int d = 0x25;  //以0x开头是16进制
		System.out.println(d); //37    32+5
		
		int g = 0x100;  //以0x开头是16进制
		System.out.println(g); //256
		
		int h = 0b1101;  //以0b开头是二进制
		System.out.println(h); //8+4+1
	}

}
