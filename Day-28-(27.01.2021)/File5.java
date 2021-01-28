import java.io.File;

public class File5 {
    public static void main(String[] args) {
        String curfile = "Hello.txt";
        long l = (new File(curfile)).length();
        System.out.println("The size of " + curfile + " is " + l + " bytes");
    }
}