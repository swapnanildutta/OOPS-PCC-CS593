import java.util.Scanner;

public class Prime {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start and end: ");
        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        if (start > end)
            System.out.println("Lower limit can not be greater than higher limit!!");
        System.out.println("The prime number(s) in between " + start + " and " + end + " is/are as follows");
        for (int i = start; i <= end; i++)
            if (isPrime(i))
                System.out.print(i + " ");
        System.out.println();
    }
}