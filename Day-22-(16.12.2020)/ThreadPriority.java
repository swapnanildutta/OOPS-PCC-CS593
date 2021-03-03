class A extends Thread {
    public A() {
        System.out.println("Start Thread A");
        setPriority(Thread.MIN_PRIORITY); // priority of thread A is 1
        start();
    }

    public void run() {
        try {
            System.out.println("Thread A started");
            for (int i = 1; i <= 3; i++) {
                System.out.println("Thread A: Value of i = " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("End of Thread A");
    }
}

class B extends Thread {
    public B() {
        System.out.println("Start Thread B");
        setPriority(getPriority() + 1); // priority of thread B is 6
        start();
    }

    public void run() {
        try {
            System.out.println("Thread B started");
            for (int j = 1; j <= 3; j++) {
                System.out.println("Thread B: Value of j = " + j);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("End of Thread B");
    }
}

class C extends Thread {
    public C() {
        System.out.println("Start Thread C");
        setPriority(Thread.MAX_PRIORITY); // priority of thread C is 10
        start();
    }

    public void run() {
        try {
            System.out.println("Thread C started");
            for (int k = 1; k <= 3; k++) {
                System.out.println("Thread C: Value of k = " + k);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
        System.out.println("End of Thread C");
    }
}

public class ThreadPriority {
    public static void main(String s[]) {
        A a = new A();
        B b = new B();
        C c = new C();
    }
}