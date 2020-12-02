import java.io.*;

public class AlphaRemove {
    String deleteMe(String str, int m) {
        String s1, s2;
        int len = str.length();
        if (m > len)
            return ("invalid");
        else {
            s1 = str.substring(0, m - 1);
            s2 = str.substring(m);
            return (s1 + s2);
            // System.out.print("Your Updated String is " + s1 + s2);
        }
    }

    public static void main(String args[]) {
        AlphaRemove ob = new AlphaRemove();
        String str, s, r;
        int m;

        try {
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter String : ");
            str = obj.readLine();
            System.out.print("Enter character position which you want to delete : ");
            s = obj.readLine();
            m = Integer.parseInt(s);
            r = ob.deleteMe(str, m);
            if (r.equals("invalid"))
                System.out.println("Invalid");
            else
                System.out.println("Your Updated String is  " + r);
        } catch (Exception e) {
        }
    }
}
