package WebServer2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//使用ServerSocket建立与流浪器的链接，获取请求协议

public class day01server01 {
	private ServerSocket serverSocket;
	
	public static void main(String[] args) {
		day01server01 ser = new day01server01();
		ser.start();
		ser.stop();
		
	}
	
	//启动服务
	public void start() {
		try {
			serverSocket = new ServerSocket(8000);
			receive();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("服务器启动失败！");
		}
	}
	
	//接受链接处理
	public void receive() {
		try {
			Socket client = serverSocket.accept();
			System.out.println("一个客户端建立了连接");
			
			//获取请求协议
			InputStream is = client.getInputStream();
			byte[] datas = new byte[1024*10];
			int len = is.read(datas);
			String req = new String(datas,0,len);
			System.out.println(req);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("客户端连接错误");
		}
		
	}
	
	//停止服务
	public void stop() {
		
	}

}
