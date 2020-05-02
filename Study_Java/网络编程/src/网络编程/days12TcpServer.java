package 网络编程;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class days12TcpServer {

	public static void main(String[] args) throws IOException {
		
		
	//1.使用ServerSocket创建服务器,指定端口
	ServerSocket server = new ServerSocket(8888);
	
	//2.阻塞式等待连接accept,没有连接就会阻塞在此
	Socket client = server.accept();
	//浏览器访问127.0.0.1:8888
	System.out.println("一个客户端建立了连接");
	
	//3.输入输出流操作
	DataInputStream dis = new DataInputStream(client.getInputStream());
	String data = dis.readUTF();
	System.out.println(data);
	
	//4.释放资源
	dis.close();
	client.close();
	
}
}
