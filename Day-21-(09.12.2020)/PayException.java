import java.io.*;
import java.util.Scanner;
public class PayException {
    public static void main(String[] args)
    {
        int sal;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
        sal=sc.nextInt();
        try{
        if(sal<10000)
        {
            throw new PayOutOfBoundsException();
        }
        else
        {
            System.out.println("Your Bonus-"+(0.35*sal));
        }
    }
    catch(PayOutOfBoundsException e)
    {
        System.out.println(e);
    }
    }

}
class PayOutOfBoundsException extends Exception {
    PayOutOfBoundsException() {

    }
    public String toString() {
        return "PayOutOfBoundsException: Pay cannot be less than 10000";
    }
}
