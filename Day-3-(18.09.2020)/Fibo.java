import java.util.Scanner;

class Fibo{
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int n){
       if(n>0){

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(n-1);
        }
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter the value of n: ");
        int n= Integer.parseInt(input.nextLine());
        System.out.print(n1+" "+n2);
        printFibonacci(n-2);
    }
}