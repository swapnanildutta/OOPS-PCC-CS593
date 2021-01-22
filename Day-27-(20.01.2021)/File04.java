import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Merging contents of two files into a third one 
public class File04 {

    public static void main(String[] args) {
        File f1;
        File f2;
        File f3;
        FileReader in1 = null;
        FileReader in2 = null;
        FileWriter out = null;
        int c;

        try {
            f1 = new File("a.txt");
            f2 = new File("b.txt");
            f3 = new File("c.txt");
            in1 = new FileReader(f1);
            in2 = new FileReader(f2);
            out = new FileWriter(f3);

            // copy from 1st file
            while ((c = in1.read()) != -1) {
                out.write(c);
            }

            // copy from 2nd file
            while ((c = in2.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                in1.close();
                in2.close();
                out.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
