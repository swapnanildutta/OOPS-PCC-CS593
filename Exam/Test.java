/*
    Name: Swapnanil Dutta
    Roll: 16900218012
    Question: 12 A
*/
class Test1 {
    public Test1() {
        throw new ArithmeticException();
    }
}

public class Test extends Test1 {
    public Test() throws ArithmeticException {
        try {
            super(); // The ERROR is the answer itself.
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public static void main(String[] args) {
        try {
            Test ob = new Test();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}