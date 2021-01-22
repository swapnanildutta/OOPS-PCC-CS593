import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//program to copy the contents one file to another
public class File02 {
    public static void main(String[] args) {
        File f1 = null;
        File f2 = null;
        FileReader fin = null;
        FileWriter fout = null;
        try {
            f1 = new File("input.txt");
            f2 = new File("output.txt");
            fin = new FileReader(f1);
            fout = new FileWriter(f2);
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
