package day03;

public class static关键字 {
		int id; // id
	 	String name; // 账户名
	    String pwd; // 密码
	     
	    static String company = "北京尚学堂"; // 公司名称
	     
	     
	    public static关键字 (int id, String name) {
	        this.id = id;
	        this.name = name;
	    }
	     
	    public void login() {
	        printCompany();  //非静态方法可以访问静态方法和属性
	        System.out.println(company); 
	        System.out.println("登录：" + name);
	    }
	     
	    public static void printCompany() {
//	         login();//调用非静态成员，编译就会报错
	        System.out.println(company);
	        
//	        this     //this不能用于静态方法，因为this属于当前对象
	    }
	     
	    public static void main(String[] args) {
	    	
//	    	
//	    	static修饰的成员变量和方法，从属于类。
//
//	    	普通变量和方法从属于对象的。
	    	
	    	
	    	static关键字  u = new static关键字 (101, "高小七");
	    	static关键字 .printCompany();
	    	static关键字 .company = "北京阿里爷爷";
	    	static关键字 .printCompany();
	    }

}
