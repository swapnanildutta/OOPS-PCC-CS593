package nestedtesting;
//Domonstration of anonymous inner class
class Parent { //superclass
    void show() { }
}
class Another { //outer class
    Parent get() {
        return new Parent() //anonymous inner class //Parent p = new Parent()
        {
            @Override
            void show() { 
                System.out.println("show() method overidden: ");      
                disp();
            } 
            void disp() {
                System.out.println("hello");
            }
        };
    }
}

public class NestedClass04 {
    public static void main(String[] args) {
        Another an = new Another();
        an.get().show();
        //an.p.show();
    }
}
