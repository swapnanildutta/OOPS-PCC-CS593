public class TempConvert{
    public static void main(String[] args) {
        double fahrenheit = Double.parseDouble(args[0]);
        double celcius = (fahrenheit - 32) / 1.8;
        System.out.println("Celcius: " + celcius);
    }
}