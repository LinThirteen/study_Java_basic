package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class days10多线程一对一交流client implements Runnable {
	
	private DatagramSocket client;
	private BufferedReader rader;
	private String toIP;
	private int toPort;
	
	public days10多线程一对一交流client(int port,String toIP,int toPort) throws SocketException {
	this.toIP = toIP;
	this.toPort = toPort;
	client = new DatagramSocket(port);
	rader = new BufferedReader(new InputStreamReader(System.in));

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			String data = null;
			try {
				data = rader.readLine();
				byte[] datas = data.getBytes();
				//3.封装成DatagramPacket包裹，需要指定目的地（ip地址+端口）
				DatagramPacket packet = new DatagramPacket(datas, 0,datas.length,
						new InetSocketAddress(toIP,toPort));
				client.send(packet);
				if(data.equals("bye")) {
					break;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		}	
		//释放资源
		client.close();
	}
	
	public static void main(String[] args) throws SocketException {
		new Thread(new days10多线程一对一交流client(7777,"localhost",9999)).start();
		new Thread(new days10多线程一对一交流server(5555,"用户:")).start();

	}

}
