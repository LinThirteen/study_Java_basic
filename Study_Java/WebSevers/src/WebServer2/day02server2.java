package WebServer2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

//使用ServerSocket建立与流浪器的链接，获取请求协议

public class day02server2 {
	private ServerSocket serverSocket;
	
	public static void main(String[] args) {
		day02server2 ser = new day02server2();
		ser.start();
		ser.stop();
		
	}
	
	//启动服务
	public void start() {
		try {
			serverSocket = new ServerSocket(8000);
			receive();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("服务器启动失败！");
		}
	}
	
	//接受链接处理
	public void receive() {
		try {
			Socket client = serverSocket.accept();
			System.out.println("一个客户端建立了连接");
			
			//获取请求协议
			InputStream is = client.getInputStream();
			byte[] datas = new byte[1024*10];
			int len = is.read(datas);
			String req = new String(datas,0,len);
			System.out.println(req);
			
			
			StringBuilder content = new StringBuilder();
			content.append("<html>");
			content.append("<head>");
			content.append("<title>");
			content.append("标题");
			content.append("</title>");
			content.append("</head>");
			content.append("<body>");
			content.append("哈哈哈");
			content.append("</body>");
			content.append("</html>");
			int size = content.toString().getBytes().length;
			StringBuilder responseInfo = new StringBuilder();
			String blank = "";
			String CRLF="\r\n";
			responseInfo.append("HTTP/1.1").append(blank);
			responseInfo.append(200).append(blank);
			responseInfo.append("OK").append(CRLF);
			//返回
			//1.响应行：HTTP/1.1 200 OK
			//2.响应头(最后一行存在空行）：
			/*
			 * 字节数大小
			 * 
			 * 
			 * 
			 */
			responseInfo.append("Date:").append(new Date()).append(CRLF);
			responseInfo.append("Server:").append("shsxt Server/0.0.1;charset=GBK").append(CRLF);
			responseInfo.append("Content-type:text/html").append(CRLF);
			responseInfo.append("Content-length").append(size).append(CRLF);
			responseInfo.append(CRLF);
			//3.正文
			responseInfo.append(content.toString());
			
			//写到客户端
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			bw.write(responseInfo.toString());
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("客户端连接错误");
		}
		
	}
	
	//停止服务
	public void stop() {
		
	}

}
