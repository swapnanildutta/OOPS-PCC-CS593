public class MainThread {

    public static void main(String[] args) {
        // Returns a reference to the currently executing thread object
        Thread t = Thread.currentThread();

        // Returns this thread's name
        System.out.println("Thread name : " + t.getName());

        // Changes the name of this thread to be equal to the argument name
        t.setName("Main Thread");

        System.out.println("Modified Thread name : " + t.getName());
    }
}
