package p2;

import p1.Parent;

public class Child2 extends Parent {
    public Child2() {
        System.out.println("\nChild2 class constructor");
        // System.out.println("Data Private = " + data_private);
        // System.out.println("Data Default = " + data_default);
        System.out.println("Data Protected = " + data_protected);
        System.out.println("Data Public = " + data_public);
    }
}
