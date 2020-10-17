package specialtest;

// X is a supperclass of Y and Z which are siblings.
class X {} //superclass
class Y extends X {} //subclass1 of X
class Z extends X {} //subclass2 of X

//Do not try to run this code as it will generate ClassCastException
public class RuntimeCastDemo {

    public static void main(String args[]) {
        X x = new X(); //superclass object
        Y y = new Y(); //subclass object
        Z z = new Z(); //subclass object
        X xy = new Y(); // compiles ok (upcasting)
        X xz = new Z(); // compiles ok (upcasting)
        //              Y yz = new Z();   incompatible type (siblings)
        //		Y y1 = new X();   X is not a Y
        //		Z z1 = new X();   X is not a Z
        X x1 = y; // compiles ok (y is subclass of X)
        X x2 = z; // compiles ok (z is subclass of X)
        Y y1 = (Y) x; // compiles ok but produces runtime error
        Z z1 = (Z) x; // compiles ok but produces runtime error
        Y y2 = (Y) x1; // compiles and runs ok (x1 is type Y)
        Z z2 = (Z) x2; // compiles and runs ok (x2 is type Z)
        //		Y y3 = (Y) z;     inconvertible types (siblings)
        //		Z z3 = (Z) y;     inconvertible types (siblings)
        Object o = z;
        Object o1 = (Y) o; // compiles ok but produces runtime error
    }
}
