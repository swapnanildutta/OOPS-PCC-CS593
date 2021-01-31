import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;

//Generating tokens of a Stream using StreamTokenizer class
public class File13 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter a Java file name: ");
        String filename = in.readLine();

        if (!filename.endsWith(".java")) {
            System.out.println("This is not a Java file.");
            System.exit(0);
        }
        File javaFile = new File(filename);

        if (javaFile.exists()) {
            FileReader file = new FileReader(filename);
            StreamTokenizer streamTokenizer = new StreamTokenizer(file);
            // It will go through the file and gives the number of tokens in the file
            int i = 0;
            int token_count = 0;

            // TT_EOF is a constant indicating that the end of the stream has been read
            while (i != StreamTokenizer.TT_EOF) {

                i = streamTokenizer.nextToken(); // This method parses the next token from the input stream of this
                                                 // tokenizer
                token_count++;
            }
            System.out.println("Number of tokens = " + token_count);
        } else {
            System.out.println("File does not exist!");
            System.exit(0);
        }
    }
}
