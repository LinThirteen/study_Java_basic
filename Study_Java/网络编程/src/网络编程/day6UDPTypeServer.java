package 网络编程;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class day6UDPTypeServer {
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		//1.使用DatagramSocket 指定端口 创建接受端
		//2.准备容器封装成DatagramPacket包裹
		//3.阻塞式接收receive(DatagramPacket p)
		//4.分析数据，将字节数组还原成对应的类型			
		//5.释放资源
		
		
		
System.out.println("接受方启动中！");
		
		//1.使用DatagramSocket 指定端口 创建接受端
		DatagramSocket server = new DatagramSocket(9999);//同一个协议下端口不允许重复，和client端的"localhost",9999端口一致
		
		//2.准备容器封装成DatagramPacket包裹
		byte[] container = new byte[1024*60];
		DatagramPacket packet = new DatagramPacket(container, 0,container.length);
		
		//3.阻塞式接收receive(DatagramPacket p)
		server.receive(packet);
		
		//4.分析数据，将字节数组还原成对应的类型	
		byte[] datas = packet.getData();
		int len = packet.getLength();
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		//顺序与写出一致
		String msg = dis.readUTF();
		int age = dis.readInt();
		boolean flag = dis.readBoolean();
		char ch = dis.readChar();
		System.out.println(flag);
		System.out.println(msg);
			
		//5.释放资源
		server.close();
	}

}
