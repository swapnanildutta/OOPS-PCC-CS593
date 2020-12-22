public class Ass6Q2 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        MyRunnable ob = new MyRunnable("New Thread");
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

class MyRunnable implements Runnable {
    public MyRunnable(String name) {
        Thread t = new Thread(this, name);
        System.out.println(name + " Started");
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