interface one {
    void method1();
    void method2();
}
interface two {
    void method3();

    void method4();
}
interface three extends one, two {
    void method5();
}
class A {
    int a = 5;
}
class B extends A implements three {
    public void method1() {
        System.out.println("This is method 1");
    }
    public void method2() {
        System.out.println("This is method 2");
    }
    public void method3() {
        System.out.println("This is method 3");
    }
    public void method4() {
        System.out.println("This is method 4");
    }
    public void method5() {
        System.out.println("This is method 5");
    }
    public void print() {
        System.out.println("Value : " + a);
    }
}
public class Program3 {
    public static void main(String[] args) {
        B b1 = new B();
        b1.method1();
        b1.method2();
        b1.method3();
        b1.method4();
        b1.method5();
        b1.print();
    }
}