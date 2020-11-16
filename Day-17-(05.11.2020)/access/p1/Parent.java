package p1;

public class Parent {
    // fields
    private int data_private = 1;
    int data_default = 2;
    protected int data_protected = 3;
    public int data_public = 4;

    public Parent() {
        System.out.println("\nParent class constructor");
        System.out.println("Data Private = " + data_private);
        System.out.println("Data Default = " + data_default);
        System.out.println("Data Protected = " + data_protected);
        System.out.println("Data Public = " + data_public);
    }
}
