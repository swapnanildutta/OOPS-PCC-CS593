package nestedtesting;

class X {
    interface Y {
        void show();
    }
}

class Z implements X.Y {
    @Override
    public void show() {
        System.out.println("interface within class");
    }    
}

public class NestedInterface01 {
    public static void main(String[] args) {
        X.Y ob = new Z();
        ob.show();
    }
}
