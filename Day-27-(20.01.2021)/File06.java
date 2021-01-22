import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class File06 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter File name : ");
        String str = in.readLine();
        File file = new File(str);
        RandomAccessFile rand = null;

        if (!file.exists()) {
            System.out.println("File does not exist.");
            System.exit(0);
        }

        // Open the file for both reading and writing
        try {
            rand = new RandomAccessFile(file, "rw");
            rand.seek(file.length()); // Seek to end of file
            rand.writeBytes("Its Good Bye from Me."); // Write end of file
            System.out.println("Written Successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            rand.close();
        }

        // Open the file for reading only
        try {
            rand = new RandomAccessFile(file, "r");
            int n = (int) rand.length();
            System.out.println("Length: " + n);
            rand.seek(0); // Seek to start point of file

            System.out.println("\nFile Contents:~ ");
            for (int i = 0; i < n; i++) {
                byte b = rand.readByte(); // read byte from the file
                System.out.print((char) b); // convert byte into char
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            rand.close();
        }

    }
}
