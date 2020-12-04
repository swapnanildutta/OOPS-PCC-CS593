import java.util.Scanner;

public class Overload{
    public static void main(int a)
    {
        System.out.println("This is the int main");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = input.nextInt();
        System.out.println("This is the String args main");
        main(a);
    }
}