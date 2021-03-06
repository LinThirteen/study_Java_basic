package day03;

public class 垃圾回收机制_garbage_collection {
	public static void main(String[] args) {
		
		
//		　任何一种垃圾回收算法一般要做两件基本事情：
//
//		　　1. 发现无用的对象
//
//		　　2. 回收无用对象占用的内存空间。
		
//		通用的分代垃圾回收机制
		
		
//		1. 年轻代
//
//		　　所有新生成的对象首先都是放在Eden区。 年轻代的目标就是尽可能快速的收集掉那些生命周期短的对象，对应的是Minor GC，每次 Minor GC 会清理年轻代的内存，算法采用效率较高的复制算法，频繁的操作，但是会浪费内存空间。当“年轻代”区域存放满对象后，就将对象存放到年老代区域。
//
//		　　2. 年老代
//
//		　　在年轻代中经历了N(默认15)次垃圾回收后仍然存活的对象，就会被放到年老代中。因此，可以认为年老代中存放的都是一些生命周期较长的对象。年老代对象越来越多，我们就需要启动Major GC和Full GC(全量回收)，来一次大扫除，全面清理年轻代区域和年老代区域。
//
//		　　3. 持久代
//
//		　　用于存放静态文件，如Java类、方法等。持久代对垃圾回收没有显著影响。
		
		
//		　·Minor GC:
//
//			　　用于清理年轻代区域。Eden区满了就会触发一次Minor GC。清理无用对象，将有用对象复制到“Survivor1”、“Survivor2”区中(这两个区，大小空间也相同，同一时刻Survivor1和Survivor2只有一个在用，一个为空)
//
//			　　·Major GC：
//
//			　　用于清理老年代区域。
//
//			　　·Full GC：
//
//			　　用于清理年轻代、年老代区域。 成本较高，会对系统性能产生影响。
		
//		
//		垃圾回收过程：
//
//	    1、新创建的对象，绝大多数都会存储在Eden中，
//
//	    2、当Eden满了（达到一定比例）不能创建新对象，则触发垃圾回收（GC），将无用对象清理掉，
//
//	           然后剩余对象复制到某个Survivor中，如S1，同时清空Eden区
//
//	    3、当Eden区再次满了，会将S1中的不能清空的对象存到另外一个Survivor中，如S2，
//
//	          同时将Eden区中的不能清空的对象，也复制到S1中，保证Eden和S1，均被清空。
//
//	    4、重复多次(默认15次)Survivor中没有被清理的对象，则会复制到老年代Old(Tenured)区中，
//
//	    5、当Old区满了，则会触发一个一次完整地垃圾回收（FullGC），之前新生代的垃圾回收称为（minorGC）
	}

}
