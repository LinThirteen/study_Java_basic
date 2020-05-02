package 网络编程;

import java.net.InetSocketAddress;

public class day2网络编程端口 {
	
//	TCP：0~65535
//	UCP：0~65535
	
	
//	cmd下查看所有的端口：netstat -ano
	//查看指定端口：netstat -ano|findstr "5535"
	//查看指定进程：tasklist|findstr "2676"
	//查看具体程序：使用任务管理器查看PID
	
	public static void main(String[] args) {
	    InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1", 8080);
        InetSocketAddress socketAddress2 = new InetSocketAddress("localhost", 9000);
        System.out.println(socketAddress.getHostName());
        System.out.println(socketAddress2.getAddress());
        System.out.println(socketAddress2.getPort()); //9000
	}
	
	
	
}
