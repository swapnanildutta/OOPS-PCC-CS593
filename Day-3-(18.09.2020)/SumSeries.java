import java.util.Scanner;
import java.lang.Math;

public class SumSeries{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.println("Enter the value of b: ");
        int b = Integer.parseInt(scan.nextLine());
        double sum = 0.0;
        for(int i = 0; i < b; i++){
            sum += Math.pow(a,i);
        }
        System.out.println("Sum of the series is: " + String.format("%.2f", sum));
    }
}