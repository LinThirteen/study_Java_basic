package 网络编程;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.util.Date;

public class day7UDP对象类型client {

	public static void main(String[] args) throws IOException {
		//1.使用DatagramSocket 指定端口 创建发送端
		//2.准备数据 一定转成字节数组
		//3.封装成DatagramPacket包裹，需要指定目的地（ip地址+端口）
		//4.发送包裹send(DataGramPacket p)
		//5.释放资源
		
		
		
		System.out.println("发送方启动中！");
		//1.使用DatagramSocket 指定端口 创建发送端
		DatagramSocket client = new DatagramSocket(8888);
		
		//2.准备数据 一定转成字节数组
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(baos));
		//操作数据类型
		oos.writeUTF("编码心酸泪");
		oos.writeInt(18);
		oos.writeBoolean(false);
		oos.writeChar('a');
		//对象
		oos.writeObject("谁解其中味");
		oos.writeObject(new Date());
		Person per = new Person(18,true,"lwk");
		oos.writeObject(per);
		oos.flush();
		byte[] datas = baos.toByteArray();
		
		//3.封装成DatagramPacket包裹，需要指定目的地（ip地址+端口）
		DatagramPacket packet = new DatagramPacket(datas, 0,datas.length,
				new InetSocketAddress("localhost",9999));
		
		//4.发送包裹send(DataGramPacket p)
		client.send(packet);
		
		//5.释放资源
		client.close();
		
		System.out.println("数据已经发送出去了");//数据发送出去后不管对方有没有收到
		
		
		

	}
	}



class Person implements Serializable {
    // 添加序列化ID，它决定着是否能够成功反序列化！
    private static final long serialVersionUID = 1L;
    int age;
    boolean isMan;
    String name;
 
    public Person(int age, boolean isMan, String name) {
        super();
        this.age = age;
        this.isMan = isMan;
        this.name = name;
    }
 
    @Override
    public String toString() {
        return "Person [age=" + age + ", isMan=" + isMan + ", name=" + name + "]";
    }
}