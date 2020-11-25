// package exceptiontest;

public class ExceptionTest01 {

    static int divide(int a, int b) { // 3
        return a / b;
    }

    static void compute(int a, int b) { // 2
        int c = divide(a, b);
        System.out.println("Result: " + c);
    }

    public static void main(String[] args) { // 1
        int a = 10, b = 0;
        // try { //exception thrower
        compute(a, b); // error-prone code: logical error
        // System.out.println("error"); //never executes
        // }
        // catch(ArithmeticException e) { //exception handler
        // System.out.println("Caught: " + e);
        // }
        compute(20, 100); // legal code
        compute(100, 5); // legal code
    }
}
