class AnonymousClass {
    void show() {
        System.out.println("Super class method");
    }
}

interface A1 {
    public AnonymousClass get();
}

class B1 implements A1 {
    public AnonymousClass get() {
        return new AnonymousClass() {
            void show() {
                System.out.println("Overridden method");
            }
        };
    }
}

class Ass4Q4 {
    public static void main(String[] args) {
        new B1().get().show();
    }
}