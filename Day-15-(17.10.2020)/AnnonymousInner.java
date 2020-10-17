package nestedtesting;

//Domonstration of anonymous inner class
class Father { //superclass
    int x = 10;
    void show() { }
}

class Any { //outer class
    Father p = new Father() { //anonymous inner class  
        @Override
        void show() { 
            x = 20;
            System.out.println("show() method overidden: ");                
        }           
    };   
}

public class AnnonymousInner {
    public static void main(String[] args) {
        Any an = new Any();
        an.p.show();
    }
}
