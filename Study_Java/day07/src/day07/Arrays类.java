package day07;
import java.util.Arrays;

public class Arrays类 {

	
//	 JDK提供的java.util.Arrays类，包含了常用的数组操作，方便我们日常开发。
//	 Arrays类包含了：排序、查找、填充、打印内容等常见的操作。
	
	//
	public static void main(String[] args) {
		
		int[] a = {1,2,3,5};
		
		System.out.println(Arrays.toString(a));
		
		
		//数组排序
		int[] b = {10,2,30,5};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		//查找内容,没找到就返回一个-1
		System.out.println(Arrays.binarySearch(b,2));
	}
}
