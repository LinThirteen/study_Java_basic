package day01;

import java.math.BigDecimal;

public class 浮点型_常量 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double f = 314e2; // 314*10^2-->31400.0
		double f2 = 314e-2; // 314*10^(-2)-->3.14

		// 浮点型不精确，一定不能用于比较
		float fh = 0.1f;
		double d = 1.0 / 10;
		System.out.println(fh == d);// 结果为false

		// 想要比较浮点数
//		java.math包下面的两个有用的类：BigInteger和BigDecimal

		BigDecimal bd = BigDecimal.valueOf(1.0);   //初始值为1
		bd = bd.subtract(BigDecimal.valueOf(0.1));//减0.1
		bd = bd.subtract(BigDecimal.valueOf(0.1));//减0.1
		bd = bd.subtract(BigDecimal.valueOf(0.1));//减0.1
		bd = bd.subtract(BigDecimal.valueOf(0.1));//减0.1
		bd = bd.subtract(BigDecimal.valueOf(0.1));//减0.1
		System.out.println(bd);// 0.5
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);// 0.5000000000000001

		
		
		BigDecimal bd2 = BigDecimal.valueOf(0.1);   //初始值为1
		BigDecimal bd3 = BigDecimal.valueOf(1.0 / 10);   //初始值为1
		System.out.println(bd2.equals(bd3));
		
	}

}
