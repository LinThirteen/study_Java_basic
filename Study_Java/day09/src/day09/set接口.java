package day09;

import java.util.HashSet;
import java.util.Set;

public class set接口 {
	
	public static void main(String[] args) {
//		 Set接口继承自Collection，Set接口中没有新增方法，方法和Collection保持完全一致。我们在前面通过List学习的方法，在Set中仍然适用。因此，学习Set的使用将没有任何难度。
//	      
//		Set容器特点：无序、不可重复。无序指Set中的元素没有索引，我们只能遍历查找;不可重复指不允许加入重复的元素。更确切地讲，新元素如果和Set中某个元素通过equals()方法对比为true，
//	      则不能加入;甚至，Set中也只能放入一个null元素，不能多个。
//		
		
		
		Set<String> set1 = new HashSet<>();
		set1.add("aaa");
		set1.add("bbb");
		set1.add("aaa"); //重复了，不会显示
		System.out.println(set1);
		set1.remove("bbb");
		System.out.println(set1);
		
		
		Set<String> set2 = new HashSet<>();
		set2.add("哈哈哈");
		set2.addAll(set1);
		System.out.println(set2);
		
		
		
	}

}
