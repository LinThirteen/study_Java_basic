package day09;

public class 手工实现hashMap<K,V> {
	
	Node2[] table;
	int size;  //存放键值对的个数

	public 手工实现hashMap() {
		table = new Node2[16];	
	}
	
	public void put(K key,V value) {
		Node2 newNode = new Node2();
		newNode.hash = myHash(key.hashCode(),table.length);
		newNode.key = key;
		newNode.value = value;
		newNode.next = null;
		
		Node2 temp = table[newNode.hash];  //获取到桶的位置
		Node2 iterLast = null;  //正在遍历的最后一个元素
		boolean keyReeat = false;
		
		if(temp == null) {
			table[newNode.hash] = newNode;
			size++;
		}else {
			//此处数组元素不为空，则遍历对应链表
			while(temp!=null) {
				//判断key如果重复则覆盖
				if(temp.key.equals(key)) {
					System.out.println("key重复了！");
					keyReeat = true;
					temp.value = value;//只是覆盖value即可，其他的值保持不变。
					
					break;
				}else {
					//如果key不重复,则遍历下一个
					iterLast = temp;
					temp = temp.next;		
				}			
				if(!keyReeat) {
					iterLast.next = newNode;	
					size++;
				}
			}		
		}	
	}
	
	
	public static int myHash(int v,int length) {
		System.out.println("hash in myHash:"+(v&(length-1)));//直接位运算，效率高
		System.out.println("hash in myHash:"+(v%(length-1)));//直接位运算，效率低
		return v&(length-1);
	}
	
	
	//get方法，根据键获取值
	public V get(K key) {
		int hash = myHash(key.hashCode(),table.length);
		Object value = null;
		if(table[hash]!=null) {
			Node2 temp = table[hash];
			while(temp !=null) {
				if(temp.key.equals(key)) { //如果key相当，说明找到了对应的value
					value = temp.value;
					break;
					
				}else {
					temp = temp.next;
				}		
			}		
		}
		return (V) value;
		
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("{");
		for(int i=0;i<table.length;i++) {
			Node2 temp = table[i];
			while(temp!=null) {
				sb.append(temp.key+":"+temp.value+",");
				temp = temp.next;
			}
		}
		
		sb.setCharAt(sb.length()-1, '}');
		return sb.toString();
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		手工实现hashMap<Integer,String> m = new 手工实现hashMap<>();
		m.put(10, "aa");
		m.put(20, "bb");
		m.put(30, "cc");
		m.put(20, "sss");
		System.out.println(m);
		
//		for(int i=10;i<100;i++) { //查看数字中那些数字的hash值是相同的
//			System.out.println(i+"----"+myHash(i,16));
//		}

	}

}
