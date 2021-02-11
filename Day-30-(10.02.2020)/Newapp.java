// A enumeration or enum in Java denotes a list of named constants. 
// It is compared to classes & interfaces and added in Java since JSE 5.
// Every constant in enum is public, static & final by default.
// It can have instance variables, methods & constructor.
// All enums implicitly extend java.lang.Enum class.
// An enum can be created using "enum" keyrord.

enum Card {
    CLUB, DIAMOND, HEART, SPADE;
}

class CardConstants {
    static final int CLUB = 1;
    static final int DIAMOND = 2;
    static final int HEART = 3;
    static final int SPADE = 4;
}

public class Newapp {

    public static void main(String[] args) {
        // Enum values are fixed
        System.out.println("Testing enum Card..");
        testEnum(Card.CLUB);
        testEnum(Card.HEART);

        System.out.println("\nTesting classes");
        testClass(3);
        // any int constant can be passed
        testClass(7);
    }

    private static void testEnum(Card c) {
        if (c == Card.CLUB)
            System.out.println("CLUB");
        else if (c == Card.DIAMOND)
            System.out.println("DIAMOND");
        else if (c == Card.HEART)
            System.out.println("HEART");
        else
            System.out.println("SPADE");
    }

    private static void testClass(int c) {
        if (c == CardConstants.CLUB)
            System.out.println("CLUB");
        else if (c == CardConstants.DIAMOND)
            System.out.println("DIAMOND");
        else if (c == CardConstants.HEART)
            System.out.println("HEART");
        else
            System.out.println("SPADE");
    }
}
