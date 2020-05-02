package day09;

//LinkedList底层用双向链表

//public class 手工实先ListendList1 {
//	
////	LinkedList底层用双向链表实现的存储。特点：查询效率低，增删效率高，线程不安全。
//
//	private Node first;
//	private Node last;
//	
//	private int size;
//	
//	
//	//[]
//	public void add(Object obj) {
//		Node node = new Node(obj);
//	
//	if(first == null) {
//			
//		first = node;
//		last= node;
//		
//	}else {
//		node.previous = last;
//		node.next = null;
//		
//		last.next = node;
//		last = node;		
//		
//	}
//		
//	}
//	
//	public String toString() {
//		
//		StringBuilder sb = new StringBuilder("[");
//		
//		Node temp = first;
//		while(temp != null) {
//			sb.append(temp.element+",");
//			System.out.println(temp.element);
//			temp = temp.next;
//		}
//		sb.setCharAt(sb.length()-1,']');
//		return "";
//		
//	}
//	
//	public static void main(String[] args) {
//		手工实先ListendList1 list = new 手工实先ListendList1();
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		
//		System.out.println(list);
//		
//	}
//	
//	
//	
//	
//}
//
//class Node{
//	Node previous;//上一个节点
//	Object element; //元素数据
//	Node next; //下一个节点
//	
//	//构造器
//	public Node(Node previous, Object element, Node next) {
//		super();
//		this.previous = previous;
//		this.element = element;
//		this.next = next;
//	}
//
//	public Node(Object element) {
//		super();
//		this.element = element;
//	}
//	
//	
//}

//遍历链表
public class 手工实先ListendList1<E> {

//	LinkedList底层用双向链表实现的存储。特点：查询效率低，增删效率高，线程不安全。

	private Node first;
	private Node last;

	private int size;

	public E get(int index) {
		// 对索引做判断(效率低）
		if(index<0 || index>size-1) {
			throw new RuntimeException("索引数字不合法"+index);
		}
//		Node temp = first;
//		for(int i =0;i<index;i++) {
//			temp = temp.next;		
//		}
//		return temp.element;

		// 提高效率
		Node temp =getNode(index);
			 		
		return temp!=null?(E)temp.element:null;
	}

	// []
	public void add(E element) {
		Node node = new Node(element);

		if (first == null) {

			first = node;
			last = node;

		} else {
			node.previous = last;
			node.next = null;

			last.next = node;
			last = node;

		}
		size++;
	}
	
	
	//remove
	public void remove(int index) {
		
		checkRange(index);
		Node temp = getNode(index);
		
		if (temp != null) {
			Node up = temp.previous;
			Node down = temp.next;
			
			if(up !=null) {
			up.next = down;
			}
			if(down!=null) {
			down.previous = up;
			}
			
			//如果删除第一个
			if(index == 0) {
				first = down;
			}
			
			//如果删除最后一个
			if(index == size-1) {
				last =up;
			}
			
			size--;	
		}	
	}
	

	
	//插入一个元素
	public void insert(int index,E element) {
	
		checkRange(index);
		Node temp = getNode(index);
		Node node = new Node(element);
		
		if (temp != null) {
			Node up = temp.previous;
			up.next = node;
			
			
			node.next = temp;
			
			
			node.previous = up;
			
			
			temp.previous = node;
			
			size++;	
		}	
		
		}

	private Node getNode(int index) {
		checkRange(index);
		Node temp = first;
		for (int i = 0; i < index; i++) {
			if (index <= (size >> 1)) {
			
				temp = temp.next;
			} else {
			    temp = last;
				for(i=size-1;i>index;i--) {
					temp = temp.previous;
				}
			}
		}
		return temp;
	}
	
	
	//异常封装
	private void checkRange(int index) {
		if (index>size){
			throw new RuntimeException("索引数字不合法"+index);		
			}
	}
	
	public String toString() {

		StringBuilder sb = new StringBuilder("[");

		Node temp = first;
		while (temp != null) {
			sb.append(temp.element + ",");		
			temp = temp.next;
		}
		sb.setCharAt(sb.length() - 1, ']');
		return sb.toString();

	}

	public static void main(String[] args) {
		手工实先ListendList1<String> list = new 手工实先ListendList1<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("f");
		list.add("c");

//		System.out.println(list.toString());
//		System.out.println(list.get(2));// 
//		list.remove(3);
		list.insert(2, "j");
		list.insert(3, "h");
		list.insert(3, "h");
		
		System.out.println(list.toString());
	}

}

class Node {
	Node previous;// 上一个节点
	Object element; // 元素数据
	Node next; // 下一个节点

	// 构造器
	public Node(Node previous, Object element, Node next) {
		super();
		this.previous = previous;
		this.element = element;
		this.next = next;
	}

	public Node(Object element) {
		super();
		this.element = element;
	}

}
