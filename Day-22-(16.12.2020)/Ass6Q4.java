public class Ass6Q4 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        MyRunnable1 t1 = new MyRunnable1("Thread1", 5);
        MyRunnable1 t2 = new MyRunnable1("Thread2", 1);
        MyRunnable1 t3 = new MyRunnable1("Thread3", 2);
        MyRunnable1 t4 = new MyRunnable1("Thread4", 4);
        MyRunnable1 t5 = new MyRunnable1("Thread5", 3);
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}

class MyRunnable1 implements Runnable {
    public MyRunnable1(String name, int pr) {
        Thread t = new Thread(this, name);
        System.out.println(name + " Started");
        t.setPriority(pr);
        t.start();
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