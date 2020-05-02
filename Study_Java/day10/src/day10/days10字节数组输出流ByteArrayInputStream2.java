package day10;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class days10字节数组输出流ByteArrayInputStream2 {
	public static void main(String[] args) {
		
		//ByteArrayInputStream(); jvm的缓冲容器
	
		//创建源(源头内部维护）
		byte[] dest = null;
		
		
		//选择流(用新增方法，所以不能继承发生多态)
		ByteArrayOutputStream baos = null;
			
			
		//操作读取
		try {
			baos = new ByteArrayOutputStream();			
			//操作（写出）
			String msg = "show me the code";
			byte[] datas = msg.getBytes();//缓冲容器
			baos.write(datas,0,datas.length);//往缓冲区里面写
			baos.flush();
			
			//获取数据
			dest = baos.toByteArray();
			System.out.println(dest.length+"----->"+new String(dest,0,baos.size()) );
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//释放资源
			try {
				if(null!=baos) {
				//如果is里面有才通知关闭
				baos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
		
		
	

	}

