package 高级主题;

import java.util.concurrent.atomic.AtomicInteger;

//悲观锁：synchronized是独占锁即被悲观锁，或导致其他所有需要锁的线程挂起，等待持有的线程释放锁
//乐观锁：每次不加锁而是假设没有冲突而去完成某项操作，如果因为冲突失败就重试，知道成功为止




public class day3CAS {  //比较并交换，是乐观锁的一种实现
	
	//内存值V与原值A做比较，要是相等就修改为要修改的值B并返回true,否则什么都有不做，并返回false;
	
	//库存
	private static AtomicInteger stock = new AtomicInteger(5);
	
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			new Thread(()-> {
				try {
					//模拟网络延时
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Integer left = stock.decrementAndGet();
				if(left <1) {
					System.out.println("抢完啦");
					return;
				}
									
			System.out.println(Thread.currentThread().getName()+"抢了一件商品");
			System.out.println("还剩"+left);
			}).start();
		}
		
	}
}
