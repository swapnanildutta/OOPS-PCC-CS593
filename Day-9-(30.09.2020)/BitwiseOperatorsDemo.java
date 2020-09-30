package basicjava;

public class BitwiseOperatorsDemo {

    public static void main(String[] args) {
        int x = 10; //00001010
        int y = 4;
        System.out.println("Bit-wise AND: " + (x & y)); //0
        System.out.println("Bit-wise  OR: " + (x | y)); //14
        System.out.println("Bit-wise NOT: " + (~x));    //-11
        System.out.println("Bit-wise XOR: " + (x ^ y)); //14
        System.out.println("Bit-wise right shift: " + (x >> 2)); // 2=>00000010
        System.out.println("Bit-wise  left shift: " + (x << 2)); //40=>00101000
    }
}
