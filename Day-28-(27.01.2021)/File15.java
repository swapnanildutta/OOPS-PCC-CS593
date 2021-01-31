import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class File15 {

    public static void main(String[] args) throws Exception {
        try {
            Scanner input = new Scanner(new File("input.txt"));
            String in = "";
            in = input.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        // StringTokenizer test
        StringTokenizer st = new StringTokenizer("this is a test");
        System.out.println("\nStringTokenizer test result:~ ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
