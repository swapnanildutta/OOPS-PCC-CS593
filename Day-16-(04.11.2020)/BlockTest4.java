class A1 {
    A1() {
        System.out.println("Super constructor");
    }

    {
        System.out.println("Super Initializer block");
    }
    static {
        System.out.println("Super static block");
    }
}

// static blocks are called when a class is loaded into jvm
class B1 extends A1 {
    B1() {
        System.out.println("Sub constructor");
    }

    {
        System.out.println("Sub Initializer block");
    }
    static {
        System.out.println("Sub static block");
    }
}

public class BlockTest4 {
    public static void main(String[] args) {
        new B1();
    }
}