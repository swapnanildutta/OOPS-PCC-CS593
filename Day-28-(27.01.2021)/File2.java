import java.io.File;

public class File2 {
    public static void main(String[] args) {
        try {
            String strDirectoy = "sample";
            String strManyDirectories = "dir1/dir2/dir3";
            boolean success = (new File(strDirectoy)).mkdir();
            if (success) {
                System.out.println("Directory: " + strDirectoy + " created");
            }
            success = (new File(strManyDirectories)).mkdirs();
            if (success) {
                System.out.println("Directories: " + strManyDirectories + " created");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}