package com.sxt.server.basic.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class day03XML解析2 {

	// XML 可扩展标记语言，作为数据的一种存储格式或用于存储软件的参数，
	// 程序解析此配置文件，就可以到达不可修改代码就能更改程序的目的

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		// SAX解析
		// 1.获取解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();
		// 2.从解析工厂获取解析器
		SAXParser parse = factory.newSAXParser();
		// 3.编写处理器
		// 4.加载文档Document注册处理器
//		PersonHandler personhandler = new PersonHandler();
		WebHandler WebHandler = new WebHandler();
		// 5.解析:从当前线程的类加载器中获取 如果包名为com.sxt.server.basic
		// 那么getResourceAsStream("com/sxt/server/basic/p.xml")
		parse.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("com/sxt/server/basic/servlet/web.xml"),
				WebHandler);
		
		//获取数据
		List<Entity> entitys =WebHandler.getEntitys();
		List<Mapping> mappings = WebHandler.getMappings();
		WebContext context = new WebContext(entitys, mappings);
		
		//假设你输入了/login
		String className = context.getClz("/login");
		Class clz = Class.forName(className);
		Servlet servlet = (Servlet)clz.getConstructor().newInstance();
		servlet.service();
		
	}
}

class WebHandler extends DefaultHandler {
	private List<Entity> entitys;  //存储entity
	private List<Mapping> mappings;  //存储mapping
	private Entity entity;
	private Mapping mapping;
	private String tag;// 存儲操作的标签
	private boolean isMapping = false;

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("----解析文档开始-----");
		entitys = new ArrayList<Entity>();
		mappings = new ArrayList<Mapping>();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub

		if (null != qName) {
			tag = qName;// 存儲操作的标签
			if (tag.equals("servlet")) {
				entity = new Entity();
				isMapping = false;
			}else if(tag.equals("servlet-mapping")){
				mapping = new Mapping();
				isMapping = true;
				}
			}
		}


	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		String contents = new String(ch,start,length).trim();

		if(null!=tag) {	
			if(isMapping) {//操作servlet-mapping
				if(tag.equals("servlet-name")) {
					mapping.setName(contents);
				}else if(tag.equals("url-pattern")){
						mapping.addPattern(contents);		
					}				
			}else {//操作servlet
				if(tag.equals("servlet-name")) {
					entity.setName(contents);
				}else if(tag.equals("servlet-class")){
						entity.setClz(contents);			
					}				
			}
	}		
}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub		
		if(null!=qName) {			
		if (qName.equals("servlet")) {
			entitys.add(entity);
		}else if(qName.equals("servlet-mapping")) {
			mappings.add(mapping);
		}
		
		}
		tag = null;//例如解析完name后系统还会去tag=name去解析空，然后setName(contents);
	}

	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("----解析文档结束-----");
		
	}
	public List<Entity> getEntitys() {
		return entitys;
	}


	public List<Mapping> getMappings() {
		return mappings;
	}


}

