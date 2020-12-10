import java.io.IOException;

public class CustomException {
    public static void g()throws NewException1
    {
        throw new NewException1();
    }
    public static void main(String[] args)throws IOException
    {
        try{
            try{
            g();
        }
        catch(Exception e)
        {
            System.out.println(e);
            throw new NewException2();
        }
    }
    catch(NewException2 e)
    {
        System.out.println(e);
    }
    }
}
class NewException1 extends Exception{
    NewException1(){}
    public String toString()
    {
        return "This is Exception type 1";
    }
}
class NewException2 extends Exception{
    NewException2(){}
    public String toString()
    {
        return "This is Exception type 2";
    }
} 
