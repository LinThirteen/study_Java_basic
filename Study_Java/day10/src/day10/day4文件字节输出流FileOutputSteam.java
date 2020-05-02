package day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class day4文件字节输出流FileOutputSteam {

	public static void main(String[] args) {

		// 创建源
		File dest = new File("dest.txt");//不存在自动创建

		// 选择流
		OutputStream os = null; //提升作用域

		
		// 操作读取
		try {								//(dest，true)则覆盖
			os = new FileOutputStream(dest);//(dest，true)则会追加内容
			String msg = "IO is so easy\r\n";//\r\n是换行
			// 字符串------->字节数组（编码）
			byte[] datas = msg.getBytes();
		
			os.write(datas, 0, datas.length);
			os.flush();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				if (null != os) {
					// 如果is里面有才通知关闭
					os.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}