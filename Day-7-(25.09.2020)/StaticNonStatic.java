public class StaticNonStatic {
    int id;
    static String name = "Static Non-static";

    StaticNonStatic(int id) {
        this.id = id;
    }

    public String toString() {
        return "id = " + this.id + " name = " + StaticNonStatic.name;
    }

    public static void main(String[] args) {
        StaticNonStatic obj1 = new StaticNonStatic(12);
        StaticNonStatic obj2 = new StaticNonStatic(13);
        System.out.println("OBJ1 = " + obj1);
        System.out.println("OBJ2 = " + obj2);
    }
}