package p1; // User defined package

public class Main {
    public static void main(String[] args) {
        Parent ob1 = new Parent();
        Child ob2 = new Child();
        SamePackage ob3 = new SamePackage();
    }
}

/**
 * PS D:\OOPS-PCC-CS593\Day-17-(05.11.2020)\access> java p1.Main
 * 
 * Parent class constructor Data Private = 1 Data Default = 2 Data Protected = 3
 * Data Public = 4
 * 
 * Parent class constructor Data Private = 1 Data Default = 2 Data Protected = 3
 * Data Public = 4
 * 
 * Child class constructor Data Default = 2 Data Protected = 3 Data Public = 4
 * 
 * Parent class constructor Data Private = 1 Data Default = 2 Data Protected = 3
 * Data Public = 4
 * 
 * SamePackage constructor Data Default = 2 Data Protected = 3 Data Public = 4
 */