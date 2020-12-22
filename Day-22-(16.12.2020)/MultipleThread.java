package mycollections;

class CustomThreading implements Runnable {
    Thread t; //instance variable
    public CustomThreading(String name) {
        t = new Thread(this, name); //ThreadGroup
        System.out.println(t + " started");
        t.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println(t + " is running..");
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException ex) { System.out.println(ex); }
        }
        System.out.println(t + " ended");
    }    
}

public class MultipleThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        
        CustomThreading t1 = new CustomThreading("1st"); 
        CustomThreading t2 = new CustomThreading("2nd");
        CustomThreading t3 = new CustomThreading("3rd");
        CustomThreading t4 = new CustomThreading("4th");
        
        System.out.println("Is t1 alive? : " + t1.t.isAlive());
        
        try {
                t1.t.join();
                t2.t.join();
                t3.t.join();
                t4.t.join();
        }
        catch(InterruptedException ex) { System.out.println(ex); }
        
        System.out.println("Is t1 alive? : " + t1.t.isAlive());
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}
