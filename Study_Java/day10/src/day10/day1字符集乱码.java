package day10;

import java.io.UnsupportedEncodingException;

public class day1字符集乱码 {
	public static void main(String[] args) throws UnsupportedEncodingException {
//		String name = "生命a";
//		
//		//编码：字节数组
//		byte[] datas = name.getBytes();
//		System.out.println(datas);
//		System.out.println(datas.length);  //7 3+3+1
//		
//		//编码：其他字符集
//		datas = name.getBytes("UTF-16LE");
//		System.out.println(datas.length);//6  2+2+2
//		
//		
//		//编码：其他字符集
//		datas = name.getBytes("GBK");
//		System.out.println(datas.length);//6  2+2+1
		
		
		
		
		//解码     字节------->字符串
		String msg = "生命生命a";
		
		//编码：字节数组
		byte[] datas =  msg.getBytes();
		
		
		//解码字符串String(byte[] bytes, int offset, int length, String charsetName)
		msg = new String(datas,0,datas.length,"utf-8");
		System.out.println(msg);
		
		
		
		//乱码
		//1.字节数不够
		msg = new String(datas,0,datas.length-2,"utf-8");
		System.out.println(msg);//生命生�
		msg = new String(datas,0,datas.length-1,"utf-8");
		System.out.println(msg);//生命生命
		
		
		
		//2.字符集不统一
		msg = new String(datas,0,datas.length-1,"gbk");
		System.out.println(msg);//鐢熷懡鐢熷懡
		
		
	}

}
