
// Checking whether a file or directory
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class File12 {

    public static void main(String[] args) throws IOException {

        System.out.print("Enter file or directory name : ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        File name = new File(in.readLine());

        if (name.isFile()) {
            System.out.println("It is a file");
        } else if (name.isDirectory()) {
            System.out.println("It is a directory");
        } else {
            System.out.println("Neither file nor directory!");
        }
    }
}
