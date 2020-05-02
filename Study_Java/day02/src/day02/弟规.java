package day02;

public class 弟规 {

	 public static void main(String[] args) {
	        long d1 = System.currentTimeMillis();  //计算时间
	        System.out.printf("%d阶乘的结果:%s%n", 10, factorial(20));
	        long d2 = System.currentTimeMillis(); //计算时间
	        System.out.printf("递归费时：%s%n", d2-d1);  //耗时：32ms
	    }
	    /** 求阶乘的方法*/
	    static long  factorial(int n){
	        if(n==1){//递归头
	            return 1;
	        }else{//递归体
	            return n*factorial(n-1);//n! = n * (n-1)!
	        }
		
	    }

	   

}