package day08;

public class string类 {
	
	
	public static void main(String[] args) {
		
		
		//string类为不可变对象
		
		String str = "asdfg";
		
		
		//字符串截取
		String str2s=str.substring(2,5);
		
		
		//判断字符串是否相等一定要用equals
		
		 	String str1 = "hello" + " java";//相当于str1 = "hello java";
	        String str2 = "hello java";
	        System.out.println(str1 == str2);//true
	        String str3 = "hello";
	        String str4 = " java";
	        //编译的时候不知道变量中存储的是什么,所以没办法在编译的时候优化
	        String str5 = str3 + str4;
	        System.out.println(str2 == str5);//false
	        System.out.println(str2.equals(str5)); //true
		
		
	}
	


	
	
}
