package day03;

public class 静态初始化块 {
	
	 int id;        //id
	    String name;   //账户名
	    String pwd;   //密码
	    static String company; //公司名称
	    static {
	        System.out.println("执行类的初始化工作");
	        company = "北京尚学堂";
	        printCompany();
	    }  
	    public static void printCompany(){
	        System.out.println(company);
	    }  
	    
	  public  静态初始化块(){ //如果有构造器，那么也会先执行类的初始化工作。因为先加载类才能加载构造对象
//	    	.........
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		构造方法用于对象的初始化!
//		静态初始化块，用于类的初始化操作!在静态初始化块中不能直接访问非static成员。
		
		静态初始化块  u3 = null;  //表示没有执行对象

	}

}
