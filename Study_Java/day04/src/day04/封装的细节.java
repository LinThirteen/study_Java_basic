package day04;

public class 封装的细节 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		封裝的細节2   f = new 封裝的細节2();
//		f.age = 4; //不行
		f.setAge(18); 
		f.setName("哈哈哈");
		System.out.println(f.getName());  //获得名字
		System.out.println(f.getAge());
	}
	
}
