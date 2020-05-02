package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class day5文件拷贝 {
	
	public static void main(String[] args) {

		// 创建源
		File src = new File("12458.png");
		File dest = new File("copy.png");

		
		// 选择流
		InputStream is = null;//提升作用域
		OutputStream os = null; 

		
		// 操作读取
		try {								
			is = new FileInputStream(src);
			os = new FileOutputStream(dest);
			
			
			//3.操作
			//分段读取，每次读3个
			byte[] flush = new byte[1024];//缓冲容器
			int len = -1;
			while((len=is.read(flush))!=-1) {
				//字节数组----->字符串(解码)
				String str = new String(flush,0,len);
				os.write(flush, 0, len);
			}
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//4. 释放资源 分别关闭，先打开后关闭
			try {
				if (null != os) {
					// 如果is里面有才通知关闭
					os.close();
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (null != os) {
					// 如果is里面有才通知关闭
					is.close();
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
