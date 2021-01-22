import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class File07 {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter file name : ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        File f = new File(in.readLine());

        if (f.exists()) {
            boolean success = f.delete();

            if (!success) {
                System.out.println("Deletion failed.");
                System.exit(0);
            } else {
                System.out.println("File deleted.");
            }
        } else {
            System.out.println("File does not exist.");
            System.exit(0);
        }
    }
}
