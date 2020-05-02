package 网络编程;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Date;

public class day7UDP对象类型server {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//1.使用DatagramSocket 指定端口 创建接受端
		//2.准备容器封装成DatagramPacket包裹
		//3.阻塞式接收receive(DatagramPacket p)
		//4.分析数据(收到的数据为字节数组)
			//byte[] getDate()
			//getLength()
		//5.释放资源
		
		
		
		System.out.println("接受方启动中！");
		
		//1.使用DatagramSocket 指定端口 创建接受端
		DatagramSocket server = new DatagramSocket(9999);//同一个协议下端口不允许重复，和client端的"localhost",9999端口一致
		
		//2.准备容器封装成DatagramPacket包裹
		byte[] container = new byte[1024*60];
		DatagramPacket packet = new DatagramPacket(container, 0,container.length);
		
		//3.阻塞式接收receive(DatagramPacket p)
		server.receive(packet);
		
		//4.分析数据(收到的数据为字节数组)
		//byte[] getDate()
		//getLength()
		byte[] datas = packet.getData();
		int len = packet.getLength();
	
		//读取---->反序列化
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		//顺序与发送保持一致		
		String msg = ois.readUTF();
		int age = ois.readInt();
		boolean flag = ois.readBoolean();
		char ch = ois.readChar();
		System.out.println(flag);
		
		//对象的数据还原
		Object str = ois.readObject();
		Object date = ois.readObject();
		Object per = ois.readObject();
		
		if(str instanceof String) {
			String strObj = (String)str;
			System.out.println(strObj);
		}
		if(date instanceof Date) {
			Date dateObj = (Date)date;
			System.out.println(dateObj);
		}
		if(per instanceof Person) {
			Person personObj = (Person)per;
			System.out.println(personObj);
		}
		
		//5.释放资源
		server.close();
		
		
		
		
	}

}
