package gv;

class Top {
    Top() { }
    Top(String s) {
        System.out.print("B");
    }	
}

public class Bottom2 extends Top {
    Bottom2(String s) {
        super("Z");
        System.out.print("D");
    }
    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}

