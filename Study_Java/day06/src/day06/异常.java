package day06;

public class 异常 {

//	 public static void main(String[] args) {
//	        //将d:/a.txt复制到e:/a.txt
//	        if("d:/a.txt"这个文件存在){
//	            if(e盘的空间大于a.txt文件长度){
//	                if(文件复制一半IO流断掉){
//	                    停止copy，输出：IO流出问题！
//	                }else{
//	                    copyFile("d:/a.txt","e:/a.txt");
//	                }
//	            }else{
//	                System.out.println("e盘空间不够存放a.txt！");
//	            }
//	        }else{
//	            System.out.println("a.txt不存在！");
//	        }
//	    }
	
	//优化异常
	
	public static void main(String[] args) {
		
		// 就是当程序出现错误，程序安全退出的机制。
//		try {
//		    copyFile("d:/a.txt","e:/a.txt");
//		} catch (Exception e) {
//		    e.printStackTrace();
//		}
		
		
		int a =1/0;
		System.out.println(a);
		
//		   Java对异常进行了分类，不同类型的异常分别用不同的Java类表示，所有异常的根类为java.lang.Throwable，Throwable下面又派生了两个子类：
//		   Error和Exception。Java异常类的层次结
		
	}
	
}
