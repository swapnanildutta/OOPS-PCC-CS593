package exceptiontest;

public class ExceptionTest09 {
    static void methodA() {
        try {
            System.out.println("Inside methodA()");
            throw new NullPointerException("except");            
        }finally {
            System.out.println("finally of methodA()");
        }        
    }
    static void methodB() {
        try {
            System.out.println("Inside methodB()");
            return;            
        }finally {
            System.out.println("finally of methodB()");
        }        
    }
    static void methodC() {
        try {
            System.out.println("Inside methodC()");       
        }finally {
            System.out.println("finally of methodC()");
        }        
    }
    public static void main(String[] args) {
        try {
            methodA();
        }
        catch(NullPointerException e) { System.out.println("Caught = " + e); }
        methodB();
        methodC();
    }
}
