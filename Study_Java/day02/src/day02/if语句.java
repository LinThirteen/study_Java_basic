package day02;

public class if语句 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		Math.random()该方法用于产生一个0到1区间的double类型的随机数，但是不包括1。
//		  int i = (int) (6 * Math.random()); //产生：[0，5]之间的随机整数
	
		        //通过掷三个骰子看看今天的手气如何？
		        int i = (int)(6 * Math.random()) + 1;//通过Math.random()产生随机数
		        System.out.println(i);
		        int j = (int)(6 * Math.random()) + 1;
		        System.out.println(j);
		        int k = (int)(6 * Math.random()) + 1;
		        System.out.println(k);
		        int count = i + j + k;
		        //如果三个骰子之和大于15，则手气不错
		        if(count > 15) {
		            System.out.println("今天手气不错");
		        }
		        //如果三个骰子之和在10到15之间，则手气一般
		        if(count >= 10 && count <= 15) { //错误写法：10<=count<=15
		            System.out.println("今天手气很一般");
		        }
		        //如果三个骰子之和小于10，则手气不怎么样
		        if(count < 10) {
		            System.out.println("今天手气不怎么样");
		        }
		        System.out.println("得了" + count + "分");
		        
		        
		        
//		        if-else		        
		        int a=2; 
		        int b=3;
		        if (a<b) {
		            System.out.println(a);
		        } else {
		            System.out.println(b);
		        }
		        
		        
		        
		        
		        
//		        if-else-if
		        int age = (int) (100 * Math.random());
		        System.out.print("年龄是" + age + "， 属于");
		        if (age < 15) {
		            System.out.println("儿童， 喜欢玩！");
		        } else if (age < 25) {
		            System.out.println("青年， 要学习！");
		        } else if (age < 45) {
		            System.out.println("中年， 要工作！");
		        } else if (age < 65) {
		            System.out.println("中老年， 要补钙！");
		        } else if (age < 85) {
		            System.out.println("老年， 多运动！");
		        } else {
		            System.out.println("老寿星， 古来稀！");
		        }
		    }
		    

	

}
