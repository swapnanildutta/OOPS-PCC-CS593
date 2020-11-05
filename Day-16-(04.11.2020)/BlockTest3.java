public class BlockTest3 {
    public static void main(String[] args) {
        new Block2();
    }
}

class Block2 {
    static int a;
    int b;

    Block2() {
        System.out.println("Constructor Block");
    }

    static {// only static fields can be accessed inside static blocks
        a = 40;
        System.out.println("a=" + a);
    }
    {
        // both static and non-static fields can be accessed inside intializer blocks
        a = 30;
        b = 50;
        System.out.println("a=" + a + " b=" + b);
    }
}