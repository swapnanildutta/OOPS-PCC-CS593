public class Ass6Q5 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        MyRunnable2 t1 = new MyRunnable2("Thread1", 5);
        MyRunnable2 t2 = new MyRunnable2("Thread2", 1);
        MyRunnable2 t3 = new MyRunnable2("Thread3", 2);
        MyRunnable2 t4 = new MyRunnable2("Thread4", 4);
        MyRunnable2 t5 = new MyRunnable2("Thread5", 3);
        System.out.println("Thread1 is Alive-" + t1.isAlive());
        System.out.println("Thread2 is Alive-" + t2.isAlive());
        System.out.println("Thread3 is Alive-" + t3.isAlive());
        System.out.println("Thread4 is Alive-" + t4.isAlive());
        System.out.println("Thread5 is Alive-" + t5.isAlive());
        System.out.println("Main is Alive-" + Thread.currentThread().isAlive());
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        System.out.println("Thread1 is Alive-" + t1.isAlive());
        System.out.println("Thread2 is Alive-" + t2.isAlive());
        System.out.println("Thread3 is Alive-" + t3.isAlive());
        System.out.println("Thread4 is Alive-" + t4.isAlive());
        System.out.println("Thread5 is Alive-" + t5.isAlive());
        System.out.println("Main is Alive-" + Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}

class MyRunnable2 extends Thread {
    public MyRunnable2(String name, int pr) {
        super(name);
        System.out.println(name + " Started");
        this.setPriority(pr);
        start();
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
                ;
            }
        }
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}