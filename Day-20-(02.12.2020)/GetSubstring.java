import java.io.*;

public class GetSubstring {
    public static void extract(String str, int n, int m) {
        String newstr = "";
        for (int i = n - 1; i < n + m - 1; i++) {
            newstr += str.charAt(i);
        }
        System.out.println("The extracted String- " + newstr);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        String str;
        System.out.println("Enter a String:");
        str = in.readLine();
        System.out.println("Enter the starting point of extraction");
        int n = Integer.parseInt(in.readLine());
        System.out.println("Enter the number of characters to be extracted");
        int m = Integer.parseInt(in.readLine());
        extract(str, n, m);
    }
}