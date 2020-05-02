package day10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class days11IO综合对接流 {
	public static void main(String[] args) {

		//字节数组流可以不释放
		//文件流一定要释放
		
		
		// 将图片读取到字节数组中
		// 图片到程序 fileInputStream
		// 程序到字节数组 ByteArrayOutputStream
		// 字节数组写到文件
		
		
		
		byte[] datas = fileToByteArry("copy.png");
		System.out.println(datas.length);
		
		
		//还原成图片
		ByteTofileArry(datas, "copy2.png");
		
	}

	// 将图片读取到字节数组中
		// 图片到程序 fileInputStream
		// 程序到字节数组 ByteArrayOutputStream
	public static byte[]  fileToByteArry(String filePath) {
		
		// 创建源与目的地
		File stc = new File(filePath);
		byte[] dest = null;
		
		// 选择流
		InputStream is = null;
		ByteArrayOutputStream baos = null;

		// 操作读取
		try {
			is = new FileInputStream(stc);
			baos = new ByteArrayOutputStream();
			
			// 分段读取，每次读3个
			byte[] flush = new byte[1024];// 缓冲容器
			int len = -1;
			while ((len = is.read(flush)) != -1) {// 每3个读取一次
				baos.write(flush,0,len);//往字节数组缓冲区里面写
				
			}
			baos.flush();
			return baos.toByteArray();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				if (null != is) {
					// 如果is里面有才通知关闭
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	// 字节数组写到文件
		//字节数组写出到程序 ByteArrayInputStream
		//程序写出到文件 FileOutputStream
public static void ByteTofileArry(byte[] src, String filePath) {
	
	
	//创建源
	File dest = new File(filePath);
	
	//选择流
	InputStream is = null;
	OutputStream os = null;
		
	//操作读取
	try {
		is = new ByteArrayInputStream(src); //将字节数组放到缓冲区，在从缓冲区读取字节数组
		os = new FileOutputStream(dest);
		//分段读取，每次读5个字节
		byte[] flush = new byte[1024];//缓冲容器
		int len = -1;
		while((len=is.read(flush))!=-1) {
			os.write(flush,0,len);//写出到文件
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
		try {
			if(null!=is) {
			//如果is里面有才通知关闭
			os.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

	
	
	
}
