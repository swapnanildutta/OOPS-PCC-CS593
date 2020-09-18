import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the principal ammount: ");
        Double principal = Double.parseDouble(reader.nextLine());
        System.out.println("Enter the time period: ");
        Double time = Double.parseDouble(reader.nextLine());
        System.out.println("Enter the rate of interest: ");
        Double rate = Double.parseDouble(reader.nextLine());
        Double simpleinterest = (principal*time*rate)/100;
        System.out.println("Your simple interest is: " + simpleinterest);
    }
}