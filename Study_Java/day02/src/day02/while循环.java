package day02;

public class while循环 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  i = 0;
        int  sum = 0;
        // 1+2+3+…+100=?
        while (i <= 100) {
            sum += i;//相当于sum = sum+i;
            i++;
        }
        System.out.println("Sum= " + sum);
	}

}
