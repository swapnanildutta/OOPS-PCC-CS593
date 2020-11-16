package nestedtesting;

interface R {
    class S {
        void show() {
            System.out.println("class within interface");
        }
    }
}

public class NestedInterface03 extends R.S {
    public static void main(String[] args) {
        new NestedInterface03().show();
    }
}
