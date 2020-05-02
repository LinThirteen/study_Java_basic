package 多线程;

public class day7多线程的静态代理 {
	
	public static void main(String[] args) {
		new Wedding(new you()).happyMarry();
	}
}

interface Marry{
	void happyMarry();
	}

class you implements Marry{

	@Override
	public void happyMarry() {
		System.out.println("终于成仙了！");
		
	}	
}


//代理角色
class Wedding implements Marry{

	//真实角色
	private Marry target;
	
	
	public Wedding(Marry target) {
		super();
		this.target = target;
	}


	@Override
	public void happyMarry() {
		// TODO Auto-generated method stub
		ready();
		this.target.happyMarry();
		after();
		
	}


	private void after() {
		// TODO Auto-generated method stub
		System.out.println("成功");
	}


	private void ready() {
		// TODO Auto-generated method stub
		System.out.println("布置");
	}

	
}