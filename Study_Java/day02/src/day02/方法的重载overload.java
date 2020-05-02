package day02;

public class 方法的重载overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 重载的方法，实际是完全不同的方法，只是名称相同而已!

//		构成方法重载的条件：
//
//	      1.不同的含义：形参类型、形参个数、形参顺序不同
//
//	      2.只有返回值不同不构成方法的重载

		System.out.println(add(3, 5));// 8
		System.out.println(add(3, 5, 10));// 18
		System.out.println(add(3.0, 5));// 8.0
		System.out.println(add(3, 5.0));// 8.0

		// 我们已经见过的方法的重载
		System.out.println();// 0个参数
		System.out.println(1);// 参数是1个int
		System.out.println(3.0);// 参数是1个double

	}

	public static int add(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

	// 方法名相同，参数个数不同，构成重载
	public static int add(int n1, int n2, int n3) {
		int sum = n1 + n2 + n3;
		return sum;
	}

	public static double add(double n1, int n2) {
		double sum = n1 + n2;
		return sum;
	}

	// 方法名相同，参数顺序不同，构成重载
	public static double add(int n1, double n2) {
		double sum = n1 + n2;
		return sum;
	}

}