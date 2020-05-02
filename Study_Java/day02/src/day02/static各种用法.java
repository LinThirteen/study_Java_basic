package day02;

public class static各种用法 {

//	static变量
//	按照是否静态的对类成员变量进行分类可分两种：一种是被static修饰的变量，叫静态变量或类变量；另一种是没有被static修饰的变量，叫实例变量。两者的区别是：
//	对于静态变量在内存中只有一个拷贝（节省内存），JVM只为静态分配一次内存，在加载类的过程中完成静态变量的内存分配，可用类名直接访问（方便），当然也可以通过对象来访问（但是这是不推荐的）。
//	对于实例变量，没创建一个实例，就会为实例变量分配一次内存，实例变量可以在内存中有多个拷贝，互不影响（灵活）。 

//	static方法
//	静态方法可以直接通过类名调用，任何的实例也都可以调用，因此静态方法中不能用this和super关键字，不能直接访问所属类的实例变量和实例方法(就是不带static的成员变量和成员成员方法)，
//	只能访问所属类的静态成员变量和成员方法。因为实例成员与特定的对象关联！这个需要去理解，想明白其中的道理，不是记忆！！！因为static方法独立于任何实例，因此static方法必须被实现，
//	而不能是抽象的abstract。 

	private static int a;
	private int b;
	static {
		static各种用法.a = 3;
		System.out.println(a);
		static各种用法 t = new static各种用法();
		t.f();
		t.b = 1000;
		System.out.println(t.b);
	}
	static {
		static各种用法.a = 4;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 如果调用的方法没有static修饰就需要通过new实例化区调用

		// 如果调用的方法有static修饰那么就可以直接调用不用new实例化
		System.out.println(add(3, 5));// 8
		System.out.println(add(3, 5, 10));// 18
		System.out.println(add(3.0, 5));// 8.0
		System.out.println(add(3, 5.0));// 8.0

	}

	static {
		static各种用法.a = 5;
		System.out.println(a);
	}

	public void f() {
		System.out.println("hhahhahah");
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
