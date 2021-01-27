import java.io.FileWriter;
import java.io.PrintWriter;

public class File09 {

    public static void main(String args[]) {
        FileWriter out;
        PrintWriter pw; // declare a print writer object
        try {
            // Create a new file output stream
            out = new FileWriter("mypw.txt");

            // Connect print stream to the output stream
            pw = new PrintWriter(out);
            pw.println("This data is written to a file.");
            System.err.println("Written successfully using PrintWriter!");
            pw.close();
        } catch (Exception e) {
            System.err.println("Error in writing to file");
        }

    }

}
