package javainput;

class A { //superclass
    A() {  
        System.out.println("super constructor");  
    }
    {  
        System.out.println("super initializer block"); 
    }
    static {  
        System.out.println("super static block"); 
    }
}
class B extends A { //subclass
    B() {  
        System.out.println("sub constructor");  
    }
    {  
        System.out.println("sub initializer block"); 
    }
    static {  
        System.out.println("sub static block"); 
    }
}
public class BlockInherit {
    public static void main(String[] args) {
        new B(); //object of subclass
    }
}
