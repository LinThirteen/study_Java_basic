package day08;

public class 可变序列和不可变序列陷阱 {
		public static void main(String[] args) {
		       String str8 = "";
		        //本质上使用StringBuilder拼接, 但是每次循环都会生成一个StringBuilder对象
		        long num1 = Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
		        long time1 = System.currentTimeMillis();//获取系统的当前时间
		        
		        //注意以后一定不能出现这样的代码
//		        for (int i = 0; i < 5000; i++) {
//		        	//i有5000个
//		            str8 = str8 + i;//相当于产生了10000个对象
//		        }
		        
		        //优化,节省空间与时间
		        StringBuilder sb = new StringBuilder("");
		        for (int i = 0; i < 5000; i++) {
		        	sb.append(i);
		        }
		        
		        
		        
		        long num2 = Runtime.getRuntime().freeMemory();
		        long time2 = System.currentTimeMillis();
		        System.out.println("String占用内存 : " + (num1 - num2));//获取运行程序占用的内存空间
		        System.out.println("String占用时间 : " + (time2 - time1));//获取运行时间
		}
}
