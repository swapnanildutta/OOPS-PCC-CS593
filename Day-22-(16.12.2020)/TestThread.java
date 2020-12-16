//package com.mycompany.threadexpt;

class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
        System.out.println(name + " started");
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running..");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);;
            }
        }
        System.out.println(Thread.currentThread().getName() + " ended");
    }    
    
}

public class TestThread {
    
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " started");
        MyThread t = new MyThread("MyThread");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running..");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex);;
            }
        }
        System.out.println(Thread.currentThread().getName() + " ended");
    }
}
