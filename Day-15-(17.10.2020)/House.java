package outputtest;

class Building {
    Building() { System.out.print("b "); }
    Building(String name) {
        this(); System.out.print("bn " + name);
    }
}
public class House extends Building {
    House() { 
        //super("s "); 
        System.out.print("h "); 
    }
    House(String name) {
        this(); System.out.print("hn " + name);
    }
    public static void main(String[] args) { new House("x "); }
}
