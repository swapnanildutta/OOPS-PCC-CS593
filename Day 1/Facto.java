public class Facto {
    public static int facto(int n) {
        if (n == 0)
            return 1;
        return n * facto(n - 1);
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Factorial: " + facto(n));
    }
}