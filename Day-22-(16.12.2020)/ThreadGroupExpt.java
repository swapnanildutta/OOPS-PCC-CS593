package mycollections;

class UserThread extends Thread {      
    UserThread(ThreadGroup group, String name) {
        super(group, name);
        start();
    }
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " starting.");
        System.out.println();
        try {
            Thread.sleep(1000);
        } 
        catch (InterruptedException e) {  }
        System.out.println(t.getName() + " ending.");
    }
}

public class ThreadGroupExpt {

    public static void main(String[] args) {
        //creating thread groups
        ThreadGroup tg = new ThreadGroup("Parent");
        ThreadGroup tgc = new ThreadGroup(tg, "Child1");
        ThreadGroup tgd = new ThreadGroup(tg, "Child2");
        ThreadGroup tge = new ThreadGroup(tg, "Child3");
        
        //adding threads to thread groups
        UserThread t1 = new UserThread(tg, "1st");
        UserThread t2 = new UserThread(tg, "2nd");
        UserThread t3 = new UserThread(tgc, "3rd");
        UserThread t4 = new UserThread(tgc, "4th");
        UserThread t5 = new UserThread(tgd, "5th");
        UserThread t6 = new UserThread(tgd, "6th");
        UserThread t7 = new UserThread(tge, "7th");
        UserThread t8 = new UserThread(tge, "8th");

        System.out.println("Number of active threads: " + tg.activeCount());
        tg.list();
        System.out.println("\nNumber of active thread groups: " + tg.activeGroupCount()); 
    }
}