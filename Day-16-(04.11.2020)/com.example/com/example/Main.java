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
 * 
 * jar -cvmf manifest.txt sample.jar com\*
 * 
 * PS D:\OOPS-PCC-CS593\Day-16-(04.11.2020)\com.example> jar -cvmf manifest.txt
 * sample.jar com\* added manifest adding: com/example/(in = 0) (out= 0)(stored
 * 0%) adding: com/example/A.class(in = 404) (out= 292)(deflated 27%) adding:
 * com/example/A.java(in = 125) (out= 110)(deflated 12%) adding:
 * com/example/B.class(in = 401) (out= 291)(deflated 27%) adding:
 * com/example/B.java(in = 122) (out= 108)(deflated 11%) adding:
 * com/example/C.class(in = 403) (out= 288)(deflated 28%) adding:
 * com/example/C.java(in = 124) (out= 105)(deflated 15%) adding:
 * com/example/Main.class(in = 478) (out= 335)(deflated 29%) adding:
 * com/example/Main.java(in = 612) (out= 338)(deflated 44%) adding:
 * com/example/X.class(in = 404) (out= 285)(deflated 29%) PS
 * D:\OOPS-PCC-CS593\Day-16-(04.11.2020)\com.example> java -jar sample.jar Name
 * = Linus Torvalds Product = Linux OS Job = S/W Developer Country = Finland
 */