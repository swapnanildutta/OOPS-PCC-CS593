abstract class Base {
    public static void show() {
        System.out.println("Base abstract class");
    }
}

public class ConcreteAbstract extends Base {
    public static void main(String[] args) {
        show();
    }
}