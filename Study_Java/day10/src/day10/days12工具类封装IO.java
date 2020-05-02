package day10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class days12工具类封装IO {

	public static void main(String[] args) {
		// 文件到文件
		try {
			InputStream is = new FileInputStream("abc.txt");// 方法内部实现了new File(name)
			OutputStream os = new FileOutputStream("abc-copy.txt");
			Copy(is, os);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		byte[] datas = null;
		// 文件到字符数组

		try {
			InputStream is = new FileInputStream("copy.png");// 方法内部实现了new File(name)
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			Copy(is, os);
			datas = os.toByteArray();
			System.out.println(datas.length);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 字节数组到文件
		try {
			InputStream is = new ByteArrayInputStream(datas);// 方法内部实现了new File(name)
			OutputStream os = new FileOutputStream("p-copy.png");
			Copy(is, os);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void Copy(InputStream is, OutputStream os) {

		try {

			// 分段读取，每次读3个
			byte[] flush = new byte[1024];// 缓冲容器
			int len = -1;
			while ((len = is.read(flush)) != -1) {
				// 字节数组----->字符串(解码)
				String str = new String(flush, 0, len);
				os.write(flush, 0, len);
			}

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 4. 释放资源 分别关闭，先打开后关闭
			close(is, os);
		}

	}

	// closeable接口释放资源
	public static void close(Closeable... ios) {// 可变参数
		for (Closeable io : ios) {
			try {
				if (null != io) {
					// 如果is里面有才通知关闭
					io.close();

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 释放资源封装
	public static void close(InputStream is, OutputStream os) {
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
