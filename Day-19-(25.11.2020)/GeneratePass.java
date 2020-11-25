import java.io.*;

public class GeneratePass {
    public static void main(String[] args) throws IOException {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        String str, roll;
        System.out.println("Enter your Full Name: ");
        str = in.readLine();
        System.out.println("Enter Your Roll No (Enter University Roll Number): ");
        roll = in.readLine();
        String pass = "";
        for (String s : str.split(" ")) {
            pass += s.charAt(0);
        }
        pass += roll.substring(roll.length() - 4);
        System.out.println("Password- " + pass);
    }
}