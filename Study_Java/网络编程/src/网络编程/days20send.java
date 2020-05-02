package 网络编程;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class days20send implements Runnable {
	
	//发送端
	BufferedReader console; 
	private DataOutputStream dos = null;
	private Socket client =null;
	private boolean isRunning = true;
	private String msg = null;
	private String name = null;
	
	public days20send(Socket client,String name) {
		console = new BufferedReader(new InputStreamReader(System.in));
		this.client = client;
		this.name=name;
		try {
			dos = new DataOutputStream(client.getOutputStream());
			this.send(name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("-----client1------");
			release(); //释放资源
		}
	}
	private void send(String msg)  {
		try {
			dos.writeUTF(msg);
			dos.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("-----client3------");
			release();
		}
	}
	private void release() {
		this.isRunning =false;
		//封装
		days19释放资源类 .close(dos,client);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning) {
			
			msg = getStrFromConsole();
			if(msg!=null) {
				send(msg);
			}		
		}	
	}
	private String getStrFromConsole(){
		try {
			return console.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
