package pTwo;

import pOne.Sup;

public class Sub extends Sup {
    public void show() {
        System.out.println("Method from pTwo package");
    }

    public static void main(String[] args) {
        Sub obj = new Sub();
        System.out.println("This is pTwo Package");
        // System.out.println("Name : " + obj.name);
        // System.out.println("Roll : " + obj.roll);
        obj.display();
    }
}
