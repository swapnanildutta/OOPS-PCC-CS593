interface Shape {
    final double pi = 3.14; //by default: public, final, static
    double compArea(double l, double b); //by default: public, abstract
    static void showPi() { System.out.println("PI = " + Figure.pi); } //new concept : static method
}
class Rectangle implements Shape {
    @Override
    public double compArea(double l, double b) {
        return l*b;
    }    
}
class Circle implements Shape {
    @Override
    public double compArea(double l, double b) {
        return pi*l*l;
    }    
}

public class InterfaceTest {
    public static void main(String[] args) {
        Shape.showPi();
        Shape s = new Rectangle();
        System.out.println("AREA1 = " + s.compArea(20, 10));
        s = new Circle();
        System.out.println("AREA2 = " + s.compArea(14, 0));
    }
}