import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Display data directly from a file while output device is the monitor
public class File03 {

    public static void main(String[] args) {
        File f = null;
        FileReader fin = null;

        try {
            f = new File("input.txt");
            fin = new FileReader(f);
            int ch;

            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
