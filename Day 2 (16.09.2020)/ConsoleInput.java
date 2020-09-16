import java.io.Console;

public class ConsoleInput {
    public static void main(String[]args){
        Console reader = System.console();
        System.out.println("Enter name: ");
        String a = reader.readLine();
        System.out.println("Enter roll: ");
        int b = Integer.parseInt(reader.readLine());
        System.out.println("Enter Marks: ");
        double d1 = Double.parseDouble(reader.readLine());
        double d2 = Double.parseDouble(reader.readLine());
        System.out.println("Name= " + a);
        System.out.println("Roll= " + b);
        System.out.println("Total Marks= "+(d1+d2));
    }
}