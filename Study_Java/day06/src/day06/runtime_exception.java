package day06;

public class runtime_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		运行时异常,多数为程序逻辑处理出现的异常
		
		
		
//		ArithmeticException异常：试图除以0

        int b=0;
//        System.out.println(1/b);
			if(b!=0){
	            System.out.println(1/b);
	        }
			
			
//			NullPointerException异常
//			String str=null;
//			System.out.println(str.charAt(0));
			String str=null;
	        if(str!=null){
	            System.out.println(str.charAt(0));
	        }
			
        
//	        ClassCastException异常
	        Animal a=new Dog();
	        if(a instanceof Cat) {
	        Cat c=(Cat)a;
	        }
	}

}

class Animal{
    
}
class Dog extends Animal{
     
}
class Cat extends Animal{
     
}
