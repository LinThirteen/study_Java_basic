package day04;

public class 匿名内部类 {
	
	public static void test01(AA a){
		
		a.aa();
		
	}
	
	public static void main(String[] args) {
		//第一种方法
//		Bs b = new Bs();
//		匿名内部类.test01(b);
		
		
		//匿名内部类
		匿名内部类.test01(new AA() {
			
			public void aa() {
				System.out.println("匿名内部类！");
			}
		});
	}

}

class Bs implements AA{

	@Override
	public void aa() {
		// TODO Auto-generated method stub
		System.out.println("哈哈哈");
	}
	
}

interface AA{
	
	
	void aa();
	
}




