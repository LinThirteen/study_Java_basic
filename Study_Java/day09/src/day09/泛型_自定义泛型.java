package day09;

public class 泛型_自定义泛型 {

	public static void main(String[] args) {
		
//		我们可以在类的声明处增加泛型列表，如：<T,E,V>。
		
		
		
		// TODO Auto-generated method stub
		MyCollection<String> my = new MyCollection<String>();
		my.set("hahh", 0);
//		my.set(888, 1);
		
		//取的话就要强制的转型
//		int a= (int) my.get(1);
		String b = (String)my.get(0);
//		System.out.println(a);
		System.out.println(b);
	}

}

//泛型E,表示传进的类型
class MyCollection<E>{
	
	Object[] objs = new Object[5];
	
	public void set(E obj,int index) {
		objs[index] = obj;
		
	}
	
	//实例化是传什么就返回什么
	public E get(int index) {
		return (E)objs[index];
	}
	
}