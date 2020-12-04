import java.io.FileNotFoundException;
import java.io.IOException;

//Java throws with method overriding
class Super {
    void show() throws IOException {
        System.out.println("super class");
    }
}

class Sub extends Super {
    void show() throws FileNotFoundException {
        System.out.println("sub class");
    }
}

public class ExceptionTest08 {
    public static void main(String[] args) {

    }
}
