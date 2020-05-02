package 网络编程;

import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class day8图片对象client {
	
	

	public static void main(String[] args) throws IOException {
		//1.使用DatagramSocket 指定端口 创建发送端
		//2.准备数据 一定转成字节数组
		//3.封装成DatagramPacket包裹，需要指定目的地（ip地址+端口）
		//4.发送包裹send(DataGramPacket p)
		//5.释放资源
		
		
		
		System.out.println("发送方启动中！");
		//1.使用DatagramSocket 指定端口 创建发送端
		DatagramSocket client = new DatagramSocket(8888);
		
		//2.准备数据 将文件转成字节数组
			//图片太大会报错
		  byte[] datas = FileUtils.readFileToByteArray(new File("src/查看镜像.JPG"));
		
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
