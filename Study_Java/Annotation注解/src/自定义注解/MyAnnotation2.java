package 自定义注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD,ElementType.TYPE})//表示既可以修饰方法，也可以修饰类
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
		
	String value(); //如果只有一个参数，那么一般定义为value
	}




