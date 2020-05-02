package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class days10多线程一对一交流server implements  Runnable {
	private DatagramSocket server;
	private String user;

	
	public days10多线程一对一交流server(int toPort,String user) {
		this.user = user;
		try {
			server = new DatagramSocket(toPort);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void run() {
		while(true) {
			//2.准备容器封装成DatagramPacket包裹
			byte[] container = new byte[1024*60];
			DatagramPacket packet = new DatagramPacket(container, 0,container.length);
			
			//3.阻塞式接收receive(DatagramPacket p)
			try {
				server.receive(packet);
				//4.分析数据(收到的数据为字节数组)
				byte[] datas = packet.getData();
				int len = packet.getLength();
//				System.out.println(datas);//[B@70dea4e
				String data = new String(datas,0,len);
				System.out.println(user+data);//将字节数组转换为字符串
				if(data.equals("bye")) {
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			}
			//5.释放资源
			server.close();
			
	}
	
	public static void main(String[] args) throws SocketException {
		new Thread(new days10多线程一对一交流server(9999,"咨询:")).start();
		new Thread(new days10多线程一对一交流client(6666,"localhost",5555)).start();

	}

}
