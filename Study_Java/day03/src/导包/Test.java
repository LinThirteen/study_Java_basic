package 导包;

import 被导包.User;

import 被导包.*; //表示该包下面的所有类都导进来，不过会降低一点点的编译速度

import java.util.Date;

import java.sql.*;

//导入类里面所有的静态属性
import static java.lang.Math.PI;



public class Test {
	
	public static void main(String[] args) {
		
		User user = new User();
		
		//或者
//		被导包.User user = new User();
		
		
		
		Date date = new Date(); //默认用指明的Date包
		
		//如果想用sql的Date
//		java.sql.Date sqldate = new java.sql.Date();
		
		
		
		
		//如果不导入静态属性类的话
		System.out.println(Math.PI);
		
		//如果导入的话
		System.out.println(PI);
		
		
	}
}
