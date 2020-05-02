package day02;

public class do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int a = 0;
	        while (a < 0) {
	            System.out.println(a);
	            a++;
	        }
	        System.out.println("-----");
	        //do-while循环：先执行再判断
	        a = 0;
	        do {
	            System.out.println(a);
	            a++;
	        } while (a < 0);
		
		
	}

}
