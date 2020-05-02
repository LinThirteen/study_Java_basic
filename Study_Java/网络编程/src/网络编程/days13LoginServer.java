package 网络编程;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class days13LoginServer {
	
	public static void main(String[] args) throws IOException {
		//1.使用ServerSocket创建服务器,指定端口
		ServerSocket server = new ServerSocket(8888);
		
		//2.阻塞式等待连接accept,没有连接就会阻塞在此
		Socket client = server.accept();
		//浏览器访问127.0.0.1:8888
		System.out.println("一个客户端建立了连接");
		String uname="";
		String password ="";
		//3.输入输出流操作
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String datas = dis.readUTF();
		String[] datasArray = datas.split("&");
		for(String info:datasArray) {
			String[] userinfo=info.split("=");		
			if(userinfo[0].equals("uname")) {
				System.out.println("您的用户名为："+userinfo[1]);
				uname=userinfo[1];
			}else if(userinfo[0].equals("password")) {
				System.out.println("您的密码为："+userinfo[1]);
				password =userinfo[1];
			}
			
		}
		//输出
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		if(uname.equals("1234")&&password.equals("123456")) {
			dos.writeUTF("登录成功，欢迎回来");
		}else {
			dos.writeUTF("用户名或密码错误");
		}
		dos.flush();
		//4.释放资源
		dis.close();
		server.close();
	}

}
