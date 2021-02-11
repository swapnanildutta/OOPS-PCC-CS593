enum Months {
    JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6), JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10),
    NOVEMBER(11), DECEMBER(12);

    private int number; // field showing number of each month

    // Constructor of enum Months
    Months(int n) {
        number = n;
    }

    // Returns the number of month
    int getNumber() {
        return number;
    }

}

public class EnumTest03 {

    public static void main(String[] args) {
        System.out.println("All months in a year:~ ");
        for (Months m : Months.values()) {
            System.out.println(m + " is number " + m.getNumber() + " month.");
        }
        System.out.println();
    }

}
