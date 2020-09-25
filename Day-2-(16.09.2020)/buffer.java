import java.io.*;

public class buffer{
    public static void main(String[] args) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter two decimal values:");
        String s1 = br.readLine();
        String s2 = br.readLine();
        Double d1 = Double.parseDouble(s1);
        Double d2 = Double.parseDouble(s2);
        System.out.println("First: "+d1+"\nSecond: "+d2);
        System.out.println("Sum: "+(d1+d2));
        System.out.printf("Sum: %.2f",(d1+d2));
    }
}