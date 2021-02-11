enum Cards {
    CLUB, DIAMOND, HEART, SPADE;
}

public class EnumTest01 {
    
    public static void main(String[] args) {
        Cards card = Cards.HEART;
        
        if(card==Cards.CLUB) System.out.println("CLUB");
        else if(card==Cards.DIAMOND) System.out.println("DIAMOND");
        else if(card==Cards.HEART) System.out.println("HEART");
        else System.out.println("SPADE");
        
        System.out.println(card + " is at index: " + card.ordinal());  //2
        System.out.println("Another value: " + Cards.valueOf("SPADE")); //SPADE
      
        //enum iteration
        System.out.println("\nCard suits are..");
        for (Cards c : Cards.values()) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
    
}
