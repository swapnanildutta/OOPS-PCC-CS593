package pkgTwo;

import pkgOne.Inter;

public class Imple implements Inter {
    public void show() {
        System.out.println("This is Show method");
    }

    public void show1() {
        System.out.println("This is Show1 method");
    }

    public void show2() {
        System.out.println("This is Show2 method");
    }

    public static void main(String[] args) {
        Imple ob = new Imple();
        ob.show();
        ob.show1();
        ob.show2();
    }
}
