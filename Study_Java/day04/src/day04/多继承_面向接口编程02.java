package day04;

public class 多继承_面向接口编程02 {
	public static void main(String[] args) {
		Volant volant = new Angel();
		volant.fly();
		
		System.out.println(Volant.FLY_HIGHT);

		Honest honest = new GoodMan();
		honest.helpOther();
		
	}
}

/** 飞行接口 */
interface Volant {
	int FLY_HIGHT = 100; // 总是：public static final类型的；

	void fly(); // 总是：public abstract void fly();
}

/** 善良接口 */
interface Honest {
	void helpOther();
}

/** Angle类实现飞行接口和善良接口 */
class Angel implements Volant, Honest {
	public void fly() {
		System.out.println("我是天使，飞起来啦！");
	}

	public void helpOther() {
		System.out.println("扶老奶奶过马路！");
	}
}

class GoodMan implements Honest, Volant {
	public void helpOther() {
		System.out.println("扶老奶奶过马路！");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println(FLY_HIGHT);
	}
}

class BirdMan implements Volant {
	public void fly() {
		System.out.println("我是鸟人，正在飞！");
	}
}