import java.io.*;
public class Ass6Q3 {
    public static void main(String[] args)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter the size of the array");
            int n=Integer.parseInt(in.readLine());
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=Integer.parseInt(in.readLine());
            }
            System.out.println("The array elements:");
            for(int i:arr)
            {
                System.out.println(i);
            }
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println(e);
        }
    }
}
