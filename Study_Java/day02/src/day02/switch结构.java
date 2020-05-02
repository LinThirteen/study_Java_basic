package day02;

public class switch结构 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  	char c = 'a';
	        int rand = (int) (26 * Math.random());
	        char c2 = (char) (c + rand);  //转换为字节类型
	        System.out.println((byte)(char) (c + 5));
	        System.out.print(c2 + ": ");
	        switch (c2) {   //执行到没有break分支后会继续向下执行，直到遇到break为止
	        case 'a':
	        case 'e':
	        case 'i':
	        case 'o':
	        case 'u':
	            System.out.println("元音");
	            break;
	        case 'y':
	        case 'w':
	            System.out.println("半元音");
	            break;
	        default:
	            System.out.println("辅音");
	        }
	        

	    }

	}


