import java.io.*; 
import java.util.Scanner;
import java.lang.Math.*; 

class Quadratic { 
    void findRoots(int a, int b, int c) { 
     if (a == 0) { 
        System.out.println("It's a Linear Equation!"); 
        return; 
    } 
     int d  = b*b - 4*a*c; 
     double sqrt_val = Math.sqrt(Math.abs(d)); 

     if (d > 0) { 
        System.out.println("Roots are real and different \n"); 

        System.out.println((double)(-b + sqrt_val) / (2 * a) + "\n" 
                            + (double)(-b - sqrt_val) / (2 * a)); 
     } 
     else // d < 0 
     { 
        System.out.println("Roots are complex \n"); 
            return; 
        } 
    } 
public static void main(String args[]) { 
       Quadratic obj = new Quadratic(); 
       int a,b,c;
       Scanner sc= new Scanner(System.in);
       System.out.println("enter value of a , b ,c ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
       obj.findRoots(a, b, c); 
    } 
}