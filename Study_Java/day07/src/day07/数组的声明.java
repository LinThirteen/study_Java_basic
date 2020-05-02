package day07;

public class 数组的声明 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//两种方式
//		type[]   arr_name; //（推荐使用这种方式）
//		type    arr_name[];
		
		
		 int[] s = null; // 声明数组；
	        s = new int[10]; // 给数组分配空间；声明后一定要初始化
	   
	     String[] a = new String[10];  //string类型的数组 
	     a[0] = "哈哈";
	     a[1] = "哈";
	     a[2] = "哈了";	     
	     a[3] = "哈次";
//	     a[10]="啦啦";    运行起来保存，显示下标越界
	     
	     String[] str = {"sfd","dsfdsf ","oimtjt","fdsfddddd"};
	     
	        
	        for (int i = 0; i < 10; i++) {
	            s[i] = 2 * i + 1;//给数组元素赋值；
	            System.out.println(s[i]);
	        } 
	        System.out.println(s);
	        
	        	        
	        User[]  arr03 = new User[3];    //User类型的数组,只可以放3个对象
        	//对象素组存的是引用类型，存的是3个对象的地址
	        arr03[0] = new User(1001,"林十三");
	        arr03[1] = new User(1001,"林十二");
	        arr03[2] = new User(1001,"林十一");
	        
	        //遍历数组
	        for(int i =0;i<arr03.length;i++) {
	        	System.out.println(arr03[i].getName());
	        }
	
	}

}


class User{
	private int id;
	private String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
