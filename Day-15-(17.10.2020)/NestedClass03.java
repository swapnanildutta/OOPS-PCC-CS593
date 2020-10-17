package nestedtesting;

//Domonstration of local inner class
class First {
    private int x = 10;
    void test() {
        for (int i = 0; i < 5; i++) {
            //local inner class 1
            class Second {
                void show() {
                    System.out.println("x = " + x);
                }
            }
            //local inner class 2
            class Third {
                void msg() {
                    System.out.println("hello");
                }
            }
            new Second().show();
            new Third().msg();
        }
    }
}
public class NestedClass03 {
    public static void main(String[] args) {
        First f = new First();
        f.test();
    }
}
