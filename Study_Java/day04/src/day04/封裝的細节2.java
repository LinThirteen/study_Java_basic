package day04;

public class 封裝的細节2 {

//	类的属性的处理:
//
//	      1. 一般使用private访问权限。
//
//	      2.  提供相应的get/set方法来访问相关属性，这些方法通常是public修饰的，以提供对属性的赋值与读取操作(注意：boolean变量的get方法是is开头!)。
//
//	      3. 一些只用于本类的辅助性方法可以用private修饰，希望其他类调用的方法用public修饰。

//		碰到属性就马上私有

	private int id;
	private String name;
	private int age;
	private boolean man;

	public void setName(String name) {
		// 当外部要访问name就调用setName
		this.name = name;

	}
	
	public String getName(){
		return this.name;

	}

	public void setAge(int age) {
		// 当外部要访问setAge就调用setAge
		if (age >= 1 && age <= 130) {
			this.age = age;

		} else {

			System.out.println("请输入正确的年龄");
		}
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isMan() {  //boolean值则is
		return man;
	}

	public void setMan(boolean man) {
		this.man = man;
	}

	public int getAge(){
		return this.age;

	}

}
