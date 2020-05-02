package day07;

public class 数组的3种初始化方式 {
	
	public static void main(String[] args) {
//		1. 静态初始化
//
//	      除了用new关键字来产生数组以外，还可以直接在定义数组的同时就为数组元素分配空间并赋值。
//
//		【示例7-4】静态初始化数组
//
		int[] a = { 1, 2, 3 };// 静态初始化基本类型数组；指定数值
		User[] mans = { 
				new User(1, "就哈哈"), 
				new User(2, "卡卡")
					};// 静态初始化引用类型数组；
	
	
	//	
	//	动态初始化数组
		int[] a1 = new int[2]; //动态初始化数组，先分配空间；
		a1[0]=1;//给数组元素赋值；
		a1[1]=2;//给数组元素赋值；
		
		
		
		
//		数组的默认初始化
		int a2[] = new int[2]; // 默认值：0,0
		boolean[] b = new boolean[2]; // 默认值：false,false
		String[] s = new String[2]; // 默认值：null, null

	}
}
