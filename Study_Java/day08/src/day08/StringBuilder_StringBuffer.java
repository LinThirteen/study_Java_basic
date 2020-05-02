package day08;

public class StringBuilder_StringBuffer {

		public static void main(String[] args) {
			
			//不可变序列
//			String str;
			
			
			//可变序列
//			StringBuilder sb = new StringBuilder();
			
//			StringBuilder和StringBuffer的区别
			//1.StringBuilder线程不安全，效率高（一般用它）
			//2.StringBuffer线程安全，效率低
			
			StringBuilder sb = new StringBuilder("dfdsfds");
			
			//打印sb地址0
			System.out.println(sb.hashCode());
			
			//修改sb
			sb.setCharAt(2, 'M');
			System.out.println(sb.hashCode());  //地址一样
			System.out.println(sb);//dfMsfds
		}
}
