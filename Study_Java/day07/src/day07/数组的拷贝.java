package day07;

public class 数组的拷贝 {

	  public static void main(String args[]) {
	        String[] s = {"阿里","尚学堂","京东","搜狐","网易"}; 
	        String[] sBak = new String[6];
	        //	tatic void arraycopy(object src，int srcpos，object dest， int destpos，int length)方法，
//	        	该方法可以将 src 数组里的元素值赋给 dest 数组的元素，其中srcpos指定从src数组的第几个元素开始赋值，
//	        	length参数指定将src数组的多少个元素赋给dest数组的元素。
	        System.arraycopy(s,0,sBak,0,s.length);
	        for (int i = 0; i < sBak.length; i++) {
	            System.out.println(sBak[i]+ "\t");
	        }
	      //不同地址
	        System.out.println(s);
	        System.out.println(sBak);
	    }
}
