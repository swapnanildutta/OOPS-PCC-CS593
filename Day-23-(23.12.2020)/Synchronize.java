//package mycollections;

class Shared {
    synchronized void doWork() { // synchronized method (2)
        System.out.println(Thread.currentThread().getName() + " started");
        try {
            Thread.sleep(1000); // pause the thread for 1 sec
        } catch (InterruptedException ex) {
            System.out.println(ex);
            ;
        }
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}

class MyThreading extends Thread {
    Shared sh; // instance variable

    public MyThreading(Shared sh, String name) {
        super(name);
        this.sh = sh;
        start();
    }

    @Override
    public void run() {
        // synchronized(sh) { //synchronized block (1)
        sh.doWork();
        // }
    }
}

public class Synchronize {
    public static void main(String[] args) {
        Shared sh = new Shared();
        MyThreading t1 = new MyThreading(sh, "1st");
        MyThreading t2 = new MyThreading(sh, "2nd");
        MyThreading t3 = new MyThreading(sh, "3rd");
        MyThreading t4 = new MyThreading(sh, "4th");
    }
}
