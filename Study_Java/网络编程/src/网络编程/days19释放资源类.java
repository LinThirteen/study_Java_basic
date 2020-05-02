package 网络编程;

import java.io.Closeable;

public class days19释放资源类 {
	
	//释放资源
	//IO 和 Scoket类都实现了Closeable接口
	public static void close(Closeable...targets) {
		
		for(Closeable target:targets) {
			try {
				if(null!=target) {
					target.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
