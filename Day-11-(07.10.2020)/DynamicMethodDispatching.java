class Grandparent {
    void show() {
        System.out.println("Class GrandParent");
    }
}

class Parent extends Grandparent {
    @Override
    void show() {
        System.out.println("Class Parent");
    }    
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Class Child");
    }
}

public class DynamicMethodDispatching {
    public static void main(String[] args) {
        Grandparent obj;
        obj = new Grandparent();
        obj.show();
        obj = new Parent();
        obj.show();
        obj = new Child();
        obj.show();
    }
}