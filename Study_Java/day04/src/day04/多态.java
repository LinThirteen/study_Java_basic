package day04;

public class 多态 {

//	  多态的要点：//对象不同，调用方法会有不同的结果
//
//      1. 多态是方法的多态，不是属性的多态(多态与属性无关)。
//
//      2. 多态的存在要有3个必要条件：继承，方法重写，父类引用指向子类对象。
//
//      3. 父类引用指向子类对象后，用该父类引用调用子类重写的方法，此时多态就出现了。

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		animalCry(a);

		Dog d = new Dog();
		animalCry(d); // 输出：wangwang，多态的体现
		animalCry(new Cat()); // maomao
		animalCry(new Dog()); // wangwang
	}

	static void animalCry(Animal a) { // 父类的类型执行子类的对象
		a.shout();
	}

}

class Animal {
	public void shout() {
		System.out.println("叫了一声！");
	}
}

class Dog extends Animal { // 继承
	public void shout() { // 重写父类方法
		System.out.println("wangwang");
	}
}

class Cat extends Animal { // 继承
	public void shout() {// 重写父类方法
		System.out.println("maomao");
	}
}
