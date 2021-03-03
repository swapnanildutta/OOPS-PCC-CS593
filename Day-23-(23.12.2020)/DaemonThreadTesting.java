class WorkerThread extends Thread {
    boolean isDeamon;

    WorkerThread(boolean isDeamon) {
        // When false, (i.e. when it's a user thread),
        // the Worker thread continues to run.
        // When true, (i.e. when it's a daemon thread),
        // the Worker thread terminates when the main
        // thread terminates.
        this.isDeamon = isDeamon;
        setDaemon(isDeamon);
    }

    public void run() {
        System.out.println("I am a " + (isDeamon ? "Daemon Thread" : "User Thread (non-daemon)"));

        for (int count = 1; count <= 5; count++) {
            System.out.println("\tworking from Worker thread: " + count);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // handle exception here
            } finally {
                System.out.println("\tfinally executed " + count);
            }
        }
        System.out.println("\tWorker thread ends. ");
    }

}

public class DaemonThreadTesting {

    public static void main(String[] args) {

        new WorkerThread(true).start();// set it to true & false and run twice.
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            // handle here exception
        }
        System.out.println("Main Thread ending");
    }
}