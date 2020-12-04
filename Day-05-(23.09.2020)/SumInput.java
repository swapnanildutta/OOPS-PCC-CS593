import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CommandLineArguments {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("Sum is " + (a + b));
    }
}

class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum is " + (a + b));
        sc.close();
    }
}

class BufferReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(buf.readLine());
        int b = Integer.parseInt(buf.readLine());
        System.out.println("Sum is " + (a + b));
    }
}