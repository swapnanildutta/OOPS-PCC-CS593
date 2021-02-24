import java.io.*;

public class EnumEx {
    public static void main(String[] args) throws IOException {
        System.out.println("All days of a week:- ");
        for (Week w : Week.values()) {
            System.out.println(w + " is number " + w.getVal() + " Day and has index-" + w.ordinal() + ".");
        }
        System.out.println("Enter a week of the day-");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        Week w1 = Week.valueOf(str);
        System.out.print(w1);
    }
}

enum Week {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private int val;

    Week(int n) {
        this.val = n;
    }

    public int getVal() {
        return val;
    }
}