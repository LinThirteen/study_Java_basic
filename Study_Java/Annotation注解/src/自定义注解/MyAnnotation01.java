package 自定义注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(value=ElementType.METHOD)  //表示注解只能用于方法前面
//@Target(value= {ElementType.METHOD,ElementType.TYPE})//表示既可以修饰方法，也可以修饰类
//public @interface MyAnnotation01 {
//		
//}



//表示可以被反射读取到
@Target(value= {ElementType.METHOD,ElementType.TYPE})//表示既可以修饰方法，也可以修饰类
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation01 {
		
	String studentName() default "";  //表示参数类型+参数名
	int age() default 0;
	int id() default -1;
	
	String[] schools() default {"清华大学","北京大学"};
	}




