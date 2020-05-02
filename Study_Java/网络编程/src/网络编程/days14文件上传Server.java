package 网络编程;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class days14文件上传Server {
	
	public static void main(String[] args) throws IOException {
		
		//1.使用ServerSocket创建服务器,指定端口
				ServerSocket server = new ServerSocket(8888);
				
				//2.阻塞式等待连接accept,没有连接就会阻塞在此
				Socket client = server.accept();

				//3.文件拷贝
				InputStream is = new BufferedInputStream(client.getInputStream());
				OutputStream os = new BufferedOutputStream(new FileOutputStream("src/copy1.png"));
				byte[] data = new byte[1024];
				int len=-1;
				while((len=is.read(data))!=-1) {
					os.write(data,0,len);
				}
				os.flush();
	
				//释放输出
				
				is.close();
				server.close();
			}

		}

