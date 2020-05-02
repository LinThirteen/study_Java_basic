package 网络编程;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class days12TcpClient {

	public static void main(String[] args) throws IOException {
		
		
	//1.建立链接：使用Socket创建客户端+服务器的地址和端口
	Socket client = new Socket("localhost",8888);
	
	//2.输入输出流操作
	DataOutputStream dos = new DataOutputStream(client.getOutputStream());
	String data = "hellow";
	dos.writeUTF(data);
	dos.flush();
	
	//3.释放资源
	dos.close();
	client.close();
	
}
}