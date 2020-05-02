package day03;

class Computer {
    String brand;  //品牌
}
public class 典型的类的定义 {
    // field
    int id;
    String sname;
    int age;
    
    
    Computer comp;
    
    
    void study() {
        System.out.println("我正在学习！使用我们的电脑，"+comp.brand);
    }
    
    
    //构造方法，用于创建类的对象，系统自动创建，可以不用写
    典型的类的定义() {
    }
    public static void main(String[] args) {
    	典型的类的定义 stu1 = new 典型的类的定义();
        stu1.sname = "张三";
        Computer comp1 = new Computer();
         comp1.brand = "联想";
        stu1.comp = comp1;
        stu1.study();
    }
}
