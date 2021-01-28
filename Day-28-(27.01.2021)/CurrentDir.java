import java.io.File;

public class CurrentDir {
    private static void dirList(String fname) {
        File dir = new File(fname);
        String parentpath = dir.getParent();
        System.out.println("Current Directory : " + dir);
        System.out.println("Parent Directory : " + parentpath);
    }

    public static void main(String[] args) {
        String currentdir = System.getProperty("user.dir");
        dirList(currentdir);
    }
}