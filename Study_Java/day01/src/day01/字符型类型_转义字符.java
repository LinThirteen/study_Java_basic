package day01;

public class 字符型类型_转义字符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//用单引号表示一个字符
		char a = 'a'; 
		char b ='中';
		char c ='\u0061';  //a
		System.out.println("c");
		System.out.println(a+b);  // 20110
		System.out.println(""+a+b); //a中
		System.out.println('\n');  //换行
		System.out.println('\t');   //空格
		System.out.println(""+a+'\''+b); // a中
		
		
		//字符串连接符
	      int u=12;
	      System.out.println("a="+u);//输出结果: a=12

	}

}
