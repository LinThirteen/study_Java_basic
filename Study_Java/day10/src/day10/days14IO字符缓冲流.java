package day10;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;

public class days14IO字符缓冲流 {

	public static void main(String[] args) {

		// 1.创建源
		File src = new File("abc.txt");

		// 2.选择流
		//用到新增的方法就不用发生多态
		BufferedReader reader= null;
		
		try {
			//加入字符缓冲流
			reader =new BufferedReader(new FileReader(src));

			String line = null;
			
			while ((line= reader.readLine())!=null) {
				System.out.println(line);
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
