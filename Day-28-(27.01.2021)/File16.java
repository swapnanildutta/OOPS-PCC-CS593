import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File16 {

    public static void main(String[] args) throws IOException {
        File inFile = new File("input.txt");
        File outFile = new File("output.txt");
        BufferedReader in = new BufferedReader(new FileReader(inFile));
        BufferedWriter out = new BufferedWriter(new FileWriter(outFile));
        String line;
        while ((line = in.readLine()) != null) {
            out.write(line);
            out.newLine();
        }
        in.close();
        out.close();
    }

}
