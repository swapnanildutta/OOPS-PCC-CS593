package gv;

class Animal { } //superclass
class Dog extends Animal {  } //subclass

public class TypeCasting {
    public static void main(String[] args) {
        int a = 10;
        double d = 23.5;
        System.out.println("a = " + a);
        System.out.println("d = " + d);
        // byte -> short -> int -> long -> float -> double
        // implicit typecasting or upcasting (narrower to wider type) w.r.t. primitive type
        long l = a; 
        float g = a;
        d = l;
        System.out.println("l = " + l);
        System.out.println("g = " + g);
        System.out.println("d = " + d);
        // explicit typecasting or downcasting (wider to narrower type) w.r.t. primitive type
        float f = (float) d; 
        System.out.println("f = " + f);

        Animal animal = new Dog(); //upcasting w.r.t. reference type
        Dog dog = (Dog)animal; //downcasting w.r.t. reference type
    }
}