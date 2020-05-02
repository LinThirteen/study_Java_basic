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

public class days15多用户登录Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("-------client-------------");
			
		//1.建立链接：使用Socket创建客户端+服务器的地址和端口
		Socket client = new Socket("localhost",8888);
		
		//2.输入输出流操作
		new send(client);		
		//接受
		new receive(client);
		
		client.close();
		
	}
	
	static class console{
		BufferedReader console;
		private console() {
			console = new BufferedReader(new InputStreamReader(System.in));
		}
	}
	
	static class send{
		DataOutputStream dos ;
		BufferedReader console;
		String uname;
		String password;
		public send(Socket client) throws IOException {
			init();
			dos =  new DataOutputStream(client.getOutputStream());
			dos.writeUTF("uname="+uname+"&"+"password="+password);
			dos.flush();
			dos.close();
		}
		private void init() throws IOException {
			console = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("请输入用户名：");
			 uname = console.readLine();
			System.out.print("请输入密码：");
			 password = console.readLine();
		}
		

	}
	
	static class receive{
		DataInputStream dis ;

		public receive(Socket client) throws IOException {
			
			dis = new DataInputStream(client.getInputStream());
			String result = dis.readUTF();
			System.out.println(result);
			dis.close();
		}
	}
}
