package day07;

public class 数组的拷贝与删除 {

	public static void main(String[] args) {

		// 数组的拷贝
		// 将src数组拷贝到dest数组,拷贝的长度为从srcpos+length,destPosb表示从dest号位置开始放
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		testBasicCopy02();
		 extendRange01();

	}

	public static void testBasicCopy() {

		String[] s1 = { "aa", "bb", "Cc", "dd", "ee" };
		String[] s2 = new String[10];

		System.arraycopy(s1, 2, s2, 6, 3);

		for (int i = 0; i < s2.length; i++) {
			System.out.println(i + "==" + s2[i]);

		}
	}

	// 从数组中删除某个元素，本质上还是数组的拷贝
	public static void testBasicCopy02() {

		String[] s1 = { "aa", "bb", "Cc", "dd", "ee" };
//		String[] s2 = new String[5];

		// 拷贝“dd","ee"。
//		System.arraycopy(s1, 3, s2, 2, 2);

		// s1自身的拷贝
		System.arraycopy(s1, 3, s1, 2, 2);// "aa", "bb", "dd", "ee","ee"
		// 将最后一个数设置为空
		s1[s1.length - 1] = null;

		for (int i = 0; i < s1.length; i++) {
			System.out.println(i + "==" + s1[i]);

		}
	}

	// 封装成方法
	public static void testBasicCopy03(String[] s1, int index) {

		System.arraycopy(s1, index + 1, s1, index, s1.length - index - 1);
		// 将最后一个数设置为空
		s1[s1.length - 1] = null;

		for (int i = 0; i < s1.length; i++) {
			System.out.println(i + "==" + s1[i]);

		}
	}

	// 数组的扩容(本质上是：先顶一个更大的数组，然后将原数组内容原封不动拷贝到新数组中）
	public static void extendRange() {

		String[] s5 = { "lin", "wen", "kang" };

		String[] s2 = new String[s5.length + 10];

		System.arraycopy(s5, 0, s2, 0, s5.length);

		for (String temp : s2) {
			System.out.println(temp);
		}
	}
	
	
	//给数组插入元素
	public static void extendRange01() {

		String[] s1 = { "lin", "wen", "kang" };
		
		String res = "mr";
		
		String[] s2 = new String[s1.length + 3];

		System.arraycopy(s1, 0, s2, 0, s1.length);
		System.arraycopy(s2, 1, s2, 2, s2.length-2);
		s2[1] = res;
		

		for (String temp : s2) {
			System.out.println(temp);
		}
	}

}
