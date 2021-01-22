import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class File05 {

    public static void main(String[] args) throws IOException {
        System.out.print("Enter file name : ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(in.readLine());

        if (f.exists()) {
            // calculating number of lines in the file
            FileReader fr = new FileReader(f);
            LineNumberReader line = new LineNumberReader(fr);
            int count = 0;
            while (line.readLine() != null) {
                count++;
            }
            // calculating size of the file
            long file_size = f.length();

            System.out.println("Size of the file : " + file_size);
            System.out.println("Total line no: " + count);
        } else {
            System.out.println("File does not exist.");
            System.exit(0);
        }
    }
}
