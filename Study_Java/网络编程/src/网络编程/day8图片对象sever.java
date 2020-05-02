package 网络编程;

import java.io.File;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

public class day8图片对象sever {

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
		FileUtils.writeByteArrayToFile(new File("src/copy.png"), datas);
		
		
		//5.释放资源
		server.close();
		
		
		
		
	}

}