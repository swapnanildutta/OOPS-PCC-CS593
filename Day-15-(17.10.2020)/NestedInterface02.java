package nestedtesting;

interface M {
    void m();
    
    interface N {
        void n();
    }
}

public class NestedInterface02 implements M.N {

    @Override
    public void n() {
        System.out.println("interface within interface");
    }
    
    public static void main(String[] args) {
        M.N t = new NestedInterface02();
        t.n();
    }    
}
