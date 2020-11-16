package nestedtesting;

interface D { //superinterface
    void disp();
}

public class Nest {
    D d = new D() { //anonymous inner class
        @Override
        public void disp() {
            System.out.println("hello");
            msg();
        }
        public void msg() {
            System.out.println("hi");
        }
    };

    public static void main(String args[]) {
        Nest an = new Nest();
        an.d.disp();
    }
}
