package 网络编程;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class days16聊天室Server {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("----------Server----------");
		
		// 1.使用ServerSocket创建服务器,指定端口
		ServerSocket server = new ServerSocket(8888);
		
		// 2.阻塞式等待连接accept,没有连接就会阻塞在此
		Socket client = server.accept();
		System.out.println("一个客户端建立了连接");
		
		//3.接受消息
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String datas = dis.readUTF();
		
		
		//4.返回消息
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF(datas);
		dos.flush();
		
		
		//5.释放资源
		dos.close();
		dis.close();
		client.close();
	}

}
