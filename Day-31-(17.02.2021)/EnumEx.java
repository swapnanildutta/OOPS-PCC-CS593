public class EnumEx {
    public static void main(String[] args) {
        System.out.println("All months in a year:~ ");
        for (Months m : Months.values()) {
            System.out.println(m + " is number " + m.getNumber() + " month and has index-" + m.ordinal() + ".");
        }
        Months m1 = Months.valueOf("OCTOBER");
        System.out.print(m1);
    }
}

enum Months {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10),
    NOVEMBER(11), DECEMBER(12);

    private int number;

    Months(int n) {
        number = n;
    }

    public int getNumber() {
        return number;
    }
}