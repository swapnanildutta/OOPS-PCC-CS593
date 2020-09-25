public class ToPaisa {
    public static void main(String[] args) {
        double price = Double.parseDouble(args[0]);
        System.out.println("Price: " + (int) (price * 100) +" Paise");
    }
}