package p1; // User defined package

public class SamePackage { // Non-class

    public SamePackage() {
        Parent p = new Parent();
        System.out.println("\nSamePackage constructor");
        // System.out.println("Data Private = " + p.data_private);
        System.out.println("Data Default = " + p.data_default);
        System.out.println("Data Protected = " + p.data_protected);
        System.out.println("Data Public = " + p.data_public);
    }
}
