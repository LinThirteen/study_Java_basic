package 多线程;

//并发是保证数据的准确性，同时保证效率要高

public class days13同步synchronize2银行账户 {

	public static void main(String[] args) throws InterruptedException {
		Account account = new Account(100, "结婚礼金");
		Drawing you = new Drawing(account,80,"可悲的你");
		Thread.sleep(1500);
		Drawing her = new Drawing(account,90,"happy的他");
		you.start();
		her.start();
	}
}


class Drawing extends Thread{
	
	Account account;  //取钱的账户
	int drawingMoney;  //取得钱数
	int packetTotal; //口袋的总数
	public Drawing(Account account, int drawingMoney,String name) {
		super(name);//线程名字
		this.account = account;
		this.drawingMoney = drawingMoney;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
	test();
}
	public synchronized void test() {  //锁的资源不对,这里不应该锁this的资源，而应该锁Account的资源
		if(account.money-drawingMoney<0) {
			return;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		account.money -=drawingMoney;
		packetTotal +=drawingMoney;
		System.out.println(this.getName()+"---->账户余额为:"+account.money);
		System.out.println(this.getName()+"---->口袋余额为:"+packetTotal);

	
	}
}

class Account{
	int money;
	String name;
	public Account(int money, String name) {
		super();
		this.money = money;
		this.name = name;
	}
	
}