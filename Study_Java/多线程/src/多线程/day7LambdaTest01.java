package 多线程;


//Lambda推导


public class day7LambdaTest01 {
	
	static class Like2 implements ILike{

		@Override
		public void Lambda() {
			// TODO Auto-generated method stub
			System.out.println("i like lambda2");
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		ILike like = new Like();
		like.Lambda();
		System.out.println(like.getClass().getName());
		like = new Like2();
		like.Lambda();
		System.out.println(like.getClass().getName());
		
		like = new ILike() {
			public void Lambda() {
				// TODO Auto-generated method stub
				System.out.println("i like lambda3");
			}
		};	
		like.Lambda();
		System.out.println(like.getClass().getName());
		
		class Like3 implements ILike{

			@Override
			public void Lambda() {
				// TODO Auto-generated method stub
				System.out.println("i like lambda31");
			}		
		}
		
		like = new Like3();
		like.Lambda();
		System.out.println(like.getClass().getName());
		
		//lambda  保证ILike中只有一个接口
		like = ()->{
			System.out.println("i like lambda4");
		};
		like.Lambda();
	}
}

interface ILike{
	void Lambda();
}

class Like implements ILike{

	@Override
	public void Lambda() {
		// TODO Auto-generated method stub
		System.out.println("i like lambda1");
	}
	
}