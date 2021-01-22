import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Store data directly into a file while input is taken from keyboard
public class File00 {
    public static void main(String[] args) {
        File f;
        FileWriter out = null;
        char c;
        try {
            f = new File("out.txt");
            out = new FileWriter(f);
            System.out.println("Enter characters (type '@' to quit): ");
            while ((c = (char) System.in.read()) != '@') {
                out.write(c);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
