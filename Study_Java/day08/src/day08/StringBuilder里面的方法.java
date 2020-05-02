package day08;

public class StringBuilder里面的方法 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<26;i++) {
			char temp = (char)('a'+i);
			sb.append(temp);
		}
		System.out.println(sb);//"a-j"
		
		sb.reverse();//倒过来排序
		System.out.println(sb);
		
		sb.setCharAt(3, '高');
		System.out.println(sb);
		
		//在指定位置添加一个字符
		sb.insert(0, '我');
		//该方法可以链式调用
		sb.insert(0, '他').insert(6, 'y');
		System.out.println(sb);
		
		//删除
		sb.delete(20, 23).delete(1, 3);
		System.out.println(sb);
		
		
		
	}
	
}
