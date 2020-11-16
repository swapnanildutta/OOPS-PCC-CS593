package javainput;
//Use of final keyword

final class S { }  //cannot be subclassed
//class T extends S {} 

class X {
    final void show() { //cannot be overriden in subclass
        System.out.println("super");
    }
}

class Y extends X {
    //void show() {  System.out.println("sub"); }
}

public class TestFinal {
    final double pi = 3.14; //cannot be modified
    
    public static void main(String[] args) {
        TestFinal t = new TestFinal();
        //t.pi = 3.142;
    }
}
