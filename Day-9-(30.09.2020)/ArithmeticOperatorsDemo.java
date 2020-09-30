import java.util.Scanner;

public class ArithmeticOperatorsDemo {

    public static void main(String[] args) {
        int a = 100;
        int b = 5;
        int c, d;
        System.out.println("ADD: " + (a+b));
        System.out.println("SUB: " + (a-b));
        System.out.println("MUL: " + (a*b));
        System.out.println("DIV: " + (a/b));
        System.out.println("MOD: " + (a%b));
        
        //post increment or decrement
        c = b++; d = b--;
        System.out.println("Post ++: " + c); //5
        System.out.println("Post --: " + d); //6
        
        //pre increment or decrement
        c = ++b; d = --b;
        System.out.println("Pre ++: " + c); //6
        System.out.println("Pre --: " + d); //5
    }
}
