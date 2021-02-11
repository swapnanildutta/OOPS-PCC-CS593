import java.util.Scanner;

enum Month {
    JANUARY, FEBRUARY, MARCH,
    APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER,
    OCTOBER, NOVEMBER, DECEMBER;
}

// Use of enum switch-case statements
public class EnumTest02 {
    Month month;

    // constructor
    public EnumTest02(Month month) {
        this.month = month;
    }
    
    // to know the season of month using switch-case 
    public void knowTheSeason() {
        System.out.println("\nThe method knowTheSeason() gets called..");
        switch(month) {
            case JANUARY:
            case FEBRUARY:
                System.out.println(month + " belongs to Winter Season.");
                break;
                
            case MARCH:
            case APRIL:
                System.out.println(month + " belongs to Spring Season.");
                break;
                
            case MAY:
            case JUNE:
                System.out.println(month + " belongs to Summer Season.");
                break;
                
            case JULY:
            case AUGUST:
                System.out.println(month + " belongs to Rainy Season.");
                break;
                
            case SEPTEMBER:
            case OCTOBER:
                System.out.println(month + " belongs to Autumn Season.");
                break;
                
            default:
                System.out.println(month + " belongs to Pre-Winter Season.");
                break;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Months in a calendar year are:~ ");
        for (Month m : Month.values()) {
            System.out.print(m + " ");
        }
        System.out.println();
        
        System.out.println("\nEnter the month name (in caps): ");
        String str = sc.next();
        
        EnumTest02 et = new EnumTest02(Month.valueOf(str));
        et.knowTheSeason();
    }
    
}
