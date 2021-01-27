import java.io.File;

//Getting the Parent & Current Directory and Creating Directories
public class File11 {
    
    private static void dirList(String fname) {
        File dir = new File(fname);
        String parentpath = dir.getParent();
        System.out.println("Current Directory : " + dir);
        System.out.println("Parent Directory : " + parentpath);
    }
   
    public static void main(String[] args) {
        String currentdir = System.getProperty("user.dir");
        dirList(currentdir);

        //creating a directory and sub-directories
        try {
            String strDirectoy = "sample";
            String strManyDirectories = "dir1/dir2/dir3";
           
            // Create one directory
            boolean success = (new File(strDirectoy)).mkdir();
            if (success) {
                System.out.println("Directory: " + strDirectoy + " created");
            }
            // Create multiple directories
            success = (new File(strManyDirectories)).mkdirs();
            if (success) {
                System.out.println("Directories: " + strManyDirectories + " created");
            }

        } 
        catch (Exception e) { //Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }
}
