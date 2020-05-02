package 多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//并发领域
public class day6Callable implements Callable<Boolean>{ //callable返回一个boolean
	private String url;
	private String name;
	
	public day6Callable(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	@Override
	public Boolean call() throws Exception {
		// TODO Auto-generated method stub
		day2多线程下载图片 wb = new day2多线程下载图片();
		wb.download(url, name);
		return true;
	}
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
	
		// TODO Auto-generated method stub
		
		day6Callable td1 = new day6Callable("","");
		day6Callable td2 = new day6Callable("","");
		day6Callable td3 = new day6Callable("","");
		day6Callable td4 = new day6Callable("","");
		day6Callable td5 = new day6Callable("","");
		
		//创建执行服务
		ExecutorService ser = Executors.newFixedThreadPool(5);
		
		//提交执行任务
		Future<Boolean> result1 = ser.submit(td1);
		Future<Boolean> result2 = ser.submit(td2);
		Future<Boolean> result3 = ser.submit(td3);
		Future<Boolean> result4 = ser.submit(td4);
		Future<Boolean> result5 = ser.submit(td5);
		
		//获取结果
		boolean r1 = result1.get();
		boolean r2 = result2.get();
		boolean r3 = result3.get();
		
		//关闭服务
		ser.shutdownNow();

}
}