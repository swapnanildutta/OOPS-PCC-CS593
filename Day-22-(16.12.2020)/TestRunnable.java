class MyRunnable implements Runnable {

    public MyRunnable(String name) {
        Thread t = new Thread(this, name);
        System.out.println(name + " started");
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running..");
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

public class TestRunnable {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        MyRunnable t = new MyRunnable("MyRunnable");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running..");
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
