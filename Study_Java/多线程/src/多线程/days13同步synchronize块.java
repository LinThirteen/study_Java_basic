package 多线程;

import java.util.ArrayList;
import java.util.List;

public class days13同步synchronize块 {

	public static void main(String[] args) throws InterruptedException {
//        Accounts a1 = new Accounts(100, "高");
//        Drawings draw1 = new Drawings(80, a1,"one");
//        Drawings draw2 = new Drawings(80, a1,"two");
//        draw1.start(); // 你取钱
//        draw2.start(); // 你取钱
        
        
		List<String> list = new ArrayList<String>();
		
		for(int i=0;i<10000;i++) {
			new Thread(()->{
				synchronized (list) {
				list.add(Thread.currentThread().getName());			
				}
		}).start();
			
		
		}
		Thread.sleep(2000);
		System.out.println(list.size());
    }
}
/*
 * 简单表示银行账户
 */
class Accounts {
    int money;
    String aname;
    public Accounts(int money, String aname) {
        super();
        this.money = money;
        this.aname = aname;
    }
}
/**
 * 模拟提款操作
 * 
 * @author Administrator
 *
 */
class Drawings extends Thread {
    int drawingNum; // 取多少钱
    Accounts account; // 要取钱的账户
    int expenseTotal; // 总共取的钱数
 
    public Drawings(int drawingNum, Accounts account,String name) {
        super(name);
        this.drawingNum = drawingNum;
        this.account = account;
    }
 
    @Override
    public void run() {
        draw();
    }
 
    void draw() {
    	
    	
    	//提高性能
    	if(account.money<=0) {
    		return;
    	}
    	
    	
        synchronized (account) { //一定要判断好到底锁哪个资源
            if (account.money - drawingNum < 0) {
                System.out.println(this.getName() + "取款，余额不足！");
                return;
            }
            try {
                Thread.sleep(1000); // 判断完后阻塞。其他线程开始运行。
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.money -= drawingNum;
            expenseTotal += drawingNum;
        }
        System.out.println(this.getName() + "--账户余额：" + account.money);
        System.out.println(this.getName() + "--总共取了：" + expenseTotal);
    }
}
