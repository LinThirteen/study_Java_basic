package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class day9一对一交流server {
	
	
public static void main(String[] args) throws IOException {
		
		//1.使用DatagramSocket 指定端口 创建接受端
		//2.准备容器封装成DatagramPacket包裹
		//3.阻塞式接收receive(DatagramPacket p)
		//4.分析数据(收到的数据为字节数组)
			//byte[] getDate()
			//getLength()
		//5.释放资源
		
		
		
		System.out.println("接受方启动中！");
		
		//1.使用DatagramSocket 指定端口 创建接受端
		DatagramSocket server = new DatagramSocket(9999);//同一个协议下端口不允许重复，和client端的"localhost",9999端口一致
		
		
		while(true) {
		//2.准备容器封装成DatagramPacket包裹
		byte[] container = new byte[1024*60];
		DatagramPacket packet = new DatagramPacket(container, 0,container.length);
		
		//3.阻塞式接收receive(DatagramPacket p)
		server.receive(packet);
		
		//4.分析数据(收到的数据为字节数组)
		//byte[] getDate()
		//getLength()
		byte[] datas = packet.getData();
		int len = packet.getLength();
//		System.out.println(datas);//[B@70dea4e
		String data = new String(datas,0,len);
		System.out.println(data);//将字节数组转换为字符串
		if(data.equals("bye")) {
			break;
		}
		}
		//5.释放资源
		server.close();
		
		
		
		
	}

}
