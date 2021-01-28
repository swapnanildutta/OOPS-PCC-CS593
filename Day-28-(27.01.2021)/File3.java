import java.io.File;

public class File3 {
    public static void main(String[] args) {
        String strDirectory = "sample";
        boolean success = (new File(strDirectory)).renameTo(new File("sample_edited1"));
        if (success) {
            System.out.println("sample renamed to sample_edit");
        }
    }
}