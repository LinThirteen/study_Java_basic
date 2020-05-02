package day04;

public class equals和等于方法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj;
		String str;
		User u1 = new User(100,"过期","1234");
		User u2 = new User(100,"过期","1234");
		
		
		//都为false因为地址不一样
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		
		
		//加了@Override代码后
		System.out.println(u1==u2); //false  因为不同对象
		System.out.println(u1.equals(u2)); //true  重写后只根据id判断
	
		String str1 = new String("sxt");
		String str2 = new String("sxt");
		System.out.println(str1==str2); //false  因为不同对象
		System.out.println(str1.equals(str2)); //true
	
	}

}

class User{
	int id;
	String name;
	String pwd;
	
	public User(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}


	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;  //强制转型为user类型
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}