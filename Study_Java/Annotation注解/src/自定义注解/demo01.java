package 自定义注解;



//@MyAnnotation01  报错
public class demo01 {
	
//	@MyAnnotation01
//	public void test() {
//		
//	}
	
	
	@MyAnnotation01(age=19,studentName = "lin",id=1010,schools = {"南京大学","湖南大学"})
	public void test() {
		
	}
	
	@MyAnnotation2("aaa")
	public void test2() {
		
	}


}
