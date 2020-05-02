package day08;

public class 枚举类 {

//	 枚举体就是放置一些常量。我们可以写出我们的第一个枚举类型，
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Season.SPRING);
		
		Season a = Season.AUTUMN;
		
		switch(a) {
		case SPRING:
			System.out.println("春天来了！");
			break;
		case SUMMER:
			System.out.println("夏天来了！");
			break;
		
		case AUTUMN:
			System.out.println("秋天来了！");
			break;
		case WINDER :
			System.out.println("冬天来了！");
			break;
		default:
			break;
			
		}

	}

}


//所有的枚举都是常量
enum Season {
    SPRING, SUMMER, AUTUMN, WINDER 
}

enum Week{
	星期一,星期二,星期三,星期四,星期五,星期六,星期日
}