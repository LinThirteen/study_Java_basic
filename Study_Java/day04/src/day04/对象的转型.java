package day04;

public class 对象的转型 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals a = new Animals();
		animalCry(a);

		Animals d = new Dogs();   //自动向上转型，编译器会认为d几时,运行时jvm才会认为是dog
		animalCry(d); 
		animalCry(new Cats()); 
//		d.seeDoor();  //编译器只会去animal里面查看是否有该方法
		
		
		Dogs d2 = (Dogs)d; //强制向下转型
		d2.seeDoor();

	}

	static void animalCry(Animals a) { 
		a.shout();
	}

}

class Animals {
	public void shout() {
		System.out.println("叫了一声！");
	}
}

class Dogs extends Animals { 
	public void shout() { 
		System.out.println("wangwang");
	}
	
	public void seeDoor() {
		System.out.println("开门");
	}
}

class Cats extends Animals { 
	public void shout() {
		System.out.println("maomao");
	}
}
