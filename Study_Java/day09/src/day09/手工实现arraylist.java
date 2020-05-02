package day09;

import javax.management.RuntimeErrorException;

//public class 手工实现arraylist {
//	
//	
//	public Object[] elementData;
//	public int size;  //默认为0
//	
//	//默认长度
//	private static final int DEFALT_CAPACITY=10;
//	
//	
//	//方法重载，构造器
//	public 手工实现arraylist(){
//		//默认长度
//		elementData = new Object[DEFALT_CAPACITY];
//		
//		
//	}
//	
//	
//	public 手工实现arraylist(int capacity) {
//		
//		elementData = new Object[capacity];
//	}
//	
//	
//	public void add(Object obj) {
//		elementData[size++] = obj;  
//	}
//
//	
//	//为了使数据可视化，可以重写父类的tostring方法
//	@Override
//	public String toString() {
//		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append("[");
//		for(int i=0;i<size;i++) {
//			sb.append(elementData[i]+",");
//		}
//		sb.setCharAt(sb.length()-1,']'); //替换,一定为字符
//		
//		return sb.toString();
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		手工实现arraylist s1 = new 手工实现arraylist(20);
//		s1.add("aa");
//		s1.add("bb");
//		System.out.println(s1);//day09.手工实现arraylist@15db9742
//	}
//
//}







////加泛型
//public class 手工实现arraylist<E> {   //加入泛型代表什么类型的数据都可以接收
//	
//	
//	public Object[] elementData;
//	public int size;  //默认为0
//	
//	//默认长度
//	private static final int DEFALT_CAPACITY=10;
//	
//	
//	//方法重载，构造器
//	public 手工实现arraylist(){
//		//默认长度
//		elementData = new Object[DEFALT_CAPACITY];
//		
//		
//	}
//	
//	
//	public 手工实现arraylist(int capacity) {
//		
//		elementData = new Object[capacity];
//	}
//	
//	
//	public void add(E element) {
//		elementData[size++] = element;  
//	}
//
//	
//	//为了使数据可视化，可以重写父类的tostring方法
//	@Override
//	public String toString() {
//		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append("[");
//		for(int i=0;i<size;i++) {
//			sb.append(elementData[i]+",");
//		}
//		sb.setCharAt(sb.length()-1,']'); //替换,一定为字符
//		
//		return sb.toString();
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		手工实现arraylist s1 = new 手工实现arraylist(20);
//		s1.add(5);
//		s1.add(6);
//		s1.add("yyy");
//		s1.add(']');
//		System.out.println(s1);//day09.手工实现arraylist@15db9742
//	}
//
//}







//增加数组扩容
//public class 手工实现arraylist<E> {   //加入泛型代表什么类型的数据都可以接收
//	
//	
//	public Object[] elementData;
//	public int size;  //默认为0
//	
//	//默认长度
//	private static final int DEFALT_CAPACITY=10;
//	
//	
//	//方法重载，构造器
//	public 手工实现arraylist(){
//		//默认长度
//		elementData = new Object[DEFALT_CAPACITY];
//		
//		
//	}
//	
//	
//	public 手工实现arraylist(int capacity) {
//		
//		elementData = new Object[capacity];
//	}
//	
//	
//	public void add(E element) {
//		
//		//什么时候扩容
//		if(size == elementData.length) {
//			//怎么扩容
//			Object[]  newArray = new Object[elementData.length+( elementData.length >>1)]; //10+5
//		
//			//拷贝
//			System.arraycopy(elementData,0,newArray,0,elementData.length);
//			elementData = newArray;	
//		
//		}	
//		
//		elementData[size++] = element;  
//	}
//
//	
//	//为了使数据可视化，可以重写父类的tostring方法
//	@Override
//	public String toString() {
//		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append("[");
//		for(int i=0;i<size;i++) {
//			sb.append(elementData[i]+",");
//		}
//		sb.setCharAt(sb.length()-1,']'); //替换,一定为字符
//		
//		return sb.toString();
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		手工实现arraylist s1 = new 手工实现arraylist(20);
//		s1.add(5);
//		s1.add(6);
//		s1.add("yyy");
//		s1.add(']');
//		System.out.println(s1);//day09.手工实现arraylist@15db9742
//	}
//
//}







////增加set和get方法
////增加：数组边界的检查
//public class 手工实现arraylist<E> {   //加入泛型代表什么类型的数据都可以接收
//	
//	
//	public Object[] elementData;
//	public int size;  //默认为0
//	
//	//默认长度
//	private static final int DEFALT_CAPACITY=10;
//	
//	
//	//方法重载，构造器
//	public 手工实现arraylist(){
//		//默认长度
//		elementData = new Object[DEFALT_CAPACITY];
//		
//		
//	}
//	
//	
//	public 手工实现arraylist(int capacity) {
//		
//		if(capacity<0) {
//			throw new RuntimeException("容量不能为负数");
//		}else if(capacity == 0){
//			
//			elementData = new Object[DEFALT_CAPACITY];
//		}else {
//			elementData = new Object[capacity];
//		}
//		
//	}
//	
//	
//	public void add(E element) {
//		
//		//什么时候扩容
//		if(size == elementData.length) {
//			//怎么扩容
//			Object[]  newArray = new Object[elementData.length+( elementData.length >>1)]; //10+5
//		
//			//拷贝
//			System.arraycopy(elementData,0,newArray,0,elementData.length);
//			elementData = newArray;	
//		
//		}	
//		
//		elementData[size++] = element;  
//	}
//	
//	
//	//get方法
//	public E get(int index) {
//		
//		checkRange(index);
//		
////		return (E)elementData[(int) element];
//		return (E)elementData[index];
//	}
//	
//	
//	
//	public void checkRange(int index) {
//		//索引合法判断[0,s)
//		if(index <0 || index>size-1) {
//			//不合法
//			throw new RuntimeException("索引不合法！"+index);
//		}
//			
//	}
//	
//	
//	//set
//	public void set(E element,int index) {
//		
//		checkRange(index);
//		
//		elementData[index] = element;
//	}
//	
//	
//	
//
//	
//	//为了使数据可视化，可以重写父类的tostring方法
//	@Override
//	public String toString() {
//		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append("[");
//		for(int i=0;i<size;i++) {
//			sb.append(elementData[i]+",");
//		}
//		sb.setCharAt(sb.length()-1,']'); //替换,一定为字符
//		
//		return sb.toString();
//	}
//	
//	
//	public static void main(String[] args) {
//		
//		手工实现arraylist s1 = new 手工实现arraylist(20);
//		s1.add(5);
//		s1.add(6);
//		s1.add("yyy");
//		s1.add(']');
//		System.out.println(s1);//day09.手工实现arraylist@15db9742
//	}
//
//}











//完善remove的两种方法
public class 手工实现arraylist<E> {   //加入泛型代表什么类型的数据都可以接收
	
	
	public Object[] elementData;
	public int size;  //默认为0
	
	//默认长度
	private static final int DEFALT_CAPACITY=10;
	
	//方法重载，构造器
	public 手工实现arraylist(){
		//默认长度
		elementData = new Object[DEFALT_CAPACITY];
		
	}
	
	public boolean isEmpty() {
		
		return size==0?true:false;
	}
	
	
	public 手工实现arraylist(int capacity) {
		
		if(capacity<0) {
			throw new RuntimeException("容量不能为负数");
		}else if(capacity == 0){
			
			elementData = new Object[DEFALT_CAPACITY];
		}else {
			elementData = new Object[capacity];
		}	
	}
	
	public void add(E element) {
		
		//什么时候扩容
		if(size == elementData.length) {
			//怎么扩容
			Object[]  newArray = new Object[elementData.length+( elementData.length >>1)]; //10+5
		
			//拷贝
			System.arraycopy(elementData,0,newArray,0,elementData.length);
			elementData = newArray;	
		
		}			
		elementData[size++] = element;  
	}
	
	
	//get方法
	public E get(int index) {
		
		checkRange(index);
		
//		return (E)elementData[(int) element];
		return (E)elementData[index];
	}
	
		
	//set
	public void set(E element,int index) {
		
		checkRange(index);
		
		elementData[index] = element;
	}
	
	//remove
	public void remove(E element) {
		//element.将它和所有的元素挨个比较，获得一个比较true,返回
		for(int i =0;i<size;i++) {
			if(element.equals(get(i))) {//容器中所有的比较操作，都是用equals而不是==
				
				//将该元素从此处移除？？？
			removes(i);
				
				
				
			}
		}
	}
	
	public void removes(int index) {
		
		int numMoved = elementData.length-index-1;
		if (numMoved>0) {
		System.arraycopy(elementData,index+1,elementData,index,numMoved);	
		}
		elementData[--size]=null;
		
	}
	
	
	
	public void checkRange(int index) {
		//索引合法判断[0,s)
		if(index <0 || index>size-1) {
			//不合法
			throw new RuntimeException("索引不合法！"+index);
		}		
	}
	
	

		
	
	//为了使数据可视化，可以重写父类的tostring方法
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(elementData[i]+",");
		}
		sb.setCharAt(sb.length()-1,']'); //替换,一定为字符
		
		return sb.toString();
	}
	
	
	
	public static void main(String[] args) {
		
		手工实现arraylist s1 = new 手工实现arraylist(20);
		s1.add(5);
		s1.add(6);
		s1.add("yyy");
		s1.add(']');
		System.out.println(s1);//day09.手工实现arraylist@15db9742
		
		
		s1.remove(']');
		s1.removes(0);
		System.out.println(s1);
	}

}













