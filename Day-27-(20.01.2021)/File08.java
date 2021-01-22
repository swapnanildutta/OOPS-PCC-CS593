import java.io.FileOutputStream;
import java.io.PrintStream;

public class File08 {

    public static void main(String args[]) {

        FileOutputStream out;
        PrintStream ps; // declare a print stream object
        try {
            // Create a new file output stream
            out = new FileOutputStream("myps.txt");
            // Connect print stream to the output stream
            ps = new PrintStream(out);
            ps.println("This data is written to a file.");
            System.out.println("Written successfully using PrintStream!");
            ps.close();
        } catch (Exception e) {
            System.err.println("Error in writing to file");
        }

    }
}
