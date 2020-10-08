package javainput;

// public > protected > default > private
class Parent {
    protected void disp() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    protected void disp() {
        System.out.println("Child class");
    }
}

public class OverrideAccess {

    public static void main(String[] args) {
        Parent p; //superclass reference
        p = new Parent(); //object of superclass
        p.disp();
        p = new Child(); //object of subclass
        p.disp();
    }
}
