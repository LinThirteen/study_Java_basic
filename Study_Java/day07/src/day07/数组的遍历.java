package day07;

import java.util.Arrays;

public class 数组的遍历 {

	public static void main(String[] args) {
//        int[] a = new int[4];
//        //初始化数组元素的值
//        
//        for(int i=0;i<a.length;i++){
//            a[i] = 100*i;
//        }
//        
//        //读取元素的值
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }
        
        
        
        //for -each循环
//        专门用于读取数组或集合中所有的元素，即对数组进行遍历，不能修改元素的值。
        String[] ss = { "aa", "bbb", "ccc", "ddd" };
        for (String temp : ss) {
            System.out.println(temp);
    }
        System.out.println(Arrays.toString(ss));
	}

}
