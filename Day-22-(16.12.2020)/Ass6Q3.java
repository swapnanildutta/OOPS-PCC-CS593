public class Ass6Q3 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        MyThread1 t1 = new MyThread1("Thread1", 2);
        MyThread1 t2 = new MyThread1("Thread2", 4);
        MyThread1 t3 = new MyThread1("Thread3", 1);
        MyThread1 t4 = new MyThread1("Thread4", 5);
        MyThread1 t5 = new MyThread1("Thread5", 3);
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}

class MyThread1 extends Thread {
    public MyThread1(String name, int pr) {
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
            System.out.println(Thread.currentThread().getName() + " ended");
        }
        return;
    }
}