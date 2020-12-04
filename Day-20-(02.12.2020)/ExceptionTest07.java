//Custom Exception
class TempHotException extends Exception { // checked exception
    double temp;

    public TempHotException(double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "TempHotException{" + "temp=" + temp + '}';
    }
}

public class ExceptionTest07 {
    public static void main(String[] args) {
        try {
            check(23.6);
            check(33.2);
            check(39.5);
        } catch (TempHotException ex) {
            System.out.println("Caught : " + ex);
        }
    }

    static void check(double d) throws TempHotException {
        if (d > 35.0)
            throw new TempHotException(d);
        else
            System.out.println("It's OK.");
    }
}
