package day04;


//重点            -------》java的类没有多继承，但java的接口有多继承



interface A {
    void testa();
}
interface B {
    void testb();
}


/**接口可以多继承：接口C继承接口A和B*/
interface C extends A, B {
    void testc();
}
public class  接口多继承 implements C {
    public void testc() {
    }
    public void testa() {
    }
    public void testb() {
    }
}