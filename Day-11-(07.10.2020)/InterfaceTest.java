interface Figure {
    double pi = 3.14; //by default: public, final, static
    double compArea(double l, double b); //by default: public, abstract
    static void showPi() { System.out.println("PI = " + Figure.pi); } //new concept : static method
    default int cube(int x) { return x*x*x; } //new concept : default method
}
class Rect implements Figure {
    @Override
    public double compArea(double l, double b) {
        return l*b;
    }    
}
class Circ implements Figure {
    @Override
    public double compArea(double l, double b) {
        return pi*l*l;
    }    
}

public class InterfaceTest {
    public static void main(String[] args) {
        //Figure.pi = 2.59;
        Figure.showPi();
        Figure f = new Rect();
        System.out.println("CUBE = " + f.cube(5));
        System.out.println("AREA1 = " + f.compArea(20, 10));
        f = new Circ();
        System.out.println("AREA2 = " + f.compArea(14, 0));
    }
}
