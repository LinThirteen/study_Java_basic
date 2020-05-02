package 网络编程;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class days19封装聊天室Client4 {
	
	
	//多个客户可以正常的收发消息
	//使用多线程
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("-------client-------------");
		
		//1.建立链接：使用Socket创建客户端+服务器的地址和端口
		Socket client = new Socket("localhost",8888);
		
		//客户端发送消息
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
	
		//3.输入输出流操作
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		DataInputStream dis = new DataInputStream(client.getInputStream());
		boolean isRunning = true;
		while(isRunning) {
		String msg = console.readLine();	
		dos.writeUTF(msg);
		dos.flush();
		
		//4.获取消息
		String datas = dis.readUTF();
		System.out.println(datas);
		}
		
		//4.释放资源
		dos.close();
		dis.close();
		client.close();
		
	}

}
