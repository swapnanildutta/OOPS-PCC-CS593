package exceptiontest;

//multiple catch blocks
public class ExceptionTest03 {
    
    public static void main(String[] args) {
        int a = 10, b = 0, c, n;
        int arr[] = new int[10];
        String str = null;
        double r = Math.random();
        
        try {
            if(r < 0.3)
                c = a / b; //creating ArithmeticException
            else if(r < 0.6)
                arr[20] = 100; //creating ArrayIndexOutOfBoundsException
            else
                n = str.length(); //creating NullPointerException
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) { 
            System.out.println(e); 
        }
    }
}
