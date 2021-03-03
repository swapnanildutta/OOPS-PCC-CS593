public class ThreaTestDeadlock {

    public static Object object1 = new Object();
    public static Object object2 = new Object();

    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
    }

    private static class Thread1 extends Thread {

        Thread1() {
            System.out.println("Thread1 started..");
            start();
        }

        public void run() {
            synchronized (object1) {
                System.out.println("Thread 1: Holding object 1...");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Exception: " + e);
                }
                System.out.println("Thread 1: Waiting for object 2...");

                synchronized (object2) {
                    System.out.println("Thread 1: Holding objects 1 & 2...");
                }
            }
            System.out.println("Thread1 ended..");
        }
    }

    private static class Thread2 extends Thread {

        Thread2() {
            System.out.println("Thread2 started..");
            start();
        }

        public void run() {
            synchronized (object2) {
                System.out.println("Thread 2: Holding object 2...");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Exception: " + e);
                }
                System.out.println("Thread 2: Waiting for object 1...");

                synchronized (object1) {
                    System.out.println("Thread 2: Holding objects 1 & 2...");
                }
            }
            System.out.println("Thread2 ended..");
        }
    }

}