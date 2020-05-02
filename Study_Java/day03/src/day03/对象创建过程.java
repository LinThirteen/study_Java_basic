package day03;

public class 对象创建过程 {
	
	  	int id;        //id
	    String name;   //账户名
	    String pwd;   //密码
	 

	    public 对象创建过程 (int id, String name) {
	        System.out.println("正在初始化已经创建好的对象："+this);
	        this.id = id;   //不写this，无法区分局部变量id和成员变量id
	        this.name = name;
	    }
	    public void login (){
	        System.out.println(this.name+",要登录！");  //不写this效果一样
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		创建一个对象分为如下四步：
//
//		　　1. 分配对象空间，并将对象成员变量初始化为0或空
//
//		　　2. 执行属性值的显式初始化
//
//		　　3. 执行构造方法
//
//		　　4. 返回对象的地址给相关的变量
		
//		this的本质就是“创建好的对象的地址”! 由于在构造方法调用前，对象已经创建。因此，在构造方法中也可以使用this代表“当前对象” 。
		
		对象创建过程   u3 = new 对象创建过程 (101,"高小七");
	        System.out.println("打印高小七对象："+u3);
	        u3.login();

	}

}


//public class TestThis {
//    int a, b, c;
// 


//	   重载构造器
//    TestThis() {
//        System.out.println("正要初始化一个Hello对象");
//    }
//    TestThis(int a, int b) {
//        // TestThis(); //这样是无法调用构造方法的！
//        this(); // 调用无参的构造方法，并且必须位于第一行！
//        a = a;// 这里都是指的局部变量而不是成员变量
//// 这样就区分了成员变量和局部变量. 这种情况占了this使用情况大多数！
//        this.a = a;
//        this.b = b;
//    }


	//重载构造器
//    TestThis(int a, int b, int c) {
//        this(a, b); // 表示构造器里面调用另外一个构造器，调用带参的构造方法，并且必须位于第一行！，调用53行重载方法的构造器
//        this.c = c;
//    }
// 
//    void sing() {
//    }
//    void eat() {
//        this.sing(); // 调用本类中的sing();
//        System.out.println("你妈妈喊你回家吃饭！");
//    }
// 
//    public static void main(String[] args) {
//        TestThis hi = new TestThis(2, 3);
//        hi.eat();
//    }
//}
