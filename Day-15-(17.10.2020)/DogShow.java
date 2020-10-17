package outputtest;

class Dog {
    public void bark() { System.out.print("woof "); }
}
class Hound extends Dog {
    public void sniff() { System.out.print("sniff "); }
    public void bark() { System.out.print("howl "); }
}
public class DogShow {
    public static void main(String[] args) { new DogShow().go(); }
    void go() {
        new Hound().bark();
        new Hound().sniff();
        ((Dog) new Hound()).bark();        
    }
}