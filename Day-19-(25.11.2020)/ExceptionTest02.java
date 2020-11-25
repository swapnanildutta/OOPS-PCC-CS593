// package exceptiontest;

public class ExceptionTest02 {

    public static void main(String[] args) {
        int arr[] = new int[10]; // array declaration & instantiation combined

        try {
            arr[20] = 100; // illegal code
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught = " + e);
        } catch (Exception e) {
            System.out.println("Caught = " + e);
        }
    }
}
