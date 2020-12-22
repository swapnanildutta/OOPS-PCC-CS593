public class Ass6Q1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        MyThread t = new MyThread("New Thread1");
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println(Thread.currentThread().getName() + " ended");
        }
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        System.out.println(name + " Started");
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