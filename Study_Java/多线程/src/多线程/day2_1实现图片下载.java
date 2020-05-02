package 多线程;

//方法一
//public class day2_1实现图片下载 extends Thread {

//方法er
public class day2_1实现图片下载 extends Thread {
	
	private String url;
	private String name;
	
	public day2_1实现图片下载(String url, String name) {
		super();
		this.url = url;
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		day2多线程下载图片 wb = new day2多线程下载图片();
		wb.download(url, name);
	}
	private void mian() {
		// TODO Auto-generated method stub
		
		day2_1实现图片下载 td1 = new day2_1实现图片下载("","");
		day2_1实现图片下载 td2 = new day2_1实现图片下载("","");
		day2_1实现图片下载 td3 = new day2_1实现图片下载("","");
		day2_1实现图片下载 td4 = new day2_1实现图片下载("","");
		day2_1实现图片下载 td5 = new day2_1实现图片下载("","");
		
		//方法一
//		td1.start();
//		td2.start();
//		td3.start();
//		td4.start();
//		td5.start();
		
		//方法二
		new Thread(td1).start();
		new Thread(td2).start();
		new Thread(td3).start();
		new Thread(td4).start();
		new Thread(td5).start();
		
	}
	
}
