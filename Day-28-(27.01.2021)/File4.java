import java.io.File;

public class File4 {
    public static void main(String[] args) {
        String curfile = "Hello.txt";
        boolean success = (new File(curfile)).setReadOnly();
        if (success) {
            System.out.println(curfile + " is set to read only");
        }
    }
}