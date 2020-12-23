class Shared {
    synchronized void doWork() {
        System.out.println(Thread.currentThread().getName() + " Started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(Thread.currentThread().getName() + " Ended");
    }
}

class MyThreading extends Thread {
    Shared sh;

    public MyThreading(Shared sh, String name) {
        super(name);
        this.sh = sh;
        start();
    }

    public void run() {
        // synchronized(sh)//puts a lock on sh, so that the resource is freed only when
        // the process is finished
        // {
        sh.doWork();
        // }
    }
}

public class SynchronizeEx {
    public static void main(String[] args) {
        Shared sh = new Shared();
        MyThreading t1 = new MyThreading(sh, "Thread1");
        MyThreading t2 = new MyThreading(sh, "Thread2");
        MyThreading t3 = new MyThreading(sh, "Thread3");
        MyThreading t4 = new MyThreading(sh, "Thread4");
    }
}