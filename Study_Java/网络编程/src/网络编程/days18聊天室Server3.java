package 网络编程;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class days18聊天室Server3 {
	
	//多个客户可以正常的收发消息
	//使用多线程
	//问题：代码太多，不好维护
	//  	客户端读写没有分开，先写才能后读
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("----------Server----------");
		
		// 1.使用ServerSocket创建服务器,指定端口
		ServerSocket server = new ServerSocket(8888);
		
		// 2.阻塞式等待连接accept,没有连接就会阻塞在此
		while(true) {
		
		Socket client = server.accept();
		System.out.println("一个客户端建立了连接");
		
		new Thread(()-> {
			//3.接受消息
			DataInputStream dis = null;
			DataOutputStream dos = null;
			String datas;
			boolean isRunning = true;
			
			try {
				dis = new DataInputStream(client.getInputStream());
				dos = new DataOutputStream(client.getOutputStream());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			while(isRunning) {		
			try {
				datas = dis.readUTF();
				//4.返回消息
				dos.writeUTF(datas);
				dos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				isRunning =false;//停止线程
			}					
			}
			
			//5.释放资源
			try {
				if(dis!=null) {
				dis.close();
				}
				if(dos!=null) {
					dos.close();
					}
				if(client!=null) {
					client.close();
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}).start();
		
		
	}
	}

}



