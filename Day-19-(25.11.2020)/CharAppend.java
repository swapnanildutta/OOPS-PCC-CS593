import java.io.*;

public class CharAppend {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        String str;
        System.out.println("Enter a String:");
        str = in.readLine();
        char ch[] = new char[5 + str.length()];
        ch[0] = 'H';
        ch[1] = 'e';
        ch[2] = 'l';
        ch[3] = 'l';
        ch[4] = 'o';
        str.getChars(0, str.length(), ch, 5);
        System.out.println(ch);
    }
}