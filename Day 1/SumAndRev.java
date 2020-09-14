class Operations {
    int reverse(int n) {
        int rev = 0;
        int copy = n;
        while (copy != 0) {
            rev = rev * 10 + (copy % 10);
            copy /= 10;
        }
        return rev;
    }
    int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
public class SumAndRev{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Operations obj = new Operations();
        System.out.println("Reverse: " + obj.reverse(n));
        System.out.println("Sum: " + obj.sumOfDigits(n));
    }
}