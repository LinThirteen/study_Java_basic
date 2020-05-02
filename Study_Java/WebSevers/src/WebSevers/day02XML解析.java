package WebSevers;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class day02XML解析 {
	
	//XML 可扩展标记语言，作为数据的一种存储格式或用于存储软件的参数，
	//程序解析此配置文件，就可以到达不可修改代码就能更改程序的目的
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//SAX解析
		//1.获取解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		//2.从解析工厂获取解析器
		SAXParser parse = factory.newSAXParser();
		//3.编写处理器
		//4.加载文档Document注册处理器
		PHandler handler = new PHandler();
		//5.解析:从当前线程的类加载器中获取           如果包名为com.sxt.server.basic 那么getResourceAsStream("com/sxt/server/basic/p.xml")
		parse.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("WebSevers/p.xml"), handler);
			

	}
}

class PHandler extends DefaultHandler{
	
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("----解析文档开始-----");
	}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println(qName+"---->解析开始");
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		String contents = new String(ch,start,length).trim();
		if(contents.length()>0) {
		System.out.println("内容为"+contents);
		}else{
			System.out.println("内容为"+"空");
			}
		}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		System.out.println(qName+"---->解析结束");
	}
	
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("----解析文档结束-----");
	}
}
