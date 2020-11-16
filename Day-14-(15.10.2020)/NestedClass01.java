package nestedtest;

//Top-level class
class Outer { 
    private int outer_x = 100; //private instance field
    private void msg() { System.out.println("hello"); } //private instance method
    
    //Member inner class (i.e. non-static nested class / inner class)
    class Inner { 
        int inner_y = 50; //instance field        
        void show() { //instance method
            System.out.println("outer_x: " + outer_x);
            msg();
        }
    }     
    public void test() { //public instance method
        Inner in = new Inner();
        System.out.println("inner_y: " + in.inner_y);
    }
}

public class NestedClass01 {
     public static void main(String[] args) {
        Outer ob = new Outer();
        ob.test();
        //Outer.Inner obj = new Outer().new Inner();
        Outer.Inner obj = ob.new Inner();
        obj.show();
    }
}
