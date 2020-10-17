package nestedtesting;

public class NestedTesting {
   //instance initializer block
   {
        class Abc { //local inner class
            void show() {
                System.out.println("hello");
            }
        }
        new Abc().show();
   }
   public static void main(String[] args) {
        new NestedTesting();
        new Thread() { //anonymous inner class
            @Override
            public void run() {
                System.out.println("hello from thread");
            }            
        }.start();
    }      
}
/*
1. WAP to embed an interface within a class.   
2. WAP to embed a class within an interface.
3. WAP to embed an interface within another interface.
*/