package day10;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class day9字节数组输入流ByteArrayInputStream {
	public static void main(String[] args) {
		
		//ByteArrayInputStream(); jvm的缓冲容器
	
		//创建源
		byte[] src = "talk is cheap show me the code".getBytes();
		
		
		//选择流
		InputStream is = null;
			
			
		//操作读取
		try {
			is = new ByteArrayInputStream(src); //将字节数组放到缓冲区，在从缓冲区读取字节数组
			
			//分段读取，每次读5个字节
			byte[] flush = new byte[5];//缓冲容器
			int len = -1;
			while((len=is.read(flush))!=-1) {//每3个读取一次
				//字节数组----->字符串(解码)
				String str = new String(flush,0,len);
				System.out.println(str);
			}
			
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(null!=is) {
				//如果is里面有才通知关闭
				is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
		
	

	}

