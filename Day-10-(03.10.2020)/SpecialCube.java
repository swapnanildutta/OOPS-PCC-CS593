package gv;

class Cube {
    int length, breadth, height;
    public int getVolume() {
        return (length * breadth * height);
    }
    Cube() {
        this(10, 10);
        System.out.println("Default Cube Constructor");
    }
    Cube(int l, int b) {
        this(l, b, 10);
        System.out.println("Cube Constructor having 2 parameters");
    }
    Cube(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
        System.out.println("Cube Constructor having 3 parameters");
    }
}

public class SpecialCube extends Cube {
    int weight;
    SpecialCube() {
        super();
        weight = 10;
    }
    SpecialCube(int l, int b) {
        this(l, b, 10);
        System.out.println("SpecialCube Constructor having 2 parameters");
    }
    SpecialCube(int l, int b, int h) {
        super(l, b, h);
        weight = 20;
        System.out.println("SpecialCube Constructor having 3 parameters");
    }
    public static void main(String[] args) {
        SpecialCube obj1 = new SpecialCube();
        System.out.println("Volume of SpecialCube1: " + obj1.getVolume());
        System.out.println("Weight of SpecialCube1: " + obj1.weight);
        System.out.println();
        SpecialCube obj2 = new SpecialCube(10, 20);
        System.out.println("Volume of SpecialCube2: " + obj2.getVolume());
        System.out.println("Weight of SpecialCube2: " + obj2.weight);
    }
}
