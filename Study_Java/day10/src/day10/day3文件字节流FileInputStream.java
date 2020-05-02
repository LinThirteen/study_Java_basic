package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class day3文件字节流FileInputStream {
	public static void main(String[] args) {
		
	
	
		//创建源
		File stc = new File("abc.txt");
		
		
		//选择流
		InputStream is = null;
			
			
		//操作读取
		try {
			is = new FileInputStream(stc); 
			
			//分段读取，每次读3个
			byte[] flush = new byte[3];//缓冲容器
			int len = -1;
			while((len=is.read(flush))!=-1) {//每3个读取一次
				//字节数组----->字符串(解码)
				String str = new String(flush,0,len);
				System.out.println(str);
			}
			
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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

