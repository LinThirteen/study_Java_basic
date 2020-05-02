package day04;




public class 测试静态内部类 {
	
//	适合那种只需要使用一次的类。比如：键盘监听操作等等。
	
	public static void main(String[] args) {
		
		
		Outert.Inner2 inner = new Outert.Inner2();
		
		
	}

}

class Outert{
	
	
	static class Inner2{
		
	}
	
}