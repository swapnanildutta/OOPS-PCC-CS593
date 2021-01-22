import java.io.File;
import java.io.FileInputStream; //subclass of InputStream
import java.io.FileOutputStream; //subclass of OutputStream
import java.io.IOException;

//program to copy the contents one file to another
public class File01 {
    public static void main(String[] args) {
        File f1 = null;
        File f2 = null;
        FileInputStream fin = null;
        FileOutputStream fout = null;
        try {
            f1 = new File("input.txt");
            f2 = new File("output.txt");
            fin = new FileInputStream(f1);
            fout = new FileOutputStream(f2);
            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fin.close();
                fout.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
