package day05;

public class string类常用方法 {

	   public static void main(String[] args) {
	        String s1 = "core Java";
	        String s2 = "Core Java";
	        System.out.println(s1.charAt(3));//提取下标为3的字符
	        System.out.println(s2.length());//字符串的长度
	        System.out.println(s1.equals(s2));//比较两个字符串是否相等
	        System.out.println(s1.equalsIgnoreCase(s2));//比较两个字符串（忽略大小写）
	        System.out.println(s1.indexOf("Java"));//字符串s1中是否包含Java
	        System.out.println(s1.indexOf("apple"));//字符串s1中是否包含apple
	        String s = s1.replace(' ', '&');//将s1中的空格替换成&
	        System.out.println("result is :" + s);
	        
	        
	        String s9 = "";
	        String s4 = "How are you?";
	        System.out.println(s4.startsWith("How"));//是否以How开头
	        System.out.println(s4.endsWith("you"));//是否以you结尾
	        
	        s9 = s4.substring(4);//提取子字符串：从下标为4的开始到字符串结尾为止
	        System.out.println(s);
	        
	        s9 = s4.substring(4, 7);//提取子字符串：下标[4, 7) 不包括7
	        System.out.println(s);
	        
	        s9 = s4.toLowerCase();//转小写
	        System.out.println(s);
	        
	        s9 = s4.toUpperCase();//转大写
	        System.out.println(s);
	        
	        String s8 = "  How old are you!! ";
	        s9 = s8.trim();//去除字符串首尾的空格。注意：中间的空格不能去除
	        System.out.println(s);
	        System.out.println(s8);//因为String是不可变字符串，所以s2不变
	    }

}
