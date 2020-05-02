package day03;

//class 构造方法以及重载详解 {
//	
// double x, y;
// 
// 	//构造方法名称必须跟类名保持一致
//    public 构造方法以及重载详解(double _x, double _y) {
//        x = _x;
//        y = _y;  
//    }
//    public double getDistance(构造方法以及重载详解 p) {
//        return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));//5
//    }
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		
//		//构造器也叫构造方法(constructor)，用于对象的初始化。
////		
////		要点：
////
////		　　1. 通过new关键字调用!!
////
////		　　2. 构造器虽然有返回值，但是不能定义返回值类型(返回值的类型肯定是本类)，不能在构造器里使用return返回某个值。
////
////		　　3. 如果我们没有定义构造器，则编译器会自动定义一个无参的构造函数。如果已定义则编译器不会自动添加!
////
////		　　4. 构造器的方法名必须和类名一致!
//		
//		
//		
//		//p和origin属于不同的两块空间
//		//调用带参数的构造器
//		构造方法以及重载详解 p = new 构造方法以及重载详解(3.0, 4.0);
//		//调用带参数的构造器
//		构造方法以及重载详解 origin = new 构造方法以及重载详解(0.0, 0.0);
//        System.out.println(p.getDistance(origin));
//		
//		
//
//	}
//
//}





//方法类型的重载
//方法名称相同，形参不同
public class 构造方法以及重载详解 {
	//类的成员变量
    int id; // id
    String name; // 账户名
    String pwd; // 密码
    public 构造方法以及重载详解() {
 
    }
    public 构造方法以及重载详解(int id, String name) {
    	//构造方法的第一句总是super(),可以不写，编译器会自动加入
        super();
        //如果不加this的话，那么id=id中两个id全都是形参的id
        this.id = id;  //this也表示创建好的对象
        this.name = name;
    }
    public 构造方法以及重载详解(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }
    public static void main(String[] args) {
    	构造方法以及重载详解 u1 = new 构造方法以及重载详解();
    	构造方法以及重载详解 u2 = new 构造方法以及重载详解(101, "高小七");
    	构造方法以及重载详解 u3 = new 构造方法以及重载详解(100, "高淇", "123456");     
    }
}