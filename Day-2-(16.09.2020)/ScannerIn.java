import java.util.*;

public class ScannerIn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input Roll : ");
        int roll=sc.nextInt();
        System.out.print("Name : ");
        String name=new Scanner(System.in).nextLine();
        System.out.print("Enter two marks");
        double mark1=sc.nextDouble();
        double mark2=sc.nextDouble();
        System.out.println("Roll: "+roll+"\nName: "+name);
        System.out.println("Marks: "+(mark1+mark2));
        System.out.printf("Marks: %.2f (Rounded)",(mark1+mark2));
    }
}