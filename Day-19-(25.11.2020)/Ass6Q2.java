import java.io.*;

public class Ass6Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = "Swanmoy Nag";
            int arr[] = { 5, 6, 1, 4, 3 };
            System.out.println("Enter a number:");
            int n = Integer.parseInt(in.readLine());
            System.out.println(arr[n]);
            System.out.println(s.charAt(n));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
