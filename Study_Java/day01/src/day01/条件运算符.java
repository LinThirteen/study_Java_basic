package day01;

public class 条件运算符 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//		其中 x 为 boolean 类型表达式，先计算 x 的值，若为true，
		//		则整个运算的结果为表达式 y 的值，否则整个运算结果为表达式 z 的值。
		//		x ? y : z
		
		
		int score = 80; 
        int x = -100;
        String type =score<60?"不及格":"及格"; 
        int flag = x > 0 ? 1 : (x == 0 ? 0 : -1);
        System.out.println("type= " + type);
        System.out.println("flag= "+ flag);
        
	}

}
