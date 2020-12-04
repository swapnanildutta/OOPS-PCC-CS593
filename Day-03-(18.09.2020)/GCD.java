import java.util.Scanner;

public class GCD {
    public static int getgcd(int a, int b){
        if(b != 0)
            return getgcd(b, a % b);
        return a;
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Enter the value of b: ");
        int b = Integer.parseInt(input.nextLine());
        if(a < b){
            a = a + b;
            b = a - b;
            a = a - b;
        }
        System.out.printf("The GCD of %d and %d: %d", a , b , getgcd(a , b));
    }
}