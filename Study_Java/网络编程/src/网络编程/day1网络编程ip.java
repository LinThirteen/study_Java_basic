package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

//ip：定位一个节点

public class day1网络编程ip {
	
	public static void main(String[] args) throws UnknownHostException {
		   //使用getLocalHost方法创建InetAddress对象
			InetAddress addr = InetAddress.getLocalHost();
	        //返回IP地址：192.168.1.102
	        System.out.println(addr.getHostAddress()); 
	        //输出计算机名：LAPTOP-V65OQCSM
	        System.out.println(addr.getHostName()); 
	        
	        
	        //	根据域名得到InetAddress对象
	        InetAddress addrs = InetAddress.getByName("www.优克里.cn");
	        // 返回 sxt服务器的IP:59.110.14.7
	        System.out.println(addrs.getHostAddress());
	        // 输出：www.sxt.cn
	        System.out.println(addrs.getHostName());
	        
	        
	        
	        //	 根据IP得到InetAddress对象
	        InetAddress addrss = InetAddress.getByName("59.110.14.7");
	        // 返回sxt服务器的IP：59.110.14.7
	        System.out.println(addrss.getHostAddress());
	        /*
	         * 输出ip而不是域名。如果这个IP地址不存在或DNS服务器不允许进行IP地址
	         * 和域名的映射，getHostName方法就直接返回这个IP地址。
	         */
	        System.out.println(addrss.getHostName());
	        
	}
}
