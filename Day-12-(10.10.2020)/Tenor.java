package gv;

public class Tenor extends Singer { //subclass
    public static String sing() {
        return "sub";
    }
    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }
}

class Singer { //superclass
    public static String sing() {
        return "super";
    }
}

