package com.sxt.server.basic.servlet;


//<servlet>
	//<servlet-name>login</servlet-name>
	//<servlet-class>com.shsxt.LoginServlet</servlet-class>
//</servlet>


public class Entity {
	private String name;
	private String clz;   //com.shsxt.LoginServlet
	
	public Entity() {
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClz() {
		return clz;
	}
	public void setClz(String clz) {
		this.clz = clz;
	}
	
	
}
