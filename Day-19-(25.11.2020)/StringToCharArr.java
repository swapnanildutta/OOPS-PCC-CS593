import java.io.*;

public class StringToCharArr {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        String str;
        System.out.println("Enter a String");
        str = in.readLine();
        char ch[] = new char[str.length()];
        str.getChars(0, str.length(), ch, 0);
        System.out.println(ch);
    }
}
