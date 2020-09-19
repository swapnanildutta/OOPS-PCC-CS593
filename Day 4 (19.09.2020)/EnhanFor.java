import java.util.Scanner;

public class EnhanFor {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int num [] = new int[n];
        double sum = 0;
        double avg = 0;
        System.out.println("Enter the elements: ");

        for(int i : num){
            num[i] = input.nextInt();
            sum += num[i];
        }
        avg = sum / num.length;
        System.out.print("Sum= " + sum + "\n");
        System.out.print("Average= " + avg);
    }
}