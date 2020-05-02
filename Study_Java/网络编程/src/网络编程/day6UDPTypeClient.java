package 网络编程;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class day6UDPTypeClient {
	
	public static void main(String[] args) throws IOException {
		
		//1.使用DatagramSocket 指定端口 创建发送端
		//2.将基本类型转成字节数组
		//3.封装成DatagramPacket包裹，需要指定目的地（ip地址+端口）
		//4.发送包裹send(DataGramPacket p)
		//5.释放资源
		
		
		
		System.out.println("发送方启动中！");
		//1.使用DatagramSocket 指定端口 创建发送端
		DatagramSocket client = new DatagramSocket(8888);
		
		//2.将基本类型转成字节数组
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		//操作基本类型或者非引用类型用的是data流
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(baos));
		//操作数据类型+数据
		dos.writeUTF("编码心酸泪");
		dos.writeInt(18);
		dos.writeBoolean(false);
		dos.writeChar('a');
		dos.flush();
		byte[] datas = baos.toByteArray();
		System.out.println(datas.length);
		
		
		//3.封装成DatagramPacket包裹，需要指定目的地（ip地址+端口）
		DatagramPacket packet = new DatagramPacket(datas, 0,datas.length,
				new InetSocketAddress("localhost",9999));
		
		//4.发送包裹send(DataGramPacket p)
		client.send(packet);
		
		//5.释放资源
		client.close();
		
		System.out.println("数据已经发送出去了");//数据发送出去后不管对方有没有收到
		
	}

}
