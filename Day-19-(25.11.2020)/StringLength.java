import java.io.*;

public class StringLength {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        String str;
        System.out.println("Enter a String:");
        str = in.readLine();
        System.out.println("Length with space: " + str.length());
        System.out.println("Length without space: " + str.trim().length());
    }
}