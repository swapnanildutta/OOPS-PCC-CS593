import java.io.*;

public class FindSubsequence {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        String str, search;
        System.out.println("Enter a String:");
        str = in.readLine();
        System.out.println("Enter the subsequence to be searched:");
        search = in.readLine();
        if (str.indexOf(search) != -1 ) {
            System.out.println("Subsequence found");
            System.out.println("Position : " + str.indexOf(search));
        } else {
            System.out.println("Search unsuccesfull");
        }
    }
}