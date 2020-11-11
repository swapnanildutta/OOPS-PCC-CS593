package pTwo;

import pOne.Variable;

public class Sub {
    public static void main(String[] args) {
        Variable obj = new Variable();
        System.out.println("This is pTwo Package");
        System.out.println("Name : " + obj.name);
        System.out.println("Roll : " + obj.roll);
        obj.display();
    }
}
