package day08;

public class 包装类 {
	
	//包装类的Integer类的使用，其他包装类用法类似

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//包装一个int类型的值
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(30);
		
		//把包装类对像转成基本数据类型
		int c = b.intValue();
		double d = b.doubleValue();
		
		//把字符串转成包装类对象
		Integer e = new Integer("888");
		Integer f = Integer.parseInt("8080");
		
		//把包装类转换为字符串
		String str = f.toString();
		
		//常见的常量
		System.out.println("int 类型最大的正数："+Integer.MAX_VALUE);
		
		
		
		
	}

}
