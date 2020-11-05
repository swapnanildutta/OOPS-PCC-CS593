class A {
    A() {
        System.out.println("Super constructor");
    }

    // Super Initializer block
    {
        System.out.println("Super Initializer block");
    }
    static {
        System.out.println("Super static block");
    }
}

// static blocks are called when a class is loaded into jvm
class B extends A {
    B() {
        System.out.println("Sub constructor");
    }

    // Sub Initializer block
    {
        System.out.println("Sub Initializer block");
    }
    static {
        System.out.println("Sub static block");
    }
}

public class BlockTest2 {
    public static void main(String[] args) {
        new B();
    }
}