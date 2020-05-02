package 网络编程;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class days21群聊Client6 {
	
	
	//多个客户可以正常的收发消息
	//使用多线程
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("-------client-------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入用户名:");
		String name = br.readLine();
		//1.建立链接：使用Socket创建客户端+服务器的地址和端口
		Socket client = new Socket("localhost",8888);
		System.out.println(client);//每个连接的localport=53937不同
		new Thread(new days20send(client,name)).start();
		new Thread(new days20Receive(client)).start();
		
		

		
	}

}
