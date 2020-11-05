class Block1 {
    public Block1() {
        System.out.println("Block1 Constructor");
    }

    // Block1 Initializer block
    {
        System.out.println("Block1 Initializer Block1");
    }
    {
        System.out.println("Block1 Initializer Block2");
    }
}

class Block2 extends Block1 {
    public Block2() {
        System.out.println("Block2 Constructor");
    }

    {
        System.out.println("Block2 Initializer Block1");
    }
    {
        System.out.println("Block2 Initializer Block2");
    }
}

public class BlockTest1 {
    public static void main(String[] args) {
        new Block2();
    }
}