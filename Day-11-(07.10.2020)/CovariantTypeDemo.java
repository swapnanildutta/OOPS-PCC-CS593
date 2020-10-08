package javainput;

class P {  } //superclass
class Q extends P {  } //subclass

class Super {
    P method() {
        System.out.println("Super method()");
        return new P();
    }
}
class Sub extends Super {
    Q method() {
        System.out.println("Sub method()");
        return new Q();
    }
}

public class CovariantTypeDemo {

    public static void main(String[] args) {
        Super ob = new Super();
        ob.method();

        Sub obj = new Sub();
        obj.method();
    }
}