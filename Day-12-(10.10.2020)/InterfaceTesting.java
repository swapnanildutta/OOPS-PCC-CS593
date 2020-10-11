package specialtest;

interface X { int a = 10; void disp1(); }
interface Y { int b = 20; void disp2(); }
interface Z extends X, Y {  int c = 30; void disp3(); }
class P { int d = 40; }

class Q implements X, Y { 
    public void disp1() {  System.out.println("a = " + a);  }
    public void disp2() {  System.out.println("b = " + b);  }
}

class R extends P implements Z { 
    public void disp1() {  System.out.println("a = " + a);  }
    public void disp2() {  System.out.println("b = " + b);  }
    public void disp3() {  System.out.println("c = " + c);  }
    void show() {
        System.out.println("d = " + d); 
    }
}

//Not allowed in Java
//class R implements Z extends P { }

public class InterfaceTesting {

    public static void main(String[] args) {
        X x;
        Y y;
        Z z;
        Q q = new Q();
        q.disp1();
        q.disp2();
        System.out.println();
        R r = new R();
        r.disp1();
        r.disp2();
        r.disp3();
        r.show();
    }
}
