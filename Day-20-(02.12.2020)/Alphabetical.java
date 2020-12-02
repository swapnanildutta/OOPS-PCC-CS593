import java.util.*;

public class Alphabetical {
    public static void main(String[] args) {
        char chr;
        System.out.println("Enter a String :");
        String str = new Scanner(System.in).next();
        int l = str.length();
        System.out.println("The words in Alphabetical Order :");
        for (int i = 65; i <= 90; i++) {
            for (int j = 0; j < l; j++) {
                chr = str.charAt(j);
                if (chr == (char) (i) || chr == (char) (i + 32))
                    System.out.print(chr);
            }
        }
    }
}
