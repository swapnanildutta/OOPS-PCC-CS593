import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException {
        File f = new File("test.txt");
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
        dos.writeInt(2019);
        dos.writeBoolean(true);
        dos.writeChar('S');
        dos.writeDouble(99.95);
        dos.close();
        DataInputStream dis = new DataInputStream(new FileInputStream(f));
        System.out.println(dis.readInt());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        System.out.println(dis.readDouble());
        dis.close();
    }
}