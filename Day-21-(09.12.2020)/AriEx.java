import java.io.*;
public class AriEx {
    public static void main(String[] args)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter two numbers");
            int a=Integer.parseInt(in.readLine());
            int b=Integer.parseInt(in.readLine());
            System.out.println(a/b);
            System.out.println(6/3);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmatic Exception");
        }
        finally
        {
            System.out.println("Finally Block always executes");
        }

    }
}
