package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class day9一对一交流client {

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
		BufferedReader rader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
		String data = rader.readLine();	
		byte[] datas = data.getBytes();
		
		//3.封装成DatagramPacket包裹，需要指定目的地（ip地址+端口）
		DatagramPacket packet = new DatagramPacket(datas, 0,datas.length,
				new InetSocketAddress("localhost",9999));
		
		//4.发送包裹send(DataGramPacket p)
		client.send(packet);
		if(data.equals("bye")) {
			break;
		}
		}
		//5.释放资源
		client.close();
		
		System.out.println("数据已经发送出去了");//数据发送出去后不管对方有没有收到
		
		
		

	}
	}