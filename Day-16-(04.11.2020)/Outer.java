/**
 * Outer class
 */
class Outer {
    String name = "Miss Dawson Homenick";

    /**
     * Inner Class
     */
    void show() {
        System.out.println("This is the outer class");
        System.out.println("Name : " + name);
    }

    public class Inner {
        String occupation = "Executive";

        void display() {
            System.out.println("This is the inner class");
            show();
            System.out.println("Occupation :" + occupation);
        }
    }

    public static void main(String[] args) {
        new Outer().show();
        new Outer().new Inner().display();
        // new Outer().display(); ! Shows error
    }
}