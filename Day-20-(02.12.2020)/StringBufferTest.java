import java.io.*;

public class StringBufferTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        StringBuffer s = new StringBuffer("Object Programming Languages");
        System.out.println(s + " Length-" + s.length() + " Capacity-" + s.capacity());
        s.insert(7, "Oriented ");
        System.out.println(s);
        s.insert(5, "-");
        System.out.println(s);
        s.append(" are very popular");
        System.out.println(s);
        s.deleteCharAt(5);
        s.insert(5, " ");
        System.out.println(s);
        s.delete(1, 7);
        System.out.println(s);
        s.delete(2, 10);
        System.out.println(s);
        s.delete(3, 13);
        System.out.println(s);
        String str = s.toString();
        System.out.println(str);
    }
}
