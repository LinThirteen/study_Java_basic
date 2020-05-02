package 网络编程;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class days20Receive implements Runnable {

	//发送端
	private DataInputStream dis = null;
	private Socket client =null;
	private boolean isRunning = true;
	private String msg = null;

	public days20Receive(Socket client) {
		this.client = client;
		try {
			dis = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("-----client1------");
			release(); //释放资源
		}
	}
	private String receive(){
		try {
			msg = dis.readUTF();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("-----2------");
			this.release();
		}			
		return msg;
	}
	private void release() {
		this.isRunning =false;
		//封装
		days19释放资源类 .close(dis,client);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning) {
			msg = receive();
			if(!msg.equals("")) {
				System.out.println(msg);
			}
			}		
		}	
	}

	


