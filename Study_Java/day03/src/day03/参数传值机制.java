package day03;

public class 参数传值机制 {
	int id;
	String name;
	String pad;
	
	public 参数传值机制(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void testParameterTransfer01(参数传值机制 u) {
		u.name = "高小八";
	}
	
	public void testParameterTransfer02(参数传值机制 u) {
		u = new 参数传值机制(200, "高三");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Java中，方法中所有参数都是“值传递”，也就是“传递的是值的副本”。
		
		参数传值机制 u1 = new 参数传值机制(100, "高小七");
		
		
		//值传递
		//重点：其中u是u1的拷贝，但是他们指向同一个地址，所以但u.name去改变的话，u1里面的name也会改变
		//当方法执行完后u也就消失了
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		
		
		//其中u是u1的拷贝，但是在方法里面 u= new ...,表示新建了一个对象，u重新指向了新的地址不在和u1指向同一个地址
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);

	}

}
