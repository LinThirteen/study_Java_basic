package 网络编程;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class days15多用户登录server {

	public static void main(String[] args) throws IOException {
		// 1.使用ServerSocket创建服务器,指定端口
		ServerSocket server = new ServerSocket(8888);
		boolean isRunning = true;

		// 2.阻塞式等待连接accept,没有连接就会阻塞在此
		while (isRunning) {

			Socket client = server.accept();
			System.out.println("一个客户端建立了连接");
			new Thread(new Channel(client)).start();
		}
		server.close();
	}
}


//一个channel代表一个channel
class Channel implements Runnable {
	private Socket client;
	private String uname = "";
	private String password = "";
	private DataInputStream dis;
	private DataOutputStream dos;
	private String datas;

	public Channel(Socket client) {
		this.client = client;
		try {
			dis = new DataInputStream(client.getInputStream());
			dos = new DataOutputStream(client.getOutputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			release();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		// 3.输入输出流操作

		try {
			receive();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} // 接受数据方法
		String[] datasArray = datas.split("&");
		for (String info : datasArray) {
			String[] userinfo = info.split("=");
			if (userinfo[0].equals("uname")) {
				System.out.println("您的用户名为：" + userinfo[1]);
				uname = userinfo[1];
			} else if (userinfo[0].equals("password")) {
				System.out.println("您的密码为：" + userinfo[1]);
				password = userinfo[1];
			}
		}

		if (uname.equals("1234") && password.equals("123456")) {
			try {
				send("登录成功，欢迎回来");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			try {
				send("用户名或密码错误");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		release();
	}

	// 接受数据方法
	private void receive() throws IOException {
		this.datas = dis.readUTF();

	}

	// 发送数据方法
	private void send(String str) throws IOException {
		dos.writeUTF(str);
		dos.flush();

	}

	// 释放资源
	private void release() {
		// 4.释放资源
		try {
			if (null != dos) {
				dos.close();
			}
			if (null != dis) {
				dis.close();
			}
			if (null != client) {
				client.close();
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
