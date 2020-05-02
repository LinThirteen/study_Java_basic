package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class day2IOFileInputStream {
	
//	FileInputStream():通过字节的方式读取文件，适合读取所有类型的文件（图像，视频等）全字符请考虑FileReader
	
	
	public static void main(String[] args)  {
		
		//1.创建源
		//2.选择流
		//3.操作
		//4.释放
		
		
		//创建源
		File stc = new File("abc.txt");
		
		
		//选择流
		InputStream is = null;
			
			
		//操作读取
//		int data1 = is.read();//读取第一个数据,返回一个int类型的数据
//		int data2 = is.read();//读取第二个数据，返回一个int类型的数据
//		System.out.println((char)data1);
//		System.out.println((char)data2);
		
		
		//操作读取(优化)
		int temp;
		try {
			is = new FileInputStream(stc); 
			while((temp=is.read())!=-1) {
				System.out.println((char)temp);
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
