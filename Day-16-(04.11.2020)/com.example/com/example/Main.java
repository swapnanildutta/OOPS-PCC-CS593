package com.example;

class X extends A {
    void product() {
        System.out.println("Product = Linux OS");
    }
}

public class Main {
    public static void main(String[] args) {
        X x = new X();
        x.name();
        x.product();

        B b = new B();
        b.job();

        C c = new C();
        c.country();
    }
}

/*
 * PS D:\OOPS-PCC-CS593\Day-16-(04.11.2020)\com.example> java com.example.Main
 * Name = Linus Torvalds
 * 
 * Product = Linux OS
 * 
 * Job = S/W Developer
 * 
 * Country = Finland
 */