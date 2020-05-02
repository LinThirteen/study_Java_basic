package 网络编程;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class days20封装聊天室Server5 {
	
	//多个客户可以正常的收发消息
	//使用多线程
	//问题：代码太多，不好维护
	//  	客户端读写没有分开，先写才能后读
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("----------Server----------");
		
		// 1.使用ServerSocket创建服务器,指定端口
		ServerSocket server = new ServerSocket(8888);
		System.out.println(server);
		
		// 2.阻塞式等待连接accept,没有连接就会阻塞在此
		while(true) {
		
		Socket client = server.accept();
		System.out.println(client);
		System.out.println("一个客户端建立了连接");
		new Thread(new Channelst(client)).start();
		
	}
	}

}



//一个客户代表一个Channels
class Channelst implements Runnable{
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	private Socket client;
	private boolean isRunning = true;
	private String msg="";
	
	
	public Channelst(Socket client) {
		this.client = client;
		try {
			dis = new DataInputStream(client.getInputStream());
			dos = new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("-----1------");
			release();
		}
	}
	
	//接受消息
	private String receive()  {
		
		try {
			msg = dis.readUTF();
			System.out.println(msg);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("-----2------");
			release();
		}			
		return msg;
	}
	
	//发送消息
	private void send(String msg)  {
		try {
			dos.writeUTF(msg);
			dos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("-----3------");
			release();
		}
	}
	
	//释放资源
	private void release() {
		this.isRunning =false;
		//封装
		days19释放资源类 .close(dis,dos,client);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning) {
			msg = receive();	
			if(!msg.equals("")) {
				send(msg);
			}
		}
		
	}
}

