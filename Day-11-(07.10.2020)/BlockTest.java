//Demonstrate Java Blocks

class Block {
    int a; // instance field
    static int b; // class field

    void showA() {
        System.out.println("a = " + a);
    } // instance method

    static void showB() {
        System.out.println("b = " + b);
    } // class method

    Block() { // constructor
        a = 10;
        b = 20;
        System.out.println("constructor");
        showA();
        showB();
    }

    // initializer block
    {
        a = 30;
        b = 40;
        System.out.println("initializer block");
        showA();
        showB();
    }

    // static block
    static {
        b = 60; // a = 50;
        System.out.println("static block");
        showB(); // showA();
    }
}

public class BlockTest {
    public static void main(String[] args) {
        new Block(); // object of class Block
    }
}
