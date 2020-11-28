package exceptiontest;

public class ExceptionTest05 {    
    public static void main(String[] args) {
         int a = 10, b = 0;
         int arr[] = new int[10];
         String str = null;
         double n = Math.random();         
         try { //outer try
             if (n < 0.3) {
                 int c = a / b;
             }
             try { //inner try
                 if (n < 0.6) {
                     arr[20] = 100;
                 } 
                 else {
                     char ch = str.charAt(0);
                 }
              } //end of inner try
              catch (ArrayIndexOutOfBoundsException e) {
                  System.out.println("Exception : " + e);
              }
           } //end of outer try
           catch (ArithmeticException e) {
               System.out.println("Exception : " + e);
           } 
           catch (NullPointerException e) {
               System.out.println("Exception : " + e);
           }

     } //end of main()

}
