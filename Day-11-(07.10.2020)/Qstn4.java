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

public class Qstn4{
    public static void main(String[] args) {
        Grandparent a = new Grandparent();
        a.show();
        Parent b = new Parent();
        b.show();
        Child c = new Child();
        c.show();
    }
}