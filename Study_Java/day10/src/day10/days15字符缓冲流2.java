package day10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class days15字符缓冲流2 {

	public static void main(String[] args) {

		//文件字符输出流,不能处理图片
			
		// 创建源
		File dest = new File("writeabc.txt");//不存在自动创建

		// 选择流
		Writer writer = null; //提升作用域

		
		// 操作读取
		try {								//(dest，true)则覆盖
			writer = new FileWriter(dest);//(dest，true)则会追加内容
			
			//操作
			
//			//写法一
//			String msg = "IO is so easy\r\n欢迎ni !";//\r\n是换行
//			// 字符串------->字符数组（编码）
//			char[] datas = msg.toCharArray();	
//			writer.write(datas, 0, datas.length);
//			writer.flush();
			
			
			//写法二（字符串的本质就是一个字符数组
//			String msg = "IO is so easy\r\n欢迎ni !";
//			writer.write(msg,0,5);
//			writer.write("hahah");	
//			writer.flush();
			
			
			
			
			//写法三：
//			writer.append("IO is so easy\r\n欢迎ni !").append("jajja");
//			writer.flush();
			
			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				if (null != writer) {
					// 如果is里面有才通知关闭
					writer.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}