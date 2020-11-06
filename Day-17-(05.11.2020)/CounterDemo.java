class Counter {
    int i = 0;

    Counter incr() {
        i++;
        return this;
    }

    void print() {
        System.out.println("i= " + i);
    }
}

public class CounterDemo {
    public static void main(String[] args) {
        Counter x = new Counter();
        x.incr().incr().incr().print();
    }
}
