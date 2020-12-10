import java.io.*;
class StringException {
    public static void main(String[] args) {
        try
        {
            String str=args[0];
            int a=Integer.parseInt(args[1]);
            int b=Integer.parseInt(args[2]);
            String newstr=new StringBuffer(str.substring(a, b)).reverse().toString();
            System.out.println("New String- "+newstr);
        }
        catch(StringIndexOutOfBoundsException e) 
        {
            System.out.println("Caught: "+e);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Caught: "+e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
