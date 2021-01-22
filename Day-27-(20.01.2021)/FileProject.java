import java.io.File;
import java.io.IOException;

public class FileProject {

    public static void main(String[] args) {
        File f = null;

        try {
            f = new File("myfile.txt");

            if (!f.exists()) {
                f.createNewFile();
                System.out.println("New file \"myfile.txt\" has been created in the current directory");
                System.out.println("The absolute path of the file is: " + f.getAbsolutePath());
            } else {
                System.out.println("File \"myfile.txt\" already exists");
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
