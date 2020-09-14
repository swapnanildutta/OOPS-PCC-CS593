public class SumOfSeries {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double series = 0.0;
        for (int i = 1; i <= n; i++)
            series += 1.0 / i;
        System.out.println("Series: " + String.format("%.2f", series));
    }
}