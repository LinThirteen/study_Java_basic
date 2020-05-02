package 网络编程;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class days21群聊Server6 {
	
	//加入容器实现群聊
//	private List<Channelt1> all = new ArrayList<>();
	
	//并发的时候又要改有要遍历容器
	private static CopyOnWriteArrayList<Channelt1> all = new CopyOnWriteArrayList<>();
	
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
		Channelt1 c =  new Channelt1(client);
		all.add(c);//管咯所有的成员
		new Thread(c).start();
		
	}
	}





//一个客户代表一个Channels
static class Channelt1 implements Runnable{
	private DataInputStream dis = null;
	private DataOutputStream dos = null;
	private Socket client;
	private boolean isRunning = true;
	private String msg="";
	private String name;
	private boolean flag = true;
	
	
	public Channelt1(Socket client) {
		this.client = client;
		try {
			dis = new DataInputStream(client.getInputStream());
			dos = new DataOutputStream(client.getOutputStream());
			name = this.receive();
			this.send("欢迎您的到来:"+name);
			this.sendOther(this.name+"进入了聊天室！",flag);
			
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
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("-----2------");
			release();
		}			
		return msg;
	}
	
	//群聊
	//发送消息
		private void sendOther(String msg,boolean flag)  {
			for(Channelt1 other:all) {
				if(other==this) {//等于自身
					continue;
				}
				if(!flag) {
					other.send(this.name+":"+msg);
				}else {	
				
				other.send(msg);
				
				}
			}
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
		
		//退出
		all.remove(this);
		sendOther(this.name+"离开了群聊", true);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning) {
			msg = receive();	
			if(!msg.equals("")) {
//				send(msg);//自己发给自己
				this.flag=false;
				System.out.println(flag);
				sendOther(msg,flag);//群聊
			}
		}
		
	}
}
}

