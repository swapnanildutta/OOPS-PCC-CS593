import java.io.*;
public class CheckedException {
    public static void main(String[] args)
    {
        try{
            throw new IOException();
        }
        catch(IOException e)
        {
            System.out.println("Caught:"+ e);
        }
    }
}
