package day02;

import java.awt.Container;

public class for循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
        //1.求1-100之间的累加和
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Sum= " + sum);
        //2.循环输出9-1之间的数
        for(int i=9;i>0;i--){
            System.out.print(i+"、");
        }
        System.out.println();
        //3.输出90-1之间能被3整除的数
        for(int i=90;i>0;i-=3){
            System.out.print(i+"、");
        }
        System.out.println();
        
        
        
        //逗号运算符
        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
            System.out.println("i= " + i + " j= " + j); 
        } 
        
        
        
        
//        无限循环
//        for ( ; ; ) {    // 无限循环: 相当于 while(true)
//            System.out.println("北京尚学堂");
//        }
        
        
        
        
//        continue循环
        int count = 0;//定义计数器
        for (int i = 100; i < 150; i++) {
            //如果是3的倍数，则跳过本次循环，继续进行下一次循环
            if (i % 3 == 0){
                continue;
            }
            //否则（不是3的倍数），输出该数
            System.out.print(i + "、");
            count++;//没输出一个数，计数器加1
            //根据计数器判断每行是否已经输出了5个数
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        

	}

}
