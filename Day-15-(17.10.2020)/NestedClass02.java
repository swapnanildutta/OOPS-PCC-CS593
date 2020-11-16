package nestedtesting;

//Demonstrate static nested class
class Out {
    static int x = 50; //static field
    int y = 25; //non-static field
    
    static class In { //static nested class
        void show() {
            System.out.println("x: " + x);
            System.out.println("y: " + new Out().y);
        }
    }
}

public class NestedClass02 {
    public static void main(String[] args) {
        Out.In ob = new Out.In();
        ob.show();
    }
}
