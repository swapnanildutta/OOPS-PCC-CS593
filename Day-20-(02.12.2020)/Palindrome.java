import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        char chr;
        String str1, str2;
        System.out.println("Enter the Word");
        str1 = new Scanner(System.in).next();
        str2 = "";
        int l = str1.length();
        for (int i = l - 1; i >= 0; i--) {
            chr = str1.charAt(i);
            str2 = str2 + chr;
        }
        if (str1.equalsIgnoreCase(str2))
            System.out.print("Palindrome");
        else
            System.out.print("Not Palindrome");
    }
}
