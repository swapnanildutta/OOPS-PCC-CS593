//package mycollections;

//User defined thread
class CustomThread extends Thread {
    public CustomThread(String name) {
        super(name);
        System.out.println(name + " tarted");
        start();
    } 
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running..");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                 System.out.println(ex);
            }
        }
        System.out.println(Thread.currentThread().getName() + " ended");
    }    
}
public class MultiThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        CustomThread t1 = new CustomThread("1st");
        CustomThread t2 = new CustomThread("2nd");
        CustomThread t3 = new CustomThread("3rd");
        CustomThread t4 = new CustomThread("4th");
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        }
        catch (InterruptedException ex) {
                 System.out.println(ex);
        }
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}
