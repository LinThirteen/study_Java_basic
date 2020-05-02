package 网络编程;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class days13LoginClient {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("-------client-------------");
			
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入用户名：");
		String uname = console.readLine();
		System.out.print("请输入密码：");
		String password = console.readLine();
		
		
		//1.建立链接：使用Socket创建客户端+服务器的地址和端口
		Socket client = new Socket("localhost",8888);
		
		//2.输入输出流操作
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF("uname="+uname+"&"+"password="+password);
		dos.flush();
		
		//接受
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String result = dis.readUTF();
		System.out.println(result);
		dos.close();
		client.close();
		
	}
}
