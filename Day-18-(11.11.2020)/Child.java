package p2;

import p1.A;
public class Child implements A{
    public void show() {
        System.out.println("This is Show method");
    }
    public void show1() {
        System.out.println("This is Show1 method");
    }
    public void show2() {
        System.out.println("This is Show2 method");
    }
    public static void main(String[] args)
    {
        Child ob=new Child();
        ob.show();
        ob.show1();
        ob.show2();
    }
}
