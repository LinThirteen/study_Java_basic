package day02;

public class 方法_静态方法 {
	
	
	//无返回值
	void ptintSxt() {
		System.out.println("哈哈哈");
	}
	
	void add(int a,int b) {
		
		System.out.println(a+b);
	}
	
	
	
//	有返回值
	int Aadd(int c, int d) {
		int sum = c+d;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		3. 返回值：方法在执行完毕后返还给调用它的环境的数据。
//
//	      4. 返回值类型：事先约定的返回值的数据类型，如无返回值，必须显示指定为为void。

		
		//通过对象调用普通方法
		方法_静态方法 tm = new 方法_静态方法();
		tm.ptintSxt();		
		tm.add(5, 6);
	
		
		//有返回值必须要用变量去接受
		int sum = tm.Aadd(8, 8);
		
		
		
		
	}

}
