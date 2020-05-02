package day10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class days12工具类封装IO2 {

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

//		try(is;os){//资源自动释放
//			try.....with....resource
		try{
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
		} 
		copy("abc.txt","copy3.txt");

	}
	
	
	public static void copy(String srcPath, String destPath) {

//		try(is;os){//资源自动释放
//			try.....with....resource
		File src = new File(srcPath);
		File dest = new File(destPath);
		BufferedReader br = null;
		BufferedWriter bw= null;
		try{
			br = new BufferedReader(new FileReader(src));
			bw = new BufferedWriter(new FileWriter(dest));
			String line =null;
			while ((line = br.readLine())!=null) {

				bw.write(line);
				bw.newLine();
			}
			bw.flush();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
