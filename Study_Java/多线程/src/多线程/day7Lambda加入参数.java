package 多线程;


//Lambda推导


public class day7Lambda加入参数 {
	
	static class Like2 implements ILike{

		@Override
		public void Lambda() {
			// TODO Auto-generated method stub
			System.out.println("i like lambda2");
		}				
	}
		
	public static void main(String[] args) {
		
		IsLike like = (int a) ->{
			System.out.println("i like lambda -->"+a);
		};
		like.Lambda(100);
		
		
		//简化
		like=(a) ->{  //只有一个参数的情况下括号也可以忽列
			System.out.println("i like lambda -->"+a);
		};
		like.Lambda(50);
		
		
		//方法里面只有1行代码
		like = a ->System.out.println("i like lambda -->"+a);
		like.Lambda(50);
	}
}

interface IsLike{
	void Lambda(int a);
}

class sLike implements IsLike{

	@Override
	public void Lambda(int a) {
		// TODO Auto-generated method stub
		System.out.println("i like lambda1" + a);
	}
	
}