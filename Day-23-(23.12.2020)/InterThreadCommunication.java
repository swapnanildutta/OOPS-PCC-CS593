class Share {
    int data = 0; // instance field

    synchronized void write() {
        System.out.println(Thread.currentThread().getName() + " starting");
        try {
            Thread.sleep(1000); // pauses for 1 sec
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        data = 10; // updating the instance field
        notify(); // signals the Reader thtead
        System.out.println(Thread.currentThread().getName() + " ending");
    }

    synchronized int read() {
        System.out.println(Thread.currentThread().getName() + " starting");
        try {
            wait(); // Reader thtead releases the lock
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println(Thread.currentThread().getName() + " ending");
        return data;
    }
}

class Writer extends Thread {
    Share sh;

    public Writer(Share sh, String name) {
        super(name);
        this.sh = sh;
        start();
    }

    @Override
    public void run() {
        sh.write();
    }
}

class Reader extends Thread {
    Share sh;

    public Reader(Share sh, String name) {
        super(name);
        this.sh = sh;
        start();
    }

    @Override
    public void run() {
        System.out.println("Result: " + sh.read());
    }
}

public class InterThreadCommunication {

    public static void main(String[] args) {
        Share sh = new Share();
        Reader ob1 = new Reader(sh, "Reader");
        Writer ob2 = new Writer(sh, "Writer");
    }
}
