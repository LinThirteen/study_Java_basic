package 网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

//操作upd是发送的数据不能太大，因为会导致后发的数据先到，如果数据太大那么就分开来发

public class day5UDP编程client {
	
	
	
public static void main(String[] args) throws IOException {
	//1.使用DatagramSocket 指定端口 创建发送端
	//2.准备数据 一定转成字节数组
	//3.封装成DatagramPacket包裹，需要指定目的地（ip地址+端口）
	//4.发送包裹send(DataGramPacket p)
	//5.释放资源
	
	
	
	System.out.println("发送方启动中！");
	//1.使用DatagramSocket 指定端口 创建发送端
	DatagramSocket client = new DatagramSocket(8888);
	
	//2.准备数据 一定转成字节数组
	String data = "上海滩";	
	byte[] datas = data.getBytes();
	
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
