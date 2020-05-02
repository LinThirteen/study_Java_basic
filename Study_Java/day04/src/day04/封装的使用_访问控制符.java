package day04;

public class 封装的使用_访问控制符 {
	
	//封装的优点
//	     1. 提高代码的安全性。
//
//	     2. 提高代码的复用性。
//
//	     3. “高内聚”：封装细节，便于修改内部代码，提高可维护性。
//
//	     4. “低耦合”：简化外部调用，便于调用者使用，便于扩展和协作。

	
	
		//访问控制符
//	    1. private 表示私有，只有自己类能访问
//
//      2. default表示没有修饰符修饰，只有同一个包的类能访问
//
//      3. protected表示可以被同一个包的类以及其他包中的子类访问
//
//      4. public表示可以被该项目的所有包中的所有类访问
	
	
	
	
	public static void main(String[] args) {
        Persons p = new Persons();
        p.name = "小红";
        p.age = -45;//年龄可以通过这种方式随意赋值，没有任何限制
        System.out.println(p);
    }
}


class Persons {
    String name;
    int age;
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}