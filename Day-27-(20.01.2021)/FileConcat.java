import java.io.*;

public class FileConcat {
    public static void main(String[] args) {
        File file = null, file1 = null, file2 = null;
        FileInputStream fis = null, fis1 = null;
        FileOutputStream fos = null;
        try {
            file = new File("output1.txt");
            file1 = new File("output.txt");
            file2 = new File("output2.txt");
            fis = new FileInputStream(file);
            fis1 = new FileInputStream(file1);
            fos = new FileOutputStream(file2);
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }
            fis.close();
            while ((ch = fis1.read()) != -1) {
                fos.write(ch);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fis1.close();
                fos.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}