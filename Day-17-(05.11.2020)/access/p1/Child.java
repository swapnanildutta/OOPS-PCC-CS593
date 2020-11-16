package p1; // User defined package

public class Child extends Parent {
    // constructor
    public Child() {
        System.out.println("\nChild class constructor");
        // System.out.println("Data Private = " + data_private);
        System.out.println("Data Default = " + data_default);
        System.out.println("Data Protected = " + data_protected);
        System.out.println("Data Public = " + data_public);
    }
}
