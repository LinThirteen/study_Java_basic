package day09;

import java.util.ArrayList;
import java.util.List;

public class arraylist操作多个list {
	
	
	private void mian() {
		// TODO Auto-generated method stub
		
		
		
		
		
//		  ArrayList底层是用数组实现的存储。 特点：查询效率高，增删效率低，线程不安全。我们一般使用它。
//		  我们知道，数组长度是有限的，而ArrayList是可以存放任意数量的对象，长度不受限制，
		test02();

	}


public static void test02(){
	List<String> list01 = new ArrayList<>(); //其中list可以切换Collection
	list01.add("aa");
	list01.add("bb");
	list01.add("cc");
	
	
	
	List<String> list02 = new ArrayList<>();
	list02.add("aa");
	list02.add("dd");
	list02.add("ee");
	
	
	System.out.println("lsit01:"+list01);
	System.out.println("lsit02:"+list02);
	
	//将test02里面的说有元素放进test01;
	list01.addAll(list02);
	System.out.println("lsit01:"+list01);
	
	
	//和test02相同的部分删掉
	list01.removeAll(list02);
	System.out.println("lsit01:"+list01);
	
	
	
	//取交集
	list01.retainAll(list02);
	System.out.println("lsit01:"+list01);
	
	//01是否都包含02所有的元素
	System.out.println(list01.contains(list02));
}



}