import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//append data to an existing file
public class File17 {

    public static void main(String[] args) throws IOException {
        try {
            // Create file 
            FileWriter fstream = new FileWriter("output.txt", true);
            BufferedWriter out = new BufferedWriter(fstream);
            out.write("Hello Java");
            //Close the output stream
            out.close();
        } 
        catch (Exception e) {//Catch exception if any
            System.err.println("Error: " + e.getMessage());
        }
    }

}
