package threadexpt;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class UserThread implements Runnable {
    private String msg;

    public UserThread(String s) {
        this.msg = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " Starting. Message = " + msg);
        doWork();
        System.out.println(Thread.currentThread().getName()+ " Ending.");
    }

    private void doWork() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString(){
        return this.msg;
    }

}

public class ThreadPoolExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(7);
        for (int i = 0; i < 10; i++) {
            Runnable user = new UserThread("" + i);
            executor.execute(user);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("\nAll threads are finished..");
    }
}