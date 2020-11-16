package p2;

import p1.Parent;

public class OtherPackage {
    public OtherPackage() {
        Parent p = new Parent();
        System.out.println("\nOtherPackage constructor");
        // System.out.println("Data Private = " + p.data_private);
        // System.out.println("Data Default = " + p.data_default);
        // System.out.println("Data Protected = " + p.data_protected);
        System.out.println("Data Public = " + p.data_public);
    }
}
